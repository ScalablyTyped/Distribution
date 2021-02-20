package typings.yogLog

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import typings.std.Error
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yog-log", JSImport.Namespace)
  @js.native
  def apply(): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    _
  ] = js.native
  @JSImport("yog-log", JSImport.Namespace)
  @js.native
  def apply(config: LogConfig): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    _
  ] = js.native
  
  @JSImport("yog-log", "Logger")
  @js.native
  class Logger protected () extends StObject {
    def this(opts: LogConfig, req: Request_[ParamsDictionary, _, _, Query]) = this()
    
    def debug(info: LogInput): Unit | `false` = js.native
    
    def extend(destination: js.Object, source: js.Object): js.Object = js.native
    
    def fatal(info: LogInput): Unit | `false` = js.native
    
    def getCookie(name: String): String | `false` = js.native
    
    def getLogFile(intLevel: LevelInt): String = js.native
    
    def getLogFormat(level: LevelName): String | `false` = js.native
    
    def getLogID(req: Request_[ParamsDictionary, _, _, Query], logIDName: String): String = js.native
    
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
    
    def parseReqParams(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit | `false` = js.native
    
    def parseStackInfo(info: Error): Unit = js.native
    def parseStackInfo(info: LogInfo): Unit = js.native
    
    def setParams(name: String, value: js.Any): Unit = js.native
    
    def trace(info: LogInput): Unit | `false` = js.native
    
    def warning(info: LogInput): Unit | `false` = js.native
    
    def writeLog(intLevel: LevelInt, options: WriteLogConfig, log_format: String): Unit | `false` = js.native
  }
  
  @JSImport("yog-log", "getLogger")
  @js.native
  def getLogger(): Logger = js.native
  @JSImport("yog-log", "getLogger")
  @js.native
  def getLogger(config: LogConfig): Logger = js.native
  
  @js.native
  trait LEVELS extends StObject {
    
    // 访问日志
    var `0`: ACCESS = js.native
    
    // 应用日志等级 ODP格式
    var `1`: FATAL = js.native
    
    var `16`: DEBUG = js.native
    
    var `2`: WARNING = js.native
    
    var `3`: ACCESS_ERROR = js.native
    
    var `4`: NOTICE = js.native
    
    var `8`: TRACE = js.native
  }
  object LEVELS {
    
    @scala.inline
    def apply(`0`: ACCESS, `1`: FATAL, `16`: DEBUG, `2`: WARNING, `3`: ACCESS_ERROR, `4`: NOTICE, `8`: TRACE): LEVELS = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("16")(`16`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LEVELS]
    }
    
    @scala.inline
    implicit class LEVELSMutableBuilder[Self <: LEVELS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set0(value: ACCESS): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1(value: FATAL): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set16(value: DEBUG): Self = StObject.set(x, "16", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2(value: WARNING): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set3(value: ACCESS_ERROR): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4(value: NOTICE): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set8(value: TRACE): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def ACCESS: typings.yogLog.yogLogStrings.ACCESS = "ACCESS".asInstanceOf[typings.yogLog.yogLogStrings.ACCESS]
    
    @scala.inline
    def ACCESS_ERROR: typings.yogLog.yogLogStrings.ACCESS_ERROR = "ACCESS_ERROR".asInstanceOf[typings.yogLog.yogLogStrings.ACCESS_ERROR]
    
    @scala.inline
    def DEBUG: typings.yogLog.yogLogStrings.DEBUG = "DEBUG".asInstanceOf[typings.yogLog.yogLogStrings.DEBUG]
    
    @scala.inline
    def FATAL: typings.yogLog.yogLogStrings.FATAL = "FATAL".asInstanceOf[typings.yogLog.yogLogStrings.FATAL]
    
    @scala.inline
    def NOTICE: typings.yogLog.yogLogStrings.NOTICE = "NOTICE".asInstanceOf[typings.yogLog.yogLogStrings.NOTICE]
    
    @scala.inline
    def TRACE: typings.yogLog.yogLogStrings.TRACE = "TRACE".asInstanceOf[typings.yogLog.yogLogStrings.TRACE]
    
    @scala.inline
    def WARNING: typings.yogLog.yogLogStrings.WARNING = "WARNING".asInstanceOf[typings.yogLog.yogLogStrings.WARNING]
  }
  
  @js.native
  trait LogConfig extends StObject {
    
    var IS_ODP: js.UndefOr[Boolean] = js.native
    
    var IS_OMP: js.UndefOr[`0` | `1`] = js.native
    
    var LogIdName: js.UndefOr[String] = js.native
    
    var access: js.UndefOr[String] = js.native
    
    var access_error_log_path: js.UndefOr[String] = js.native
    
    var access_log_path: js.UndefOr[String] = js.native
    
    var auto_rotate: js.UndefOr[`0` | `1`] = js.native
    
    // 模板文件地址，可以不填
    var data_path: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[`0` | `1`] = js.native
    
    var format_wf: js.UndefOr[String] = js.native
    
    var intLevel: js.UndefOr[`16`] = js.native
    
    // 用户只需要填写log_path配置
    var log_path: js.UndefOr[String] = js.native
    
    var use_sub_dir: js.UndefOr[`0` | `1`] = js.native
  }
  object LogConfig {
    
    @scala.inline
    def apply(): LogConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogConfig]
    }
    
    @scala.inline
    implicit class LogConfigMutableBuilder[Self <: LogConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
      
      @scala.inline
      def setAccess_error_log_path(value: String): Self = StObject.set(x, "access_error_log_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_error_log_pathUndefined: Self = StObject.set(x, "access_error_log_path", js.undefined)
      
      @scala.inline
      def setAccess_log_path(value: String): Self = StObject.set(x, "access_log_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_log_pathUndefined: Self = StObject.set(x, "access_log_path", js.undefined)
      
      @scala.inline
      def setAuto_rotate(value: `0` | `1`): Self = StObject.set(x, "auto_rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuto_rotateUndefined: Self = StObject.set(x, "auto_rotate", js.undefined)
      
      @scala.inline
      def setData_path(value: String): Self = StObject.set(x, "data_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_pathUndefined: Self = StObject.set(x, "data_path", js.undefined)
      
      @scala.inline
      def setDebug(value: `0` | `1`): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setFormat_wf(value: String): Self = StObject.set(x, "format_wf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat_wfUndefined: Self = StObject.set(x, "format_wf", js.undefined)
      
      @scala.inline
      def setIS_ODP(value: Boolean): Self = StObject.set(x, "IS_ODP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIS_ODPUndefined: Self = StObject.set(x, "IS_ODP", js.undefined)
      
      @scala.inline
      def setIS_OMP(value: `0` | `1`): Self = StObject.set(x, "IS_OMP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIS_OMPUndefined: Self = StObject.set(x, "IS_OMP", js.undefined)
      
      @scala.inline
      def setIntLevel(value: `16`): Self = StObject.set(x, "intLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntLevelUndefined: Self = StObject.set(x, "intLevel", js.undefined)
      
      @scala.inline
      def setLogIdName(value: String): Self = StObject.set(x, "LogIdName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogIdNameUndefined: Self = StObject.set(x, "LogIdName", js.undefined)
      
      @scala.inline
      def setLog_path(value: String): Self = StObject.set(x, "log_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog_pathUndefined: Self = StObject.set(x, "log_path", js.undefined)
      
      @scala.inline
      def setUse_sub_dir(value: `0` | `1`): Self = StObject.set(x, "use_sub_dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_sub_dirUndefined: Self = StObject.set(x, "use_sub_dir", js.undefined)
    }
  }
  
  @js.native
  trait LogInfo extends StObject {
    
    var msg: String = js.native
  }
  object LogInfo {
    
    @scala.inline
    def apply(msg: String): LogInfo = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogInfo]
    }
    
    @scala.inline
    implicit class LogInfoMutableBuilder[Self <: LogInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  type LogInput = String | LogInfo | Error
  
  type LogReturn = js.UndefOr[`false`]
  
  @js.native
  trait WriteLogConfig extends StObject {
    
    var errno: Double = js.native
    
    var escape_msg: Boolean = js.native
    
    var filename_suffix: String = js.native
  }
  object WriteLogConfig {
    
    @scala.inline
    def apply(errno: Double, escape_msg: Boolean, filename_suffix: String): WriteLogConfig = {
      val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], escape_msg = escape_msg.asInstanceOf[js.Any], filename_suffix = filename_suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteLogConfig]
    }
    
    @scala.inline
    implicit class WriteLogConfigMutableBuilder[Self <: WriteLogConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscape_msg(value: Boolean): Self = StObject.set(x, "escape_msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename_suffix(value: String): Self = StObject.set(x, "filename_suffix", value.asInstanceOf[js.Any])
    }
  }
}
