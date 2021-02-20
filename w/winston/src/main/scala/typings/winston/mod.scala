package typings.winston

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
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
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.Transform
import typings.std.Date
import typings.std.Error
import typings.std.Map
import typings.std.Number
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("winston", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Container
    extends Instantiable0[Container]
       with Instantiable1[/* options */ LoggerOptions, Container] {
    
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
  @JSImport("winston", "Container")
  @js.native
  def Container: Container = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("winston", "Container")
  @js.native
  class ContainerCls () extends Container {
    def this(options: LoggerOptions) = this()
  }
  
  @scala.inline
  def Container_=(x: Container): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ExceptionHandler extends Instantiable1[/* logger */ Logger, ExceptionHandler] {
    
    var catcher: js.Function | Boolean = js.native
    
    def getAllInfo(err: String): js.Object = js.native
    def getAllInfo(err: Error): js.Object = js.native
    
    def getOsInfo(): js.Object = js.native
    
    def getProcessInfo(): js.Object = js.native
    
    def getTrace(err: Error): js.Object = js.native
    
    def handle(transports: typings.winstonTransport.mod.^ *): Unit = js.native
    
    var handlers: Map[_, _] = js.native
    
    var logger: Logger = js.native
    
    def unhandle(transports: typings.winstonTransport.mod.^ *): Unit = js.native
  }
  object ExceptionHandler extends Shortcut {
    
    @JSImport("winston", "ExceptionHandler")
    @js.native
    val ^ : ExceptionHandler = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("winston", "ExceptionHandler.logger")
    @js.native
    class logger () extends Logger {
      def this(options: LoggerOptions) = this()
    }
    
    type _To = ExceptionHandler
    
    /* This means you don't have to write `^`, but can instead just say `ExceptionHandler.foo` */
    override def _to: ExceptionHandler = ^
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("winston", "ExceptionHandler")
  @js.native
  class ExceptionHandlerCls protected () extends ExceptionHandler {
    def this(logger: Logger) = this()
  }
  
  object Logform {
    
    @JSImport("winston", "Logform.Colorizer")
    @js.native
    class Colorizer ()
      extends typings.logform.mod.Colorizer {
      def this(opts: js.Object) = this()
    }
    
    @JSImport("winston", "Logform.Format")
    @js.native
    class Format_ ()
      extends typings.logform.mod.Format_ {
      def this(opts: js.Object) = this()
    }
    
    object format {
      
      @JSImport("winston", "Logform.format")
      @js.native
      def apply(transform: TransformFunction): FormatWrap = js.native
      
      @JSImport("winston", "Logform.format.align")
      @js.native
      def align(): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.cli")
      @js.native
      def cli(): typings.logform.mod.Format_ = js.native
      @JSImport("winston", "Logform.format.cli")
      @js.native
      def cli(opts: CliOptions): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.colorize")
      @js.native
      def colorize(): typings.logform.mod.Colorizer = js.native
      @JSImport("winston", "Logform.format.colorize")
      @js.native
      def colorize(opts: ColorizeOptions): typings.logform.mod.Colorizer = js.native
      
      @JSImport("winston", "Logform.format.combine")
      @js.native
      def combine(formats: typings.logform.mod.Format_ *): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.errors")
      @js.native
      def errors(): typings.logform.mod.Format_ = js.native
      @JSImport("winston", "Logform.format.errors")
      @js.native
      def errors(opts: js.Object): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.json")
      @js.native
      def json(): typings.logform.mod.Format_ = js.native
      @JSImport("winston", "Logform.format.json")
      @js.native
      def json(opts: JsonOptions): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.label")
      @js.native
      def label(): typings.logform.mod.Format_ = js.native
      @JSImport("winston", "Logform.format.label")
      @js.native
      def label(opts: LabelOptions): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.logstash")
      @js.native
      def logstash(): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.metadata")
      @js.native
      def metadata(): typings.logform.mod.Format_ = js.native
      @JSImport("winston", "Logform.format.metadata")
      @js.native
      def metadata(opts: MetadataOptions): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.ms")
      @js.native
      def ms(): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.padLevels")
      @js.native
      def padLevels(): typings.logform.mod.Format_ = js.native
      @JSImport("winston", "Logform.format.padLevels")
      @js.native
      def padLevels(opts: PadLevelsOptions): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.prettyPrint")
      @js.native
      def prettyPrint(): typings.logform.mod.Format_ = js.native
      @JSImport("winston", "Logform.format.prettyPrint")
      @js.native
      def prettyPrint(opts: PrettyPrintOptions): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.printf")
      @js.native
      def printf(templateFunction: js.Function1[/* info */ TransformableInfo, String]): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.simple")
      @js.native
      def simple(): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.splat")
      @js.native
      def splat(): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.timestamp")
      @js.native
      def timestamp(): typings.logform.mod.Format_ = js.native
      @JSImport("winston", "Logform.format.timestamp")
      @js.native
      def timestamp(opts: TimestampOptions): typings.logform.mod.Format_ = js.native
      
      @JSImport("winston", "Logform.format.uncolorize")
      @js.native
      def uncolorize(): typings.logform.mod.Format_ = js.native
      @JSImport("winston", "Logform.format.uncolorize")
      @js.native
      def uncolorize(opts: UncolorizeOptions): typings.logform.mod.Format_ = js.native
    }
    
    @JSImport("winston", "Logform.levels")
    @js.native
    def levels(config: js.Object): js.Object = js.native
  }
  
  @JSImport("winston", "add")
  @js.native
  def add: js.Function1[/* transport */ typings.winstonTransport.mod.^, Logger] = js.native
  
  @JSImport("winston", "addColors")
  @js.native
  def addColors: js.Function1[/* target */ AbstractConfigSetColors, js.Any] = js.native
  @scala.inline
  def addColors_=(x: js.Function1[/* target */ AbstractConfigSetColors, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addColors")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def add_=(x: js.Function1[/* transport */ typings.winstonTransport.mod.^, Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("add")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "child")
  @js.native
  def child: js.Function1[/* options */ js.Object, Logger] = js.native
  @scala.inline
  def child_=(x: js.Function1[/* options */ js.Object, Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("child")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "clear")
  @js.native
  def clear: js.Function0[Logger] = js.native
  @scala.inline
  def clear_=(x: js.Function0[Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "config")
  @js.native
  val config: Config = js.native
  
  @JSImport("winston", "configure")
  @js.native
  def configure: js.Function1[/* options */ LoggerOptions, Unit] = js.native
  @scala.inline
  def configure_=(x: js.Function1[/* options */ LoggerOptions, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configure")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "createLogger")
  @js.native
  def createLogger: js.Function1[/* options */ js.UndefOr[LoggerOptions], Logger] = js.native
  @scala.inline
  def createLogger_=(x: js.Function1[/* options */ js.UndefOr[LoggerOptions], Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createLogger")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "debug")
  @js.native
  def debug: LeveledLogMethod = js.native
  @scala.inline
  def debug_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  
  // Pass-through npm level methods routed to the default logger.
  @JSImport("winston", "error")
  @js.native
  def error: LeveledLogMethod = js.native
  @scala.inline
  def error_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston", "exceptions")
  @js.native
  class exceptions protected () extends ExceptionHandler {
    def this(logger: Logger) = this()
  }
  object exceptions extends Shortcut {
    
    @JSImport("winston", "exceptions")
    @js.native
    val ^ : ExceptionHandler = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("winston", "exceptions.logger")
    @js.native
    class logger () extends Logger {
      def this(options: LoggerOptions) = this()
    }
    
    type _To = ExceptionHandler
    
    /* This means you don't have to write `^`, but can instead just say `exceptions.foo` */
    override def _to: ExceptionHandler = ^
  }
  
  @JSImport("winston", "exitOnError")
  @js.native
  def exitOnError: js.Function | Boolean = js.native
  @scala.inline
  def exitOnError_=(x: js.Function | Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exitOnError")(x.asInstanceOf[js.Any])
  
  object format {
    
    @JSImport("winston", "format")
    @js.native
    def apply(transform: TransformFunction): FormatWrap = js.native
    
    @JSImport("winston", "format.align")
    @js.native
    def align(): Format_ = js.native
    
    @JSImport("winston", "format.cli")
    @js.native
    def cli(): Format_ = js.native
    @JSImport("winston", "format.cli")
    @js.native
    def cli(opts: CliOptions): Format_ = js.native
    
    @JSImport("winston", "format.colorize")
    @js.native
    def colorize(): Colorizer = js.native
    @JSImport("winston", "format.colorize")
    @js.native
    def colorize(opts: ColorizeOptions): Colorizer = js.native
    
    @JSImport("winston", "format.combine")
    @js.native
    def combine(formats: Format_ *): Format_ = js.native
    
    @JSImport("winston", "format.errors")
    @js.native
    def errors(): Format_ = js.native
    @JSImport("winston", "format.errors")
    @js.native
    def errors(opts: js.Object): Format_ = js.native
    
    @JSImport("winston", "format.json")
    @js.native
    def json(): Format_ = js.native
    @JSImport("winston", "format.json")
    @js.native
    def json(opts: JsonOptions): Format_ = js.native
    
    @JSImport("winston", "format.label")
    @js.native
    def label(): Format_ = js.native
    @JSImport("winston", "format.label")
    @js.native
    def label(opts: LabelOptions): Format_ = js.native
    
    @JSImport("winston", "format.logstash")
    @js.native
    def logstash(): Format_ = js.native
    
    @JSImport("winston", "format.metadata")
    @js.native
    def metadata(): Format_ = js.native
    @JSImport("winston", "format.metadata")
    @js.native
    def metadata(opts: MetadataOptions): Format_ = js.native
    
    @JSImport("winston", "format.ms")
    @js.native
    def ms(): Format_ = js.native
    
    @JSImport("winston", "format.padLevels")
    @js.native
    def padLevels(): Format_ = js.native
    @JSImport("winston", "format.padLevels")
    @js.native
    def padLevels(opts: PadLevelsOptions): Format_ = js.native
    
    @JSImport("winston", "format.prettyPrint")
    @js.native
    def prettyPrint(): Format_ = js.native
    @JSImport("winston", "format.prettyPrint")
    @js.native
    def prettyPrint(opts: PrettyPrintOptions): Format_ = js.native
    
    @JSImport("winston", "format.printf")
    @js.native
    def printf(templateFunction: js.Function1[/* info */ TransformableInfo, String]): Format_ = js.native
    
    @JSImport("winston", "format.simple")
    @js.native
    def simple(): Format_ = js.native
    
    @JSImport("winston", "format.splat")
    @js.native
    def splat(): Format_ = js.native
    
    @JSImport("winston", "format.timestamp")
    @js.native
    def timestamp(): Format_ = js.native
    @JSImport("winston", "format.timestamp")
    @js.native
    def timestamp(opts: TimestampOptions): Format_ = js.native
    
    @JSImport("winston", "format.uncolorize")
    @js.native
    def uncolorize(): Format_ = js.native
    @JSImport("winston", "format.uncolorize")
    @js.native
    def uncolorize(opts: UncolorizeOptions): Format_ = js.native
  }
  
  @JSImport("winston", "http")
  @js.native
  def http: LeveledLogMethod = js.native
  @scala.inline
  def http_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("http")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "info")
  @js.native
  def info: LeveledLogMethod = js.native
  @scala.inline
  def info_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "level")
  @js.native
  def level: String = js.native
  @scala.inline
  def level_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("level")(x.asInstanceOf[js.Any])
  
  // Other pass-through methods routed to the default logger.
  @JSImport("winston", "log")
  @js.native
  def log: LogMethod = js.native
  @scala.inline
  def log_=(x: LogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston", "loggers")
  @js.native
  class loggers () extends Container {
    def this(options: LoggerOptions) = this()
  }
  @JSImport("winston", "loggers")
  @js.native
  def loggers: Container = js.native
  @scala.inline
  def loggers_=(x: Container): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loggers")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "profile")
  @js.native
  def profile: js.Function1[/* id */ String | Double, Logger] = js.native
  @scala.inline
  def profile_=(x: js.Function1[/* id */ String | Double, Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("profile")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "query")
  @js.native
  def query: js.Function2[
    /* options */ js.UndefOr[QueryOptions], 
    /* callback */ js.UndefOr[js.Function2[/* err */ Error, /* results */ js.Any, Unit]], 
    js.Any
  ] = js.native
  @scala.inline
  def query_=(
    x: js.Function2[
      /* options */ js.UndefOr[QueryOptions], 
      /* callback */ js.UndefOr[js.Function2[/* err */ Error, /* results */ js.Any, Unit]], 
      js.Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("query")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "remove")
  @js.native
  def remove: js.Function1[/* transport */ typings.winstonTransport.mod.^, Logger] = js.native
  @scala.inline
  def remove_=(x: js.Function1[/* transport */ typings.winstonTransport.mod.^, Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "silly")
  @js.native
  def silly: LeveledLogMethod = js.native
  @scala.inline
  def silly_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silly")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "startTimer")
  @js.native
  def startTimer: js.Function0[Profiler] = js.native
  @scala.inline
  def startTimer_=(x: js.Function0[Profiler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startTimer")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "stream")
  @js.native
  def stream: js.Function1[/* options */ js.UndefOr[js.Any], ReadableStream] = js.native
  @scala.inline
  def stream_=(x: js.Function1[/* options */ js.UndefOr[js.Any], ReadableStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "transport")
  @js.native
  class transport ()
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
    class Console () extends ConsoleTransportInstance {
      def this(options: ConsoleTransportOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("winston", "transports.File")
    @js.native
    class File () extends FileTransportInstance {
      def this(options: FileTransportOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("winston", "transports.Http")
    @js.native
    class Http () extends HttpTransportInstance {
      def this(options: HttpTransportOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("winston", "transports.Stream")
    @js.native
    class Stream () extends StreamTransportInstance {
      def this(options: StreamTransportOptions) = this()
    }
    
    type _To = Transports
    
    /* This means you don't have to write `^`, but can instead just say `transports.foo` */
    override def _to: Transports = ^
  }
  
  @JSImport("winston", "verbose")
  @js.native
  def verbose: LeveledLogMethod = js.native
  @scala.inline
  def verbose_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verbose")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @JSImport("winston", "warn")
  @js.native
  def warn: LeveledLogMethod = js.native
  @scala.inline
  def warn_=(x: LeveledLogMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  
  @js.native
  trait LeveledLogMethod extends StObject {
    
    def apply(infoObject: js.Object): Logger = js.native
    def apply(message: String, callback: LogCallback): Logger = js.native
    def apply(message: String, meta: js.Any*): Logger = js.native
    def apply(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
    def apply(message: js.Any): Logger = js.native
  }
  
  type LogCallback = js.Function4[
    /* error */ js.UndefOr[js.Any], 
    /* level */ js.UndefOr[String], 
    /* message */ js.UndefOr[String], 
    /* meta */ js.UndefOr[js.Any], 
    Unit
  ]
  
  @js.native
  trait LogEntry
    extends /* optionName */ StringDictionary[js.Any] {
    
    var level: String = js.native
    
    var message: String = js.native
  }
  object LogEntry {
    
    @scala.inline
    def apply(level: String, message: String): LogEntry = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogEntry]
    }
    
    @scala.inline
    implicit class LogEntryMutableBuilder[Self <: LogEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogMethod extends StObject {
    
    def apply(entry: LogEntry): Logger = js.native
    def apply(level: String, message: String, callback: LogCallback): Logger = js.native
    def apply(level: String, message: String, meta: js.Any*): Logger = js.native
    def apply(level: String, message: String, meta: js.Any, callback: LogCallback): Logger = js.native
    def apply(level: String, message: js.Any): Logger = js.native
  }
  
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
  
  @js.native
  trait LoggerOptions extends StObject {
    
    var defaultMeta: js.UndefOr[js.Any] = js.native
    
    var exceptionHandlers: js.UndefOr[js.Any] = js.native
    
    var exitOnError: js.UndefOr[js.Function | Boolean] = js.native
    
    var format: js.UndefOr[Format_] = js.native
    
    var handleExceptions: js.UndefOr[Boolean] = js.native
    
    var level: js.UndefOr[String] = js.native
    
    var levels: js.UndefOr[AbstractConfigSetLevels] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
    
    var transports: js.UndefOr[js.Array[typings.winstonTransport.mod.^] | typings.winstonTransport.mod.^] = js.native
  }
  object LoggerOptions {
    
    @scala.inline
    def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    @scala.inline
    implicit class LoggerOptionsMutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultMeta(value: js.Any): Self = StObject.set(x, "defaultMeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMetaUndefined: Self = StObject.set(x, "defaultMeta", js.undefined)
      
      @scala.inline
      def setExceptionHandlers(value: js.Any): Self = StObject.set(x, "exceptionHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionHandlersUndefined: Self = StObject.set(x, "exceptionHandlers", js.undefined)
      
      @scala.inline
      def setExitOnError(value: js.Function | Boolean): Self = StObject.set(x, "exitOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnErrorUndefined: Self = StObject.set(x, "exitOnError", js.undefined)
      
      @scala.inline
      def setFormat(value: Format_): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHandleExceptions(value: Boolean): Self = StObject.set(x, "handleExceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleExceptionsUndefined: Self = StObject.set(x, "handleExceptions", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setLevels(value: AbstractConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setTransports(value: js.Array[typings.winstonTransport.mod.^] | typings.winstonTransport.mod.^): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      @scala.inline
      def setTransportsVarargs(value: typings.winstonTransport.mod.^ *): Self = StObject.set(x, "transports", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Profiler extends StObject {
    
    def done(): Boolean = js.native
    def done(info: js.Any): Boolean = js.native
    
    var logger: Logger = js.native
    
    var start: Number = js.native
  }
  
  @js.native
  trait QueryOptions extends StObject {
    
    var fields: js.Any = js.native
    
    var from: js.UndefOr[Date] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[asc | desc] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var until: js.UndefOr[Date] = js.native
  }
  object QueryOptions {
    
    @scala.inline
    def apply(fields: js.Any): QueryOptions = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryOptions]
    }
    
    @scala.inline
    implicit class QueryOptionsMutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOrder(value: asc | desc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setUntil(value: Date): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
}
