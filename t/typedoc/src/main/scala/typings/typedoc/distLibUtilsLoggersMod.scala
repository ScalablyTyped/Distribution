package typings.typedoc

import typings.typedoc.distLibUtilsMinimalSourceFileMod.MinimalSourceFile
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsLoggersMod {
  
  @JSImport("typedoc/dist/lib/utils/loggers", "CallbackLogger")
  @js.native
  open class CallbackLogger protected () extends Logger {
    /**
      * Create a new CallbackLogger instance.
      *
      * @param callback  The callback that should be used to log messages.
      */
    def this(callback: js.Function) = this()
    
    /**
      * This loggers callback function
      */
    var callback: js.Function = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/loggers", "ConsoleLogger")
  @js.native
  /**
    * Create a new ConsoleLogger instance.
    */
  open class ConsoleLogger () extends Logger
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("typedoc/dist/lib/utils/loggers", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with LogLevel
    /* 3 */ val Error: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Error & Double = js.native
    
    @js.native
    sealed trait Info
      extends StObject
         with LogLevel
    /* 1 */ val Info: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Info & Double = js.native
    
    @js.native
    sealed trait Verbose
      extends StObject
         with LogLevel
    /* 0 */ val Verbose: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Verbose & Double = js.native
    
    @js.native
    sealed trait Warn
      extends StObject
         with LogLevel
    /* 2 */ val Warn: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Warn & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/loggers", "Logger")
  @js.native
  open class Logger () extends StObject {
    
    /* protected */ def addContext(
      message: String,
      _level: LogLevel,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param _args because its type [ts.Node | undefined] | [number, MinimalSourceFile] is not an array type */ _args: js.Array[js.UndefOr[Node]]
    ): String = js.native
    /* protected */ def addContext(
      message: String,
      _level: LogLevel,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param _args because its type [ts.Node | undefined] | [number, MinimalSourceFile] is not an array type */ _args: js.Tuple2[Double, MinimalSourceFile]
    ): String = js.native
    
    /** @internal */
    def deprecated(text: String): Unit = js.native
    def deprecated(text: String, addStack: Boolean): Unit = js.native
    
    /**
      * Print the given TypeScript log message.
      *
      * @param diagnostic  The TypeScript message that should be logged.
      */
    def diagnostic(diagnostic: Diagnostic): Unit = js.native
    
    /**
      * Print the given TypeScript log messages.
      *
      * @param diagnostics  The TypeScript messages that should be logged.
      */
    def diagnostics(diagnostics: js.Array[Diagnostic]): Unit = js.native
    
    /**
      * Log the given error.
      *
      * @param text  The error that should be logged.
      * @param args  The arguments that should be printed into the given error.
      */
    def error(text: String): Unit = js.native
    def error(text: String, node: Node): Unit = js.native
    def error(text: String, pos: Double, file: MinimalSourceFile): Unit = js.native
    
    /**
      * How many error messages have been logged?
      */
    var errorCount: Double = js.native
    
    /**
      * Has an error been raised through the log method?
      */
    def hasErrors(): Boolean = js.native
    
    /**
      * Has a warning been raised through the log method?
      */
    def hasWarnings(): Boolean = js.native
    
    /** Log the given info message. */
    def info(text: String): Unit = js.native
    
    /**
      * The minimum logging level to print.
      */
    var level: LogLevel = js.native
    
    /**
      * Print a log message.
      *
      * @param _message The message itself.
      * @param level The urgency of the log message.
      */
    def log(_message: String, level: LogLevel): Unit = js.native
    
    /**
      * Reset the error counter.
      */
    def resetErrors(): Unit = js.native
    
    /**
      * Reset the warning counter.
      */
    def resetWarnings(): Unit = js.native
    
    /* private */ var seenErrors: Any = js.native
    
    /* private */ var seenWarnings: Any = js.native
    
    /**
      * Log the given verbose message.
      *
      * @param text  The message that should be logged.
      * @param args  The arguments that should be printed into the given message.
      */
    def verbose(text: String): Unit = js.native
    
    /**
      * Log the given warning.
      *
      * @param text  The warning that should be logged.
      * @param args  The arguments that should be printed into the given warning.
      */
    def warn(text: String): Unit = js.native
    def warn(text: String, node: Node): Unit = js.native
    def warn(text: String, pos: Double, file: MinimalSourceFile): Unit = js.native
    
    /**
      * How many warning messages have been logged?
      */
    var warningCount: Double = js.native
  }
}
