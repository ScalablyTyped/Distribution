package typings.yogLog

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import typings.yogLog.yogLogBooleans.`false`
import typings.yogLog.yogLogNumbers.`-1`
import typings.yogLog.yogLogNumbers.`0`
import typings.yogLog.yogLogNumbers.`16`
import typings.yogLog.yogLogNumbers.`1`
import typings.yogLog.yogLogStrings.ACCESS
import typings.yogLog.yogLogStrings.ACCESS_ERROR
import typings.yogLog.yogLogStrings.DEBUG
import typings.yogLog.yogLogStrings.FATAL
import typings.yogLog.yogLogStrings.NOTICE
import typings.yogLog.yogLogStrings.TRACE
import typings.yogLog.yogLogStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Any
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Any
  ]]
  inline def apply(config: LogConfig): js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Any
  ] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Any
  ]]
  
  @JSImport("yog-log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yog-log", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    def this(
      opts: LogConfig,
      req: Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ]
    ) = this()
    
    def debug(info: LogInput): Unit | `false` = js.native
    
    def extend(destination: js.Object, source: js.Object): js.Object = js.native
    
    def fatal(info: LogInput): Unit | `false` = js.native
    
    def getCookie(name: String): String | `false` = js.native
    
    def getLogFile(intLevel: LevelInt): String = js.native
    
    def getLogFormat(level: LevelName): String | `false` = js.native
    
    def getLogID(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      logIDName: String
    ): String = js.native
    
    def getLogLevelInt(level: LevelName): LevelInt | `-1` = js.native
    
    def getLogPrefix(): String = js.native
    
    def getLogString(format: String): String = js.native
    
    def getParams(name: String): String = js.native
    
    def log(level: String, obj: String): Unit | `false` = js.native
    def log(level: String, obj: js.Object): Unit | `false` = js.native
    
    def md5(data: String, len: Double): String = js.native
    def md5(data: Buffer, len: Double): String = js.native
    
    def notice(info: LogInput): Unit | `false` = js.native
    
    def parseCustomLog(obj: js.Object): Unit = js.native
    
    // 解析日志配置，生成相应的模板函数的字符串内容
    def parseFormat(format: String): String = js.native
    
    def parseReqParams(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]]
    ): Unit | `false` = js.native
    
    def parseStackInfo(info: js.Error): Unit = js.native
    def parseStackInfo(info: LogInfo): Unit = js.native
    
    def setParams(name: String, value: Any): Unit = js.native
    
    def trace(info: LogInput): Unit | `false` = js.native
    
    def warning(info: LogInput): Unit | `false` = js.native
    
    def writeLog(intLevel: LevelInt, options: WriteLogConfig, log_format: String): Unit | `false` = js.native
  }
  
  inline def getLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[Logger]
  inline def getLogger(config: LogConfig): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(config.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  trait LEVELS extends StObject {
    
    // 访问日志
    var `0`: ACCESS
    
    // 应用日志等级 ODP格式
    var `1`: FATAL
    
    var `16`: DEBUG
    
    var `2`: WARNING
    
    var `3`: ACCESS_ERROR
    
    var `4`: NOTICE
    
    var `8`: TRACE
  }
  object LEVELS {
    
    inline def apply(): LEVELS = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")("ACCESS")
      __obj.updateDynamic("1")("FATAL")
      __obj.updateDynamic("16")("DEBUG")
      __obj.updateDynamic("2")("WARNING")
      __obj.updateDynamic("3")("ACCESS_ERROR")
      __obj.updateDynamic("4")("NOTICE")
      __obj.updateDynamic("8")("TRACE")
      __obj.asInstanceOf[LEVELS]
    }
    
    extension [Self <: LEVELS](x: Self) {
      
      inline def set0(value: ACCESS): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: FATAL): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set16(value: DEBUG): Self = StObject.set(x, "16", value.asInstanceOf[js.Any])
      
      inline def set2(value: WARNING): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set3(value: ACCESS_ERROR): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set4(value: NOTICE): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set8(value: TRACE): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.yogLog.yogLogStrings.`0`
    - typings.yogLog.yogLogStrings.`3`
    - typings.yogLog.yogLogStrings.`1`
    - typings.yogLog.yogLogStrings.`2`
    - typings.yogLog.yogLogStrings.`4`
    - typings.yogLog.yogLogStrings.`8`
    - typings.yogLog.yogLogStrings.`16`
    - typings.yogLog.yogLogNumbers.`0`
    - typings.yogLog.yogLogNumbers.`3`
    - typings.yogLog.yogLogNumbers.`1`
    - typings.yogLog.yogLogNumbers.`2`
    - typings.yogLog.yogLogNumbers.`4`
    - typings.yogLog.yogLogNumbers.`8`
    - typings.yogLog.yogLogNumbers.`16`
  */
  trait LevelInt extends StObject
  
  /* Inlined yog-log.yog-log.LEVELS[yog-log.yog-log.LevelInt] */
  /* Rewritten from type alias, can be one of: 
    - typings.yogLog.yogLogStrings.DEBUG
    - typings.yogLog.yogLogStrings.ACCESS_ERROR
    - typings.yogLog.yogLogStrings.FATAL
    - typings.yogLog.yogLogStrings.TRACE
    - typings.yogLog.yogLogStrings.ACCESS
    - typings.yogLog.yogLogStrings.WARNING
    - typings.yogLog.yogLogStrings.NOTICE
  */
  trait LevelName extends StObject
  object LevelName {
    
    inline def ACCESS: typings.yogLog.yogLogStrings.ACCESS = "ACCESS".asInstanceOf[typings.yogLog.yogLogStrings.ACCESS]
    
    inline def ACCESS_ERROR: typings.yogLog.yogLogStrings.ACCESS_ERROR = "ACCESS_ERROR".asInstanceOf[typings.yogLog.yogLogStrings.ACCESS_ERROR]
    
    inline def DEBUG: typings.yogLog.yogLogStrings.DEBUG = "DEBUG".asInstanceOf[typings.yogLog.yogLogStrings.DEBUG]
    
    inline def FATAL: typings.yogLog.yogLogStrings.FATAL = "FATAL".asInstanceOf[typings.yogLog.yogLogStrings.FATAL]
    
    inline def NOTICE: typings.yogLog.yogLogStrings.NOTICE = "NOTICE".asInstanceOf[typings.yogLog.yogLogStrings.NOTICE]
    
    inline def TRACE: typings.yogLog.yogLogStrings.TRACE = "TRACE".asInstanceOf[typings.yogLog.yogLogStrings.TRACE]
    
    inline def WARNING: typings.yogLog.yogLogStrings.WARNING = "WARNING".asInstanceOf[typings.yogLog.yogLogStrings.WARNING]
  }
  
  trait LogConfig extends StObject {
    
    var IS_ODP: js.UndefOr[Boolean] = js.undefined
    
    var IS_OMP: js.UndefOr[`0` | `1`] = js.undefined
    
    var LogIdName: js.UndefOr[String] = js.undefined
    
    var access: js.UndefOr[String] = js.undefined
    
    var access_error_log_path: js.UndefOr[String] = js.undefined
    
    var access_log_path: js.UndefOr[String] = js.undefined
    
    var auto_rotate: js.UndefOr[`0` | `1`] = js.undefined
    
    // 模板文件地址，可以不填
    var data_path: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[`0` | `1`] = js.undefined
    
    var format_wf: js.UndefOr[String] = js.undefined
    
    var intLevel: js.UndefOr[`16`] = js.undefined
    
    // 用户只需要填写log_path配置
    var log_path: js.UndefOr[String] = js.undefined
    
    var use_sub_dir: js.UndefOr[`0` | `1`] = js.undefined
  }
  object LogConfig {
    
    inline def apply(): LogConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogConfig]
    }
    
    extension [Self <: LogConfig](x: Self) {
      
      inline def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
      
      inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
      
      inline def setAccess_error_log_path(value: String): Self = StObject.set(x, "access_error_log_path", value.asInstanceOf[js.Any])
      
      inline def setAccess_error_log_pathUndefined: Self = StObject.set(x, "access_error_log_path", js.undefined)
      
      inline def setAccess_log_path(value: String): Self = StObject.set(x, "access_log_path", value.asInstanceOf[js.Any])
      
      inline def setAccess_log_pathUndefined: Self = StObject.set(x, "access_log_path", js.undefined)
      
      inline def setAuto_rotate(value: `0` | `1`): Self = StObject.set(x, "auto_rotate", value.asInstanceOf[js.Any])
      
      inline def setAuto_rotateUndefined: Self = StObject.set(x, "auto_rotate", js.undefined)
      
      inline def setData_path(value: String): Self = StObject.set(x, "data_path", value.asInstanceOf[js.Any])
      
      inline def setData_pathUndefined: Self = StObject.set(x, "data_path", js.undefined)
      
      inline def setDebug(value: `0` | `1`): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFormat_wf(value: String): Self = StObject.set(x, "format_wf", value.asInstanceOf[js.Any])
      
      inline def setFormat_wfUndefined: Self = StObject.set(x, "format_wf", js.undefined)
      
      inline def setIS_ODP(value: Boolean): Self = StObject.set(x, "IS_ODP", value.asInstanceOf[js.Any])
      
      inline def setIS_ODPUndefined: Self = StObject.set(x, "IS_ODP", js.undefined)
      
      inline def setIS_OMP(value: `0` | `1`): Self = StObject.set(x, "IS_OMP", value.asInstanceOf[js.Any])
      
      inline def setIS_OMPUndefined: Self = StObject.set(x, "IS_OMP", js.undefined)
      
      inline def setIntLevel(value: `16`): Self = StObject.set(x, "intLevel", value.asInstanceOf[js.Any])
      
      inline def setIntLevelUndefined: Self = StObject.set(x, "intLevel", js.undefined)
      
      inline def setLogIdName(value: String): Self = StObject.set(x, "LogIdName", value.asInstanceOf[js.Any])
      
      inline def setLogIdNameUndefined: Self = StObject.set(x, "LogIdName", js.undefined)
      
      inline def setLog_path(value: String): Self = StObject.set(x, "log_path", value.asInstanceOf[js.Any])
      
      inline def setLog_pathUndefined: Self = StObject.set(x, "log_path", js.undefined)
      
      inline def setUse_sub_dir(value: `0` | `1`): Self = StObject.set(x, "use_sub_dir", value.asInstanceOf[js.Any])
      
      inline def setUse_sub_dirUndefined: Self = StObject.set(x, "use_sub_dir", js.undefined)
    }
  }
  
  trait LogInfo extends StObject {
    
    var msg: String
  }
  object LogInfo {
    
    inline def apply(msg: String): LogInfo = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogInfo]
    }
    
    extension [Self <: LogInfo](x: Self) {
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  type LogInput = String | LogInfo | js.Error
  
  type LogReturn = js.UndefOr[`false`]
  
  trait WriteLogConfig extends StObject {
    
    var errno: Double
    
    var escape_msg: Boolean
    
    var filename_suffix: String
  }
  object WriteLogConfig {
    
    inline def apply(errno: Double, escape_msg: Boolean, filename_suffix: String): WriteLogConfig = {
      val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], escape_msg = escape_msg.asInstanceOf[js.Any], filename_suffix = filename_suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteLogConfig]
    }
    
    extension [Self <: WriteLogConfig](x: Self) {
      
      inline def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
      
      inline def setEscape_msg(value: Boolean): Self = StObject.set(x, "escape_msg", value.asInstanceOf[js.Any])
      
      inline def setFilename_suffix(value: String): Self = StObject.set(x, "filename_suffix", value.asInstanceOf[js.Any])
    }
  }
}
