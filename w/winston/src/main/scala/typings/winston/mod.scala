package typings.winston

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.logform.mod.CliOptions
import typings.logform.mod.ColorizeOptions
import typings.logform.mod.Colorizer
import typings.logform.mod.FormatWrap
import typings.logform.mod.Format_
import typings.logform.mod.JsonOptions
import typings.logform.mod.LabelOptions
import typings.logform.mod.MetadataOptions
import typings.logform.mod.PadLevelsOptions
import typings.logform.mod.PrettyPrintOptions
import typings.logform.mod.TimestampOptions
import typings.logform.mod.TransformFunction
import typings.logform.mod.TransformableInfo
import typings.logform.mod.UncolorizeOptions
import typings.node.streamMod.Transform
import typings.std.Map
import typings.std.Number
import typings.std.ReadableStream
import typings.winston.configMod.AbstractConfigSetColors
import typings.winston.configMod.AbstractConfigSetLevels
import typings.winston.configMod.Config
import typings.winston.transportsMod.ConsoleTransportInstance
import typings.winston.transportsMod.ConsoleTransportOptions
import typings.winston.transportsMod.FileTransportInstance
import typings.winston.transportsMod.FileTransportOptions
import typings.winston.transportsMod.HttpTransportInstance
import typings.winston.transportsMod.HttpTransportOptions
import typings.winston.transportsMod.StreamTransportInstance
import typings.winston.transportsMod.StreamTransportOptions
import typings.winston.transportsMod.Transports
import typings.winston.winstonStrings.asc
import typings.winston.winstonStrings.desc
import typings.winstonTransport.mod.TransportStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("winston", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("winston", "Container")
  @js.native
  open class Container () extends StObject {
    def this(options: LoggerOptions) = this()
    
    def add(id: String): Logger = js.native
    def add(id: String, options: LoggerOptions): Logger = js.native
    
    def close(): Unit = js.native
    def close(id: String): Unit = js.native
    
    def get(id: String): Logger = js.native
    def get(id: String, options: LoggerOptions): Logger = js.native
    
    def has(id: String): Boolean = js.native
    
    var loggers: Map[String, Logger] = js.native
    
    var options: LoggerOptions = js.native
  }
  
  @JSImport("winston", "ExceptionHandler")
  @js.native
  open class ExceptionHandler protected () extends StObject {
    def this(logger: Logger) = this()
    
    var catcher: js.Function | Boolean = js.native
    
    def getAllInfo(err: String): js.Object = js.native
    def getAllInfo(err: js.Error): js.Object = js.native
    
    def getOsInfo(): js.Object = js.native
    
    def getProcessInfo(): js.Object = js.native
    
    def getTrace(err: js.Error): js.Object = js.native
    
    def handle(transports: typings.winstonTransport.mod.^ *): Unit = js.native
    
    var handlers: Map[Any, Any] = js.native
    
    var logger: Logger = js.native
    
    def unhandle(transports: typings.winstonTransport.mod.^ *): Unit = js.native
  }
  
  object Logform {
    
    @JSImport("winston", "Logform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("winston", "Logform.Colorizer")
    @js.native
    open class Colorizer ()
      extends typings.logform.mod.Colorizer {
      def this(opts: js.Object) = this()
    }
    
    @JSImport("winston", "Logform.Format")
    @js.native
    open class Format_ ()
      extends typings.logform.mod.Format_ {
      def this(opts: js.Object) = this()
    }
    
    object format {
      
      inline def apply(transform: TransformFunction): FormatWrap = ^.asInstanceOf[js.Dynamic].apply(transform.asInstanceOf[js.Any]).asInstanceOf[FormatWrap]
      
      @JSImport("winston", "Logform.format")
      @js.native
      val ^ : js.Any = js.native
      
      inline def align(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("align")().asInstanceOf[typings.logform.mod.Format_]
      
      inline def cli(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cli")().asInstanceOf[typings.logform.mod.Format_]
      inline def cli(opts: CliOptions): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cli")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.logform.mod.Format_]
      
      inline def colorize(): typings.logform.mod.Colorizer = ^.asInstanceOf[js.Dynamic].applyDynamic("colorize")().asInstanceOf[typings.logform.mod.Colorizer]
      inline def colorize(opts: ColorizeOptions): typings.logform.mod.Colorizer = ^.asInstanceOf[js.Dynamic].applyDynamic("colorize")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.logform.mod.Colorizer]
      
      inline def combine(formats: typings.logform.mod.Format_ *): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(formats.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.logform.mod.Format_]
      
      inline def errors(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("errors")().asInstanceOf[typings.logform.mod.Format_]
      inline def errors(opts: js.Object): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("errors")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.logform.mod.Format_]
      
      inline def json(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("json")().asInstanceOf[typings.logform.mod.Format_]
      inline def json(opts: JsonOptions): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.logform.mod.Format_]
      
      inline def label(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("label")().asInstanceOf[typings.logform.mod.Format_]
      inline def label(opts: LabelOptions): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.logform.mod.Format_]
      
      inline def logstash(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("logstash")().asInstanceOf[typings.logform.mod.Format_]
      
      inline def metadata(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("metadata")().asInstanceOf[typings.logform.mod.Format_]
      inline def metadata(opts: MetadataOptions): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.logform.mod.Format_]
      
      inline def ms(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ms")().asInstanceOf[typings.logform.mod.Format_]
      
      inline def padLevels(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("padLevels")().asInstanceOf[typings.logform.mod.Format_]
      inline def padLevels(opts: PadLevelsOptions): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("padLevels")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.logform.mod.Format_]
      
      inline def prettyPrint(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")().asInstanceOf[typings.logform.mod.Format_]
      inline def prettyPrint(opts: PrettyPrintOptions): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.logform.mod.Format_]
      
      inline def printf(templateFunction: js.Function1[/* info */ TransformableInfo, String]): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("printf")(templateFunction.asInstanceOf[js.Any]).asInstanceOf[typings.logform.mod.Format_]
      
      inline def simple(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("simple")().asInstanceOf[typings.logform.mod.Format_]
      
      inline def splat(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("splat")().asInstanceOf[typings.logform.mod.Format_]
      
      inline def timestamp(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[typings.logform.mod.Format_]
      inline def timestamp(opts: TimestampOptions): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.logform.mod.Format_]
      
      inline def uncolorize(): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("uncolorize")().asInstanceOf[typings.logform.mod.Format_]
      inline def uncolorize(opts: UncolorizeOptions): typings.logform.mod.Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("uncolorize")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.logform.mod.Format_]
    }
    
    inline def levels(config: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("levels")(config.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  }
  
  @JSImport("winston", "Logger")
  @js.native
  open class Logger () extends Transform {
    def this(options: LoggerOptions) = this()
    
    def add(transport: typings.winstonTransport.mod.^): Logger = js.native
    
    def alert(infoObject: js.Object): Logger = js.native
    def alert(message: String, callback: LogCallback): Logger = js.native
    def alert(message: String, meta: Any*): Logger = js.native
    def alert(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def alert(message: Any): Logger = js.native
    @JSName("alert")
    var alert_Original: LeveledLogMethod = js.native
    
    def child(options: js.Object): Logger = js.native
    
    def clear(): Logger = js.native
    
    def close(): Logger = js.native
    
    def configure(options: LoggerOptions): Unit = js.native
    
    def crit(infoObject: js.Object): Logger = js.native
    def crit(message: String, callback: LogCallback): Logger = js.native
    def crit(message: String, meta: Any*): Logger = js.native
    def crit(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def crit(message: Any): Logger = js.native
    @JSName("crit")
    var crit_Original: LeveledLogMethod = js.native
    
    def data(infoObject: js.Object): Logger = js.native
    def data(message: String, callback: LogCallback): Logger = js.native
    def data(message: String, meta: Any*): Logger = js.native
    def data(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def data(message: Any): Logger = js.native
    @JSName("data")
    var data_Original: LeveledLogMethod = js.native
    
    def debug(infoObject: js.Object): Logger = js.native
    def debug(message: String, callback: LogCallback): Logger = js.native
    def debug(message: String, meta: Any*): Logger = js.native
    def debug(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def debug(message: Any): Logger = js.native
    @JSName("debug")
    var debug_Original: LeveledLogMethod = js.native
    
    var defaultMeta: js.UndefOr[Any] = js.native
    
    // for syslog levels only
    def emerg(infoObject: js.Object): Logger = js.native
    // for syslog levels only
    def emerg(message: String, callback: LogCallback): Logger = js.native
    // for syslog levels only
    def emerg(message: String, meta: Any*): Logger = js.native
    // for syslog levels only
    def emerg(message: String, meta: Any, callback: LogCallback): Logger = js.native
    // for syslog levels only
    def emerg(message: Any): Logger = js.native
    // for syslog levels only
    @JSName("emerg")
    var emerg_Original: LeveledLogMethod = js.native
    
    // for cli and npm levels
    def error(infoObject: js.Object): Logger = js.native
    // for cli and npm levels
    def error(message: String, callback: LogCallback): Logger = js.native
    // for cli and npm levels
    def error(message: String, meta: Any*): Logger = js.native
    // for cli and npm levels
    def error(message: String, meta: Any, callback: LogCallback): Logger = js.native
    // for cli and npm levels
    def error(message: Any): Logger = js.native
    // for cli and npm levels
    @JSName("error")
    var error_Original: LeveledLogMethod = js.native
    
    var exceptions: ExceptionHandler = js.native
    
    var exitOnError: js.Function | Boolean = js.native
    
    var format: Format_ = js.native
    
    def help(infoObject: js.Object): Logger = js.native
    def help(message: String, callback: LogCallback): Logger = js.native
    def help(message: String, meta: Any*): Logger = js.native
    def help(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def help(message: Any): Logger = js.native
    @JSName("help")
    var help_Original: LeveledLogMethod = js.native
    
    def http(infoObject: js.Object): Logger = js.native
    def http(message: String, callback: LogCallback): Logger = js.native
    def http(message: String, meta: Any*): Logger = js.native
    def http(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def http(message: Any): Logger = js.native
    @JSName("http")
    var http_Original: LeveledLogMethod = js.native
    
    def info(infoObject: js.Object): Logger = js.native
    def info(message: String, callback: LogCallback): Logger = js.native
    def info(message: String, meta: Any*): Logger = js.native
    def info(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def info(message: Any): Logger = js.native
    @JSName("info")
    var info_Original: LeveledLogMethod = js.native
    
    def input(infoObject: js.Object): Logger = js.native
    def input(message: String, callback: LogCallback): Logger = js.native
    def input(message: String, meta: Any*): Logger = js.native
    def input(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def input(message: Any): Logger = js.native
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
    def log(level: String, message: String, meta: Any*): Logger = js.native
    def log(level: String, message: String, meta: Any, callback: LogCallback): Logger = js.native
    def log(level: String, message: Any): Logger = js.native
    @JSName("log")
    var log_Original: LogMethod = js.native
    
    def notice(infoObject: js.Object): Logger = js.native
    def notice(message: String, callback: LogCallback): Logger = js.native
    def notice(message: String, meta: Any*): Logger = js.native
    def notice(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def notice(message: Any): Logger = js.native
    @JSName("notice")
    var notice_Original: LeveledLogMethod = js.native
    
    def profile(id: String): Logger = js.native
    def profile(id: String, meta: LogEntry): Logger = js.native
    def profile(id: Double): Logger = js.native
    def profile(id: Double, meta: LogEntry): Logger = js.native
    
    var profilers: js.Object = js.native
    
    def prompt(infoObject: js.Object): Logger = js.native
    def prompt(message: String, callback: LogCallback): Logger = js.native
    def prompt(message: String, meta: Any*): Logger = js.native
    def prompt(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def prompt(message: Any): Logger = js.native
    @JSName("prompt")
    var prompt_Original: LeveledLogMethod = js.native
    
    def query(): Any = js.native
    def query(options: Unit, callback: js.Function2[/* err */ js.Error, /* results */ Any, Unit]): Any = js.native
    def query(options: QueryOptions): Any = js.native
    def query(options: QueryOptions, callback: js.Function2[/* err */ js.Error, /* results */ Any, Unit]): Any = js.native
    
    var rejections: RejectionHandler = js.native
    
    def remove(transport: typings.winstonTransport.mod.^): Logger = js.native
    
    var silent: Boolean = js.native
    
    def silly(infoObject: js.Object): Logger = js.native
    def silly(message: String, callback: LogCallback): Logger = js.native
    def silly(message: String, meta: Any*): Logger = js.native
    def silly(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def silly(message: Any): Logger = js.native
    @JSName("silly")
    var silly_Original: LeveledLogMethod = js.native
    
    def startTimer(): Profiler = js.native
    
    def stream(): ReadableStream[Any] = js.native
    def stream(options: Any): ReadableStream[Any] = js.native
    
    var transports: js.Array[typings.winstonTransport.mod.^] = js.native
    
    def verbose(infoObject: js.Object): Logger = js.native
    def verbose(message: String, callback: LogCallback): Logger = js.native
    def verbose(message: String, meta: Any*): Logger = js.native
    def verbose(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def verbose(message: Any): Logger = js.native
    @JSName("verbose")
    var verbose_Original: LeveledLogMethod = js.native
    
    def warn(infoObject: js.Object): Logger = js.native
    def warn(message: String, callback: LogCallback): Logger = js.native
    def warn(message: String, meta: Any*): Logger = js.native
    def warn(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def warn(message: Any): Logger = js.native
    @JSName("warn")
    var warn_Original: LeveledLogMethod = js.native
    
    def warning(infoObject: js.Object): Logger = js.native
    def warning(message: String, callback: LogCallback): Logger = js.native
    def warning(message: String, meta: Any*): Logger = js.native
    def warning(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def warning(message: Any): Logger = js.native
    @JSName("warning")
    var warning_Original: LeveledLogMethod = js.native
  }
  
  @JSImport("winston", "Profiler")
  @js.native
  open class Profiler () extends StObject {
    
    def done(): Boolean = js.native
    def done(info: Any): Boolean = js.native
    
    var logger: Logger = js.native
    
    var start: Number = js.native
  }
  
  @JSImport("winston", "RejectionHandler")
  @js.native
  open class RejectionHandler protected () extends StObject {
    def this(logger: Logger) = this()
    
    var catcher: js.Function | Boolean = js.native
    
    def getAllInfo(err: String): js.Object = js.native
    def getAllInfo(err: js.Error): js.Object = js.native
    
    def getOsInfo(): js.Object = js.native
    
    def getProcessInfo(): js.Object = js.native
    
    def getTrace(err: js.Error): js.Object = js.native
    
    def handle(transports: typings.winstonTransport.mod.^ *): Unit = js.native
    
    var handlers: Map[Any, Any] = js.native
    
    var logger: Logger = js.native
    
    def unhandle(transports: typings.winstonTransport.mod.^ *): Unit = js.native
  }
  
  @JSImport("winston", "add")
  @js.native
  def add: js.Function1[/* transport */ typings.winstonTransport.mod.^, Logger] = js.native
  
  @JSImport("winston", "addColors")
  @js.native
  def addColors: js.Function1[/* target */ AbstractConfigSetColors, Any] = js.native
  inline def addColors_=(x: js.Function1[/* target */ AbstractConfigSetColors, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addColors")(x.asInstanceOf[js.Any])
  
  inline def add_=(x: js.Function1[/* transport */ typings.winstonTransport.mod.^, Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("add")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "child")
  @js.native
  def child: js.Function1[/* options */ js.Object, Logger] = js.native
  inline def child_=(x: js.Function1[/* options */ js.Object, Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("child")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "clear")
  @js.native
  def clear: js.Function0[Logger] = js.native
  inline def clear_=(x: js.Function0[Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "config")
  @js.native
  val config: Config = js.native
  
  @JSImport("winston", "configure")
  @js.native
  def configure: js.Function1[/* options */ LoggerOptions, Unit] = js.native
  inline def configure_=(x: js.Function1[/* options */ LoggerOptions, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configure")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "createLogger")
  @js.native
  def createLogger: js.Function1[/* options */ js.UndefOr[LoggerOptions], Logger] = js.native
  inline def createLogger_=(x: js.Function1[/* options */ js.UndefOr[LoggerOptions], Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createLogger")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "debug")
  @js.native
  def debug: LeveledLogMethod = js.native
  inline def debug_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  
  // Pass-through npm level methods routed to the default logger.
  @JSImport("winston", "error")
  @js.native
  def error: LeveledLogMethod = js.native
  inline def error_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "exceptions")
  @js.native
  def exceptions: ExceptionHandler = js.native
  inline def exceptions_=(x: ExceptionHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "exitOnError")
  @js.native
  def exitOnError: js.Function | Boolean = js.native
  inline def exitOnError_=(x: js.Function | Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exitOnError")(x.asInstanceOf[js.Any])
  
  object format {
    
    inline def apply(transform: TransformFunction): FormatWrap = ^.asInstanceOf[js.Dynamic].apply(transform.asInstanceOf[js.Any]).asInstanceOf[FormatWrap]
    
    @JSImport("winston", "format")
    @js.native
    val ^ : js.Any = js.native
    
    inline def align(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("align")().asInstanceOf[Format_]
    
    inline def cli(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cli")().asInstanceOf[Format_]
    inline def cli(opts: CliOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cli")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def colorize(): Colorizer = ^.asInstanceOf[js.Dynamic].applyDynamic("colorize")().asInstanceOf[Colorizer]
    inline def colorize(opts: ColorizeOptions): Colorizer = ^.asInstanceOf[js.Dynamic].applyDynamic("colorize")(opts.asInstanceOf[js.Any]).asInstanceOf[Colorizer]
    
    inline def combine(formats: Format_ *): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(formats.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Format_]
    
    inline def errors(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("errors")().asInstanceOf[Format_]
    inline def errors(opts: js.Object): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("errors")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def json(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("json")().asInstanceOf[Format_]
    inline def json(opts: JsonOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def label(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("label")().asInstanceOf[Format_]
    inline def label(opts: LabelOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def logstash(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("logstash")().asInstanceOf[Format_]
    
    inline def metadata(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("metadata")().asInstanceOf[Format_]
    inline def metadata(opts: MetadataOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def ms(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ms")().asInstanceOf[Format_]
    
    inline def padLevels(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("padLevels")().asInstanceOf[Format_]
    inline def padLevels(opts: PadLevelsOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("padLevels")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def prettyPrint(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")().asInstanceOf[Format_]
    inline def prettyPrint(opts: PrettyPrintOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def printf(templateFunction: js.Function1[/* info */ TransformableInfo, String]): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("printf")(templateFunction.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def simple(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("simple")().asInstanceOf[Format_]
    
    inline def splat(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("splat")().asInstanceOf[Format_]
    
    inline def timestamp(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[Format_]
    inline def timestamp(opts: TimestampOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def uncolorize(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("uncolorize")().asInstanceOf[Format_]
    inline def uncolorize(opts: UncolorizeOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("uncolorize")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
  }
  
  @JSImport("winston", "http")
  @js.native
  def http: LeveledLogMethod = js.native
  inline def http_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("http")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "info")
  @js.native
  def info: LeveledLogMethod = js.native
  inline def info_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "level")
  @js.native
  def level: String = js.native
  inline def level_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("level")(x.asInstanceOf[js.Any])
  
  // Other pass-through methods routed to the default logger.
  @JSImport("winston", "log")
  @js.native
  def log: LogMethod = js.native
  inline def log_=(x: LogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "loggers")
  @js.native
  def loggers: Container = js.native
  inline def loggers_=(x: Container): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loggers")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "profile")
  @js.native
  def profile: js.Function1[/* id */ String | Double, Logger] = js.native
  inline def profile_=(x: js.Function1[/* id */ String | Double, Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("profile")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "query")
  @js.native
  def query: js.Function2[
    /* options */ js.UndefOr[QueryOptions], 
    /* callback */ js.UndefOr[js.Function2[/* err */ js.Error, /* results */ Any, Unit]], 
    Any
  ] = js.native
  inline def query_=(
    x: js.Function2[
      /* options */ js.UndefOr[QueryOptions], 
      /* callback */ js.UndefOr[js.Function2[/* err */ js.Error, /* results */ Any, Unit]], 
      Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("query")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "rejections")
  @js.native
  def rejections: RejectionHandler = js.native
  inline def rejections_=(x: RejectionHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rejections")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "remove")
  @js.native
  def remove: js.Function1[/* transport */ typings.winstonTransport.mod.^, Logger] = js.native
  inline def remove_=(x: js.Function1[/* transport */ typings.winstonTransport.mod.^, Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "silly")
  @js.native
  def silly: LeveledLogMethod = js.native
  inline def silly_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silly")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "startTimer")
  @js.native
  def startTimer: js.Function0[Profiler] = js.native
  inline def startTimer_=(x: js.Function0[Profiler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startTimer")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "stream")
  @js.native
  def stream: js.Function1[/* options */ js.UndefOr[Any], ReadableStream[Any]] = js.native
  inline def stream_=(x: js.Function1[/* options */ js.UndefOr[Any], ReadableStream[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "transport")
  @js.native
  open class transport ()
    extends typings.winstonTransport.mod.^ {
    def this(opts: TransportStreamOptions) = this()
  }
  
  object transports extends Shortcut {
    
    @JSImport("winston", "transports")
    @js.native
    val ^ : Transports = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("winston", "transports.Console")
    @js.native
    open class Console () extends ConsoleTransportInstance {
      def this(options: ConsoleTransportOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("winston", "transports.File")
    @js.native
    open class File () extends FileTransportInstance {
      def this(options: FileTransportOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("winston", "transports.Http")
    @js.native
    open class Http () extends HttpTransportInstance {
      def this(options: HttpTransportOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("winston", "transports.Stream")
    @js.native
    open class Stream () extends StreamTransportInstance {
      def this(options: StreamTransportOptions) = this()
    }
    
    type _To = Transports
    
    /* This means you don't have to write `^`, but can instead just say `transports.foo` */
    override def _to: Transports = ^
  }
  
  @JSImport("winston", "verbose")
  @js.native
  def verbose: LeveledLogMethod = js.native
  inline def verbose_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verbose")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "warn")
  @js.native
  def warn: LeveledLogMethod = js.native
  inline def warn_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  
  @js.native
  trait LeveledLogMethod extends StObject {
    
    def apply(infoObject: js.Object): Logger = js.native
    def apply(message: String, callback: LogCallback): Logger = js.native
    def apply(message: String, meta: Any*): Logger = js.native
    def apply(message: String, meta: Any, callback: LogCallback): Logger = js.native
    def apply(message: Any): Logger = js.native
  }
  
  type LogCallback = js.Function4[
    /* error */ js.UndefOr[Any], 
    /* level */ js.UndefOr[String], 
    /* message */ js.UndefOr[String], 
    /* meta */ js.UndefOr[Any], 
    Unit
  ]
  
  trait LogEntry
    extends StObject
       with /* optionName */ StringDictionary[Any] {
    
    var level: String
    
    var message: String
  }
  object LogEntry {
    
    inline def apply(level: String, message: String): LogEntry = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogEntry]
    }
    
    extension [Self <: LogEntry](x: Self) {
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogMethod extends StObject {
    
    def apply(entry: LogEntry): Logger = js.native
    def apply(level: String, message: String, callback: LogCallback): Logger = js.native
    def apply(level: String, message: String, meta: Any*): Logger = js.native
    def apply(level: String, message: String, meta: Any, callback: LogCallback): Logger = js.native
    def apply(level: String, message: Any): Logger = js.native
  }
  
  trait LoggerOptions extends StObject {
    
    var defaultMeta: js.UndefOr[Any] = js.undefined
    
    var exceptionHandlers: js.UndefOr[Any] = js.undefined
    
    var exitOnError: js.UndefOr[js.Function | Boolean] = js.undefined
    
    var format: js.UndefOr[Format_] = js.undefined
    
    var handleExceptions: js.UndefOr[Boolean] = js.undefined
    
    var handleRejections: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var levels: js.UndefOr[AbstractConfigSetLevels] = js.undefined
    
    var rejectionHandlers: js.UndefOr[Any] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var transports: js.UndefOr[js.Array[typings.winstonTransport.mod.^] | typings.winstonTransport.mod.^] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setDefaultMeta(value: Any): Self = StObject.set(x, "defaultMeta", value.asInstanceOf[js.Any])
      
      inline def setDefaultMetaUndefined: Self = StObject.set(x, "defaultMeta", js.undefined)
      
      inline def setExceptionHandlers(value: Any): Self = StObject.set(x, "exceptionHandlers", value.asInstanceOf[js.Any])
      
      inline def setExceptionHandlersUndefined: Self = StObject.set(x, "exceptionHandlers", js.undefined)
      
      inline def setExitOnError(value: js.Function | Boolean): Self = StObject.set(x, "exitOnError", value.asInstanceOf[js.Any])
      
      inline def setExitOnErrorUndefined: Self = StObject.set(x, "exitOnError", js.undefined)
      
      inline def setFormat(value: Format_): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHandleExceptions(value: Boolean): Self = StObject.set(x, "handleExceptions", value.asInstanceOf[js.Any])
      
      inline def setHandleExceptionsUndefined: Self = StObject.set(x, "handleExceptions", js.undefined)
      
      inline def setHandleRejections(value: Boolean): Self = StObject.set(x, "handleRejections", value.asInstanceOf[js.Any])
      
      inline def setHandleRejectionsUndefined: Self = StObject.set(x, "handleRejections", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLevels(value: AbstractConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
      
      inline def setRejectionHandlers(value: Any): Self = StObject.set(x, "rejectionHandlers", value.asInstanceOf[js.Any])
      
      inline def setRejectionHandlersUndefined: Self = StObject.set(x, "rejectionHandlers", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setTransports(value: js.Array[typings.winstonTransport.mod.^] | typings.winstonTransport.mod.^): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      inline def setTransportsVarargs(value: typings.winstonTransport.mod.^ *): Self = StObject.set(x, "transports", js.Array(value*))
    }
  }
  
  trait QueryOptions extends StObject {
    
    var fields: Any
    
    var from: js.UndefOr[js.Date] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[asc | desc] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var until: js.UndefOr[js.Date] = js.undefined
  }
  object QueryOptions {
    
    inline def apply(fields: Any): QueryOptions = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryOptions]
    }
    
    extension [Self <: QueryOptions](x: Self) {
      
      inline def setFields(value: Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: js.Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: asc | desc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setUntil(value: js.Date): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
}
