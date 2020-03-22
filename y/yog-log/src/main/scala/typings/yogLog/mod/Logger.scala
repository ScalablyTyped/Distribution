package typings.yogLog.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.node.Buffer
import typings.std.Error
import typings.yogLog.yogLogBooleans.`false`
import typings.yogLog.yogLogNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog-log", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(opts: LogConfig, req: Request_[ParamsDictionary]) = this()
  def debug(info: LogInput): Unit | `false` = js.native
  def extend(destination: js.Object, source: js.Object): js.Object = js.native
  def fatal(info: LogInput): Unit | `false` = js.native
  def getCookie(name: String): String | `false` = js.native
  def getLogFile(intLevel: LevelInt): String = js.native
  def getLogFormat(level: LevelName): String | `false` = js.native
  def getLogID(req: Request_[ParamsDictionary], logIDName: String): String = js.native
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
  def parseReqParams(req: Request_[ParamsDictionary], res: Response_[_]): Unit | `false` = js.native
  def parseStackInfo(info: Error): Unit = js.native
  def parseStackInfo(info: LogInfo): Unit = js.native
  def setParams(name: String, value: js.Any): Unit = js.native
  def trace(info: LogInput): Unit | `false` = js.native
  def warning(info: LogInput): Unit | `false` = js.native
  def writeLog(intLevel: LevelInt, options: WriteLogConfig, log_format: String): Unit | `false` = js.native
}

