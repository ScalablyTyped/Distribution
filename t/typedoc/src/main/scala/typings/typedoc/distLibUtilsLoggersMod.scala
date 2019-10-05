package typings.typedoc

import typings.typedoc.distLibUtilsLoggersMod.LogLevel
import typings.typedoc.distLibUtilsLoggersMod.Logger
import typings.typescript.typescriptMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/loggers", JSImport.Namespace)
@js.native
object distLibUtilsLoggersMod extends js.Object {
  @js.native
  class CallbackLogger protected () extends Logger {
    def this(callback: js.Function) = this()
    var callback: js.Function = js.native
  }
  
  @js.native
  class ConsoleLogger () extends Logger
  
  @js.native
  sealed trait LogLevel extends js.Object
  
  @js.native
  class Logger () extends js.Object {
    var errorCount: Double = js.native
    def diagnostic(diagnostic: Diagnostic): Unit = js.native
    def diagnostics(diagnostics: js.Array[Diagnostic]): Unit = js.native
    def error(text: String, args: String*): Unit = js.native
    def hasErrors(): Boolean = js.native
    def log(message: String): Unit = js.native
    def log(message: String, level: LogLevel): Unit = js.native
    def log(message: String, level: LogLevel, newLine: Boolean): Unit = js.native
    def resetErrors(): Unit = js.native
    def success(text: String, args: String*): Unit = js.native
    def verbose(text: String, args: String*): Unit = js.native
    def warn(text: String, args: String*): Unit = js.native
    def write(text: String, args: String*): Unit = js.native
    def writeln(text: String, args: String*): Unit = js.native
  }
  
  @js.native
  object LogLevel extends js.Object {
    @js.native
    sealed trait Error extends LogLevel
    
    @js.native
    sealed trait Info extends LogLevel
    
    @js.native
    sealed trait Success extends LogLevel
    
    @js.native
    sealed trait Verbose extends LogLevel
    
    @js.native
    sealed trait Warn extends LogLevel
    
    /* 3 */ val Error: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Error with Double = js.native
    /* 1 */ val Info: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Info with Double = js.native
    /* 4 */ val Success: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Success with Double = js.native
    /* 0 */ val Verbose: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Verbose with Double = js.native
    /* 2 */ val Warn: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  }
  
}

