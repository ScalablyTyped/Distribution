package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winston", "winston")
@js.native
object winstonNs extends js.Object {
  @js.native
  trait Container
    extends org.scalablytyped.runtime.Instantiable0[Container]
       with org.scalablytyped.runtime.Instantiable1[/* options */ LoggerOptions, Container] {
    var loggers: stdLib.Map[java.lang.String, Logger] = js.native
    var options: LoggerOptions = js.native
    def add(id: java.lang.String): Logger = js.native
    def add(id: java.lang.String, options: LoggerOptions): Logger = js.native
    def close(): scala.Unit = js.native
    def close(id: java.lang.String): scala.Unit = js.native
    def get(id: java.lang.String): Logger = js.native
    def get(id: java.lang.String, options: LoggerOptions): Logger = js.native
    def has(id: java.lang.String): scala.Boolean = js.native
  }
  
  @js.native
  trait ExceptionHandler
    extends org.scalablytyped.runtime.Instantiable1[/* logger */ Logger, ExceptionHandler] {
    var catcher: js.Function | scala.Boolean = js.native
    var handlers: stdLib.Map[_, _] = js.native
    var logger: Logger = js.native
    def getAllInfo(err: java.lang.String): js.Object = js.native
    def getAllInfo(err: stdLib.Error): js.Object = js.native
    def getOsInfo(): js.Object = js.native
    def getProcessInfo(): js.Object = js.native
    def getTrace(err: stdLib.Error): js.Object = js.native
    def handle(transports: winstonDashTransportLib.winstonDashTransportMod.namespaced*): scala.Unit = js.native
    def unhandle(transports: winstonDashTransportLib.winstonDashTransportMod.namespaced*): scala.Unit = js.native
  }
  
  @js.native
  trait LeveledLogMethod extends js.Object {
    def apply(infoObject: js.Object): Logger = js.native
    def apply(message: java.lang.String, callback: LogCallback): Logger = js.native
    def apply(message: java.lang.String, meta: js.Any*): Logger = js.native
    def apply(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  }
  
  trait LogEntry
    extends /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
    var level: java.lang.String
    var message: java.lang.String
  }
  
  @js.native
  trait LogMethod extends js.Object {
    def apply(entry: LogEntry): Logger = js.native
    def apply(level: java.lang.String, message: java.lang.String, callback: LogCallback): Logger = js.native
    def apply(level: java.lang.String, message: java.lang.String, meta: js.Any*): Logger = js.native
    def apply(level: java.lang.String, message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
  }
  
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
    var levels: winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetLevels = js.native
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
    var transports: js.Array[winstonDashTransportLib.winstonDashTransportMod.namespaced] = js.native
    @JSName("verbose")
    var verbose_Original: LeveledLogMethod = js.native
    @JSName("warn")
    var warn_Original: LeveledLogMethod = js.native
    @JSName("warning")
    var warning_Original: LeveledLogMethod = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def _destroy(
      error: nodeLib.Error,
      callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
    ): scala.Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def _destroy(
      error: scala.Null,
      callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
    ): scala.Unit = js.native
    def add(transport: winstonDashTransportLib.winstonDashTransportMod.namespaced): Logger = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. drain
      * 3. error
      * 4. finish
      * 5. pipe
      * 6. unpipe
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("addListener")
    override def addListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("addListener")
    override def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
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
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def destroy(): scala.Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def destroy(error: nodeLib.Error): scala.Unit = js.native
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
    @JSName("emit")
    override def emit_close(event: nodeLib.nodeLibStrings.close): scala.Boolean = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("emit")
    override def emit_error(event: nodeLib.nodeLibStrings.error, err: nodeLib.Error): scala.Boolean = js.native
    // for cli and npm levels
    def error(infoObject: js.Object): Logger = js.native
    // for cli and npm levels
    def error(message: java.lang.String, callback: LogCallback): Logger = js.native
    // for cli and npm levels
    def error(message: java.lang.String, meta: js.Any*): Logger = js.native
    // for cli and npm levels
    def error(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
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
    @JSName("on")
    override def on_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("on")
    override def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("once")
    override def once_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("once")
    override def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("prependListener")
    override def prependListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("prependListener")
    override def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("prependOnceListener")
    override def prependOnceListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("prependOnceListener")
    override def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
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
    def remove(transport: winstonDashTransportLib.winstonDashTransportMod.namespaced): Logger = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("removeListener")
    override def removeListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("removeListener")
    override def removeListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
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
  
  trait LoggerOptions extends js.Object {
    var defaultMeta: js.UndefOr[js.Any] = js.undefined
    var exceptionHandlers: js.UndefOr[js.Any] = js.undefined
    var exitOnError: js.UndefOr[js.Function | scala.Boolean] = js.undefined
    var format: js.UndefOr[logformLib.logformMod.Format] = js.undefined
    var level: js.UndefOr[java.lang.String] = js.undefined
    var levels: js.UndefOr[winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetLevels] = js.undefined
    var silent: js.UndefOr[scala.Boolean] = js.undefined
    var transports: js.UndefOr[
        js.Array[winstonDashTransportLib.winstonDashTransportMod.namespaced] | winstonDashTransportLib.winstonDashTransportMod.namespaced
      ] = js.undefined
  }
  
  @js.native
  trait Profiler extends js.Object {
    var logger: Logger = js.native
    var start: stdLib.Date = js.native
    def done(): scala.Boolean = js.native
    def done(info: js.Any): scala.Boolean = js.native
  }
  
  trait QueryOptions extends js.Object {
    var fields: js.Any
    var from: js.UndefOr[stdLib.Date] = js.undefined
    var limit: js.UndefOr[scala.Double] = js.undefined
    var order: js.UndefOr[winstonLib.winstonLibStrings.asc | winstonLib.winstonLibStrings.desc] = js.undefined
    var rows: js.UndefOr[scala.Double] = js.undefined
    var start: js.UndefOr[scala.Double] = js.undefined
    var until: js.UndefOr[stdLib.Date] = js.undefined
  }
  
  val config: winstonLib.libWinstonConfigMod.winstonNs.Config = js.native
  val transports: winstonLib.libWinstonTransportsMod.winstonNs.Transports = js.native
  def format(transform: logformLib.logformMod.TransformFunction): logformLib.logformMod.FormatWrap = js.native
  @JSName("config")
  @js.native
  object configNs extends js.Object {
    @JSName("winston")
    @js.native
    object winstonNs extends js.Object {
      trait AbstractConfigSet extends js.Object {
        var colors: winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetColors
        var levels: winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetLevels
      }
      
      trait AbstractConfigSetColors
        extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
      
      trait AbstractConfigSetLevels
        extends /* key */ org.scalablytyped.runtime.StringDictionary[scala.Double]
      
      trait CliConfigSetColors
        extends winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetColors {
        var data: java.lang.String | js.Array[java.lang.String]
        var debug: java.lang.String | js.Array[java.lang.String]
        var error: java.lang.String | js.Array[java.lang.String]
        var help: java.lang.String | js.Array[java.lang.String]
        var info: java.lang.String | js.Array[java.lang.String]
        var input: java.lang.String | js.Array[java.lang.String]
        var prompt: java.lang.String | js.Array[java.lang.String]
        var silly: java.lang.String | js.Array[java.lang.String]
        var verbose: java.lang.String | js.Array[java.lang.String]
        var warn: java.lang.String | js.Array[java.lang.String]
      }
      
      trait CliConfigSetLevels
        extends winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetLevels {
        var data: scala.Double
        var debug: scala.Double
        var error: scala.Double
        var help: scala.Double
        var info: scala.Double
        var input: scala.Double
        var prompt: scala.Double
        var silly: scala.Double
        var verbose: scala.Double
        var warn: scala.Double
      }
      
      trait Config extends js.Object {
        var allColors: winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetColors
        var cli: winstonLib.Anon_Colors
        var npm: winstonLib.Anon_ColorsLevels
        var syslog: winstonLib.Anon_ColorsLevelsSyslogConfigSetColors
        def addColors(colors: winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetColors): scala.Unit
      }
      
      trait NpmConfigSetColors
        extends winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetColors {
        var debug: java.lang.String | js.Array[java.lang.String]
        var error: java.lang.String | js.Array[java.lang.String]
        var info: java.lang.String | js.Array[java.lang.String]
        var silly: java.lang.String | js.Array[java.lang.String]
        var verbose: java.lang.String | js.Array[java.lang.String]
        var warn: java.lang.String | js.Array[java.lang.String]
      }
      
      trait NpmConfigSetLevels
        extends winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetLevels {
        var debug: scala.Double
        var error: scala.Double
        var http: scala.Double
        var info: scala.Double
        var silly: scala.Double
        var verbose: scala.Double
        var warn: scala.Double
      }
      
      trait SyslogConfigSetColors
        extends winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetColors {
        var alert: java.lang.String | js.Array[java.lang.String]
        var crit: java.lang.String | js.Array[java.lang.String]
        var debug: java.lang.String | js.Array[java.lang.String]
        var emerg: java.lang.String | js.Array[java.lang.String]
        var error: java.lang.String | js.Array[java.lang.String]
        var info: java.lang.String | js.Array[java.lang.String]
        var notice: java.lang.String | js.Array[java.lang.String]
        var warning: java.lang.String | js.Array[java.lang.String]
      }
      
      trait SyslogConfigSetLevels
        extends winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetLevels {
        var alert: scala.Double
        var crit: scala.Double
        var debug: scala.Double
        var emerg: scala.Double
        var error: scala.Double
        var info: scala.Double
        var notice: scala.Double
        var warning: scala.Double
      }
      
    }
    
  }
  
  @JSName("format")
  @js.native
  object formatNs extends js.Object {
    def align(): logformLib.logformMod.Format = js.native
    def align(opts: js.Object): logformLib.logformMod.Format = js.native
    def cli(): logformLib.logformMod.Format = js.native
    def cli(opts: js.Object): logformLib.logformMod.Format = js.native
    def colorize(): logformLib.logformMod.Colorizer = js.native
    def colorize(opts: js.Object): logformLib.logformMod.Colorizer = js.native
    def combine(formats: logformLib.logformMod.Format*): logformLib.logformMod.Format = js.native
    def json(): logformLib.logformMod.Format = js.native
    def json(opts: js.Object): logformLib.logformMod.Format = js.native
    def label(): logformLib.logformMod.Format = js.native
    def label(opts: js.Object): logformLib.logformMod.Format = js.native
    def logstash(): logformLib.logformMod.Format = js.native
    def logstash(opts: js.Object): logformLib.logformMod.Format = js.native
    def padLevels(): logformLib.logformMod.Format = js.native
    def padLevels(opts: js.Object): logformLib.logformMod.Format = js.native
    def prettyPrint(): logformLib.logformMod.Format = js.native
    def prettyPrint(opts: js.Object): logformLib.logformMod.Format = js.native
    def printf(
      templateFunction: js.Function1[/* info */ logformLib.logformMod.TransformableInfo, java.lang.String]
    ): logformLib.logformMod.Format = js.native
    def simple(): logformLib.logformMod.Format = js.native
    def simple(opts: js.Object): logformLib.logformMod.Format = js.native
    def splat(): logformLib.logformMod.Format = js.native
    def splat(opts: js.Object): logformLib.logformMod.Format = js.native
    def timestamp(): logformLib.logformMod.Format = js.native
    def timestamp(opts: js.Object): logformLib.logformMod.Format = js.native
    def uncolorize(): logformLib.logformMod.Format = js.native
    def uncolorize(opts: js.Object): logformLib.logformMod.Format = js.native
  }
  
  @JSName("transports")
  @js.native
  object transportsNs extends js.Object {
    @JSName("winston")
    @js.native
    object winstonNs extends js.Object {
      @js.native
      trait ConsoleTransportInstance
        extends winstonDashTransportLib.winstonDashTransportMod.namespaced
           with org.scalablytyped.runtime.Instantiable0[winstonLib.libWinstonTransportsMod.winstonNs.ConsoleTransportInstance]
           with org.scalablytyped.runtime.Instantiable1[
                  /* options */ winstonLib.libWinstonTransportsMod.winstonNs.ConsoleTransportOptions, 
                  winstonLib.libWinstonTransportsMod.winstonNs.ConsoleTransportInstance
                ] {
        var eol: java.lang.String = js.native
        var name: java.lang.String = js.native
        var stderrLevels: js.Array[java.lang.String] = js.native
      }
      
      trait ConsoleTransportOptions
        extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamNs.TransportStreamOptions {
        var consoleWarnLevels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
        var debugStdout: js.UndefOr[scala.Boolean] = js.undefined
        var eol: js.UndefOr[java.lang.String] = js.undefined
        var stderrLevels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
      }
      
      @js.native
      trait FileTransportInstance
        extends winstonDashTransportLib.winstonDashTransportMod.namespaced
           with org.scalablytyped.runtime.Instantiable0[winstonLib.libWinstonTransportsMod.winstonNs.FileTransportInstance]
           with org.scalablytyped.runtime.Instantiable1[
                  /* options */ winstonLib.libWinstonTransportsMod.winstonNs.FileTransportOptions, 
                  winstonLib.libWinstonTransportsMod.winstonNs.FileTransportInstance
                ] {
        var dirname: java.lang.String = js.native
        var eol: java.lang.String = js.native
        var filename: java.lang.String = js.native
        var maxFiles: scala.Double | scala.Null = js.native
        var maxsize: scala.Double | scala.Null = js.native
        var name: java.lang.String = js.native
        var options: js.Object = js.native
        var rotationFormat: js.Function | scala.Boolean = js.native
        var tailable: scala.Boolean = js.native
        var zippedArchive: scala.Boolean = js.native
      }
      
      trait FileTransportOptions
        extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamNs.TransportStreamOptions {
        var dirname: js.UndefOr[java.lang.String] = js.undefined
        var eol: js.UndefOr[java.lang.String] = js.undefined
        var filename: js.UndefOr[java.lang.String] = js.undefined
        var maxFiles: js.UndefOr[scala.Double] = js.undefined
        var maxsize: js.UndefOr[scala.Double] = js.undefined
        var options: js.UndefOr[js.Object] = js.undefined
        var rotationFormat: js.UndefOr[js.Function] = js.undefined
        var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
        var tailable: js.UndefOr[scala.Boolean] = js.undefined
        var zippedArchive: js.UndefOr[scala.Boolean] = js.undefined
      }
      
      @js.native
      trait HttpTransportInstance
        extends winstonDashTransportLib.winstonDashTransportMod.namespaced
           with org.scalablytyped.runtime.Instantiable0[winstonLib.libWinstonTransportsMod.winstonNs.HttpTransportInstance]
           with org.scalablytyped.runtime.Instantiable1[
                  /* options */ winstonLib.libWinstonTransportsMod.winstonNs.HttpTransportOptions, 
                  winstonLib.libWinstonTransportsMod.winstonNs.HttpTransportInstance
                ] {
        var agent: js.UndefOr[nodeLib.httpMod.Agent | scala.Null] = js.native
        var auth: js.UndefOr[winstonLib.Anon_Password] = js.native
        var host: java.lang.String = js.native
        var name: java.lang.String = js.native
        var path: java.lang.String = js.native
        var port: scala.Double = js.native
        var ssl: scala.Boolean = js.native
      }
      
      trait HttpTransportOptions
        extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamNs.TransportStreamOptions {
        var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
        var auth: js.UndefOr[winstonLib.Anon_Password] = js.undefined
        var headers: js.UndefOr[js.Object] = js.undefined
        var host: js.UndefOr[java.lang.String] = js.undefined
        var path: js.UndefOr[java.lang.String] = js.undefined
        var port: js.UndefOr[scala.Double] = js.undefined
        var ssl: js.UndefOr[js.Any] = js.undefined
      }
      
      @js.native
      trait StreamTransportInstance
        extends winstonDashTransportLib.winstonDashTransportMod.namespaced
           with org.scalablytyped.runtime.Instantiable0[winstonLib.libWinstonTransportsMod.winstonNs.StreamTransportInstance]
           with org.scalablytyped.runtime.Instantiable1[
                  /* options */ winstonLib.libWinstonTransportsMod.winstonNs.StreamTransportOptions, 
                  winstonLib.libWinstonTransportsMod.winstonNs.StreamTransportInstance
                ] {
        var eol: java.lang.String = js.native
      }
      
      trait StreamTransportOptions
        extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamNs.TransportStreamOptions {
        var eol: js.UndefOr[java.lang.String] = js.undefined
        var stream: nodeLib.NodeJSNs.WritableStream
      }
      
      trait Transports extends js.Object {
        var Console: winstonLib.libWinstonTransportsMod.winstonNs.ConsoleTransportInstance
        var ConsoleTransportOptions: winstonLib.libWinstonTransportsMod.winstonNs.ConsoleTransportOptions
        var File: winstonLib.libWinstonTransportsMod.winstonNs.FileTransportInstance
        var FileTransportOptions: winstonLib.libWinstonTransportsMod.winstonNs.FileTransportOptions
        var Http: winstonLib.libWinstonTransportsMod.winstonNs.HttpTransportInstance
        var HttpTransportOptions: winstonLib.libWinstonTransportsMod.winstonNs.HttpTransportOptions
        var Stream: winstonLib.libWinstonTransportsMod.winstonNs.StreamTransportInstance
        var StreamTransportOptions: winstonLib.libWinstonTransportsMod.winstonNs.StreamTransportOptions
      }
      
    }
    
  }
  
  type LogCallback = js.Function4[
    /* error */ js.UndefOr[js.Any], 
    /* level */ js.UndefOr[java.lang.String], 
    /* message */ js.UndefOr[java.lang.String], 
    /* meta */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}

