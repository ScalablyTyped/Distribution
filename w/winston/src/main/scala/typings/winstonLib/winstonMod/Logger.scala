package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger
  extends nodeLib.streamMod.Transform
     with org.scalablytyped.runtime.Instantiable0[Logger]
     with org.scalablytyped.runtime.Instantiable1[/* options */ LoggerOptions, Logger] {
  @JSName("alert")
  var alert_Original: LeveledLogMethod = js.native
  @JSName("crit")
  var crit_Original: LeveledLogMethod = js.native
  @JSName("data")
  var data_Original: LeveledLogMethod = js.native
  @JSName("debug")
  var debug_Original: LeveledLogMethod = js.native
  // for syslog levels only
  @JSName("emerg")
  var emerg_Original: LeveledLogMethod = js.native
  // for cli and npm levels
  @JSName("error")
  var error_Original: LeveledLogMethod = js.native
  var exceptions: ExceptionHandler = js.native
  var exitOnError: js.Function | scala.Boolean = js.native
  var format: logformLib.logformMod.Format = js.native
  @JSName("help")
  var help_Original: LeveledLogMethod = js.native
  @JSName("http")
  var http_Original: LeveledLogMethod = js.native
  @JSName("info")
  var info_Original: LeveledLogMethod = js.native
  @JSName("input")
  var input_Original: LeveledLogMethod = js.native
  var level: java.lang.String = js.native
  var levels: winstonLib.libWinstonConfigMod.AbstractConfigSetLevels = js.native
  @JSName("log")
  var log_Original: LogMethod = js.native
  @JSName("notice")
  var notice_Original: LeveledLogMethod = js.native
  var profilers: js.Object = js.native
  @JSName("prompt")
  var prompt_Original: LeveledLogMethod = js.native
  var silent: scala.Boolean = js.native
  @JSName("silly")
  var silly_Original: LeveledLogMethod = js.native
  var transports: js.Array[winstonDashTransportLib.winstonDashTransportMod.^] = js.native
  @JSName("verbose")
  var verbose_Original: LeveledLogMethod = js.native
  @JSName("warn")
  var warn_Original: LeveledLogMethod = js.native
  @JSName("warning")
  var warning_Original: LeveledLogMethod = js.native
  def add(transport: winstonDashTransportLib.winstonDashTransportMod.^): Logger = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def alert(infoObject: js.Object): Logger = js.native
  def alert(message: java.lang.String, callback: LogCallback): Logger = js.native
  def alert(message: java.lang.String, meta: js.Any*): Logger = js.native
  def alert(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  def child(options: js.Object): Logger = js.native
  def clear(): Logger = js.native
  def close(): Logger = js.native
  def configure(options: LoggerOptions): scala.Unit = js.native
  def crit(infoObject: js.Object): Logger = js.native
  def crit(message: java.lang.String, callback: LogCallback): Logger = js.native
  def crit(message: java.lang.String, meta: js.Any*): Logger = js.native
  def crit(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  def data(infoObject: js.Object): Logger = js.native
  def data(message: java.lang.String, callback: LogCallback): Logger = js.native
  def data(message: java.lang.String, meta: js.Any*): Logger = js.native
  def data(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  def debug(infoObject: js.Object): Logger = js.native
  def debug(message: java.lang.String, callback: LogCallback): Logger = js.native
  def debug(message: java.lang.String, meta: js.Any*): Logger = js.native
  def debug(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  // for syslog levels only
  def emerg(infoObject: js.Object): Logger = js.native
  // for syslog levels only
  def emerg(message: java.lang.String, callback: LogCallback): Logger = js.native
  // for syslog levels only
  def emerg(message: java.lang.String, meta: js.Any*): Logger = js.native
  // for syslog levels only
  def emerg(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  // for cli and npm levels
  def error(infoObject: js.Object): Logger = js.native
  // for cli and npm levels
  def error(message: java.lang.String, callback: LogCallback): Logger = js.native
  // for cli and npm levels
  def error(message: java.lang.String, meta: js.Any*): Logger = js.native
  // for cli and npm levels
  def error(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  def help(infoObject: js.Object): Logger = js.native
  def help(message: java.lang.String, callback: LogCallback): Logger = js.native
  def help(message: java.lang.String, meta: js.Any*): Logger = js.native
  def help(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  def http(infoObject: js.Object): Logger = js.native
  def http(message: java.lang.String, callback: LogCallback): Logger = js.native
  def http(message: java.lang.String, meta: js.Any*): Logger = js.native
  def http(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  def info(infoObject: js.Object): Logger = js.native
  def info(message: java.lang.String, callback: LogCallback): Logger = js.native
  def info(message: java.lang.String, meta: js.Any*): Logger = js.native
  def info(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  def input(infoObject: js.Object): Logger = js.native
  def input(message: java.lang.String, callback: LogCallback): Logger = js.native
  def input(message: java.lang.String, meta: js.Any*): Logger = js.native
  def input(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def log(entry: LogEntry): Logger = js.native
  def log(level: java.lang.String, message: java.lang.String, callback: LogCallback): Logger = js.native
  def log(level: java.lang.String, message: java.lang.String, meta: js.Any*): Logger = js.native
  def log(level: java.lang.String, message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  def notice(infoObject: js.Object): Logger = js.native
  def notice(message: java.lang.String, callback: LogCallback): Logger = js.native
  def notice(message: java.lang.String, meta: js.Any*): Logger = js.native
  def notice(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def profile(id: java.lang.String): Logger = js.native
  def profile(id: java.lang.String, meta: LogEntry): Logger = js.native
  def profile(id: scala.Double): Logger = js.native
  def profile(id: scala.Double, meta: LogEntry): Logger = js.native
  def prompt(infoObject: js.Object): Logger = js.native
  def prompt(message: java.lang.String, callback: LogCallback): Logger = js.native
  def prompt(message: java.lang.String, meta: js.Any*): Logger = js.native
  def prompt(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  def query(): js.Any = js.native
  def query(options: QueryOptions): js.Any = js.native
  def query(
    options: QueryOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* results */ js.Any, scala.Unit]
  ): js.Any = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def remove(transport: winstonDashTransportLib.winstonDashTransportMod.^): Logger = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def silly(infoObject: js.Object): Logger = js.native
  def silly(message: java.lang.String, callback: LogCallback): Logger = js.native
  def silly(message: java.lang.String, meta: js.Any*): Logger = js.native
  def silly(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  def startTimer(): Profiler = js.native
  def stream(): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(options: js.Any): nodeLib.NodeJSNs.ReadableStream = js.native
  def verbose(infoObject: js.Object): Logger = js.native
  def verbose(message: java.lang.String, callback: LogCallback): Logger = js.native
  def verbose(message: java.lang.String, meta: js.Any*): Logger = js.native
  def verbose(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  def warn(infoObject: js.Object): Logger = js.native
  def warn(message: java.lang.String, callback: LogCallback): Logger = js.native
  def warn(message: java.lang.String, meta: js.Any*): Logger = js.native
  def warn(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  def warning(infoObject: js.Object): Logger = js.native
  def warning(message: java.lang.String, callback: LogCallback): Logger = js.native
  def warning(message: java.lang.String, meta: js.Any*): Logger = js.native
  def warning(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
}

