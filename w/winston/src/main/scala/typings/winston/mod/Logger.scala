package typings.winston.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.logform.mod.Format_
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.Transform
import typings.std.Error
import typings.winston.configMod.AbstractConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger
  extends Transform
     with Instantiable0[Logger]
     with Instantiable1[/* options */ LoggerOptions, Logger] {
  
  def add(transport: typings.winstonTransport.mod.^): Logger = js.native
  
  def alert(infoObject: js.Object): Logger = js.native
  def alert(message: String, callback: LogCallback): Logger = js.native
  def alert(message: String, meta: js.Any*): Logger = js.native
  def alert(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def alert(message: js.Any): Logger = js.native
  @JSName("alert")
  var alert_Original: LeveledLogMethod = js.native
  
  def child(options: js.Object): Logger = js.native
  
  def clear(): Logger = js.native
  
  def close(): Logger = js.native
  
  def configure(options: LoggerOptions): Unit = js.native
  
  def crit(infoObject: js.Object): Logger = js.native
  def crit(message: String, callback: LogCallback): Logger = js.native
  def crit(message: String, meta: js.Any*): Logger = js.native
  def crit(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def crit(message: js.Any): Logger = js.native
  @JSName("crit")
  var crit_Original: LeveledLogMethod = js.native
  
  def data(infoObject: js.Object): Logger = js.native
  def data(message: String, callback: LogCallback): Logger = js.native
  def data(message: String, meta: js.Any*): Logger = js.native
  def data(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def data(message: js.Any): Logger = js.native
  @JSName("data")
  var data_Original: LeveledLogMethod = js.native
  
  def debug(infoObject: js.Object): Logger = js.native
  def debug(message: String, callback: LogCallback): Logger = js.native
  def debug(message: String, meta: js.Any*): Logger = js.native
  def debug(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def debug(message: js.Any): Logger = js.native
  @JSName("debug")
  var debug_Original: LeveledLogMethod = js.native
  
  var defaultMeta: js.UndefOr[js.Any] = js.native
  
  // for syslog levels only
  def emerg(infoObject: js.Object): Logger = js.native
  // for syslog levels only
  def emerg(message: String, callback: LogCallback): Logger = js.native
  // for syslog levels only
  def emerg(message: String, meta: js.Any*): Logger = js.native
  // for syslog levels only
  def emerg(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  // for syslog levels only
  def emerg(message: js.Any): Logger = js.native
  // for syslog levels only
  @JSName("emerg")
  var emerg_Original: LeveledLogMethod = js.native
  
  // for cli and npm levels
  def error(infoObject: js.Object): Logger = js.native
  // for cli and npm levels
  def error(message: String, callback: LogCallback): Logger = js.native
  // for cli and npm levels
  def error(message: String, meta: js.Any*): Logger = js.native
  // for cli and npm levels
  def error(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  // for cli and npm levels
  def error(message: js.Any): Logger = js.native
  // for cli and npm levels
  @JSName("error")
  var error_Original: LeveledLogMethod = js.native
  
  var exceptions: ExceptionHandler = js.native
  
  var exitOnError: js.Function | Boolean = js.native
  
  var format: Format_ = js.native
  
  def help(infoObject: js.Object): Logger = js.native
  def help(message: String, callback: LogCallback): Logger = js.native
  def help(message: String, meta: js.Any*): Logger = js.native
  def help(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def help(message: js.Any): Logger = js.native
  @JSName("help")
  var help_Original: LeveledLogMethod = js.native
  
  def http(infoObject: js.Object): Logger = js.native
  def http(message: String, callback: LogCallback): Logger = js.native
  def http(message: String, meta: js.Any*): Logger = js.native
  def http(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def http(message: js.Any): Logger = js.native
  @JSName("http")
  var http_Original: LeveledLogMethod = js.native
  
  def info(infoObject: js.Object): Logger = js.native
  def info(message: String, callback: LogCallback): Logger = js.native
  def info(message: String, meta: js.Any*): Logger = js.native
  def info(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def info(message: js.Any): Logger = js.native
  @JSName("info")
  var info_Original: LeveledLogMethod = js.native
  
  def input(infoObject: js.Object): Logger = js.native
  def input(message: String, callback: LogCallback): Logger = js.native
  def input(message: String, meta: js.Any*): Logger = js.native
  def input(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def input(message: js.Any): Logger = js.native
  @JSName("input")
  var input_Original: LeveledLogMethod = js.native
  
  def isDebugEnabled(): Boolean = js.native
  
  def isErrorEnabled(): Boolean = js.native
  
  def isInfoEnabled(): Boolean = js.native
  
  def isLevelEnabled(level: String): Boolean = js.native
  
  def isSillyEnabled(): Boolean = js.native
  
  def isVerboseEnabled(): Boolean = js.native
  
  def isWarnEnabled(): Boolean = js.native
  
  var level: String = js.native
  
  var levels: AbstractConfigSetLevels = js.native
  
  def log(entry: LogEntry): Logger = js.native
  def log(level: String, message: String, callback: LogCallback): Logger = js.native
  def log(level: String, message: String, meta: js.Any*): Logger = js.native
  def log(level: String, message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def log(level: String, message: js.Any): Logger = js.native
  @JSName("log")
  var log_Original: LogMethod = js.native
  
  def notice(infoObject: js.Object): Logger = js.native
  def notice(message: String, callback: LogCallback): Logger = js.native
  def notice(message: String, meta: js.Any*): Logger = js.native
  def notice(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def notice(message: js.Any): Logger = js.native
  @JSName("notice")
  var notice_Original: LeveledLogMethod = js.native
  
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  
  def profile(id: String): Logger = js.native
  def profile(id: String, meta: LogEntry): Logger = js.native
  def profile(id: Double): Logger = js.native
  def profile(id: Double, meta: LogEntry): Logger = js.native
  
  var profilers: js.Object = js.native
  
  def prompt(infoObject: js.Object): Logger = js.native
  def prompt(message: String, callback: LogCallback): Logger = js.native
  def prompt(message: String, meta: js.Any*): Logger = js.native
  def prompt(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def prompt(message: js.Any): Logger = js.native
  @JSName("prompt")
  var prompt_Original: LeveledLogMethod = js.native
  
  def query(): js.Any = js.native
  def query(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* results */ js.Any, Unit]
  ): js.Any = js.native
  def query(options: QueryOptions): js.Any = js.native
  def query(options: QueryOptions, callback: js.Function2[/* err */ Error, /* results */ js.Any, Unit]): js.Any = js.native
  
  def remove(transport: typings.winstonTransport.mod.^): Logger = js.native
  
  var silent: Boolean = js.native
  
  def silly(infoObject: js.Object): Logger = js.native
  def silly(message: String, callback: LogCallback): Logger = js.native
  def silly(message: String, meta: js.Any*): Logger = js.native
  def silly(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def silly(message: js.Any): Logger = js.native
  @JSName("silly")
  var silly_Original: LeveledLogMethod = js.native
  
  def startTimer(): Profiler = js.native
  
  def stream(): ReadableStream = js.native
  def stream(options: js.Any): ReadableStream = js.native
  
  var transports: js.Array[typings.winstonTransport.mod.^] = js.native
  
  def verbose(infoObject: js.Object): Logger = js.native
  def verbose(message: String, callback: LogCallback): Logger = js.native
  def verbose(message: String, meta: js.Any*): Logger = js.native
  def verbose(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def verbose(message: js.Any): Logger = js.native
  @JSName("verbose")
  var verbose_Original: LeveledLogMethod = js.native
  
  def warn(infoObject: js.Object): Logger = js.native
  def warn(message: String, callback: LogCallback): Logger = js.native
  def warn(message: String, meta: js.Any*): Logger = js.native
  def warn(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def warn(message: js.Any): Logger = js.native
  @JSName("warn")
  var warn_Original: LeveledLogMethod = js.native
  
  def warning(infoObject: js.Object): Logger = js.native
  def warning(message: String, callback: LogCallback): Logger = js.native
  def warning(message: String, meta: js.Any*): Logger = js.native
  def warning(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def warning(message: js.Any): Logger = js.native
  @JSName("warning")
  var warning_Original: LeveledLogMethod = js.native
}
