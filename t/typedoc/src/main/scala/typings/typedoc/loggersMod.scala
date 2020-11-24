package typings.typedoc

import org.scalablytyped.runtime.TopLevel
import typings.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/utils/loggers", JSImport.Namespace)
@js.native
object loggersMod extends js.Object {
  
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
  object LogLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    
    @js.native
    sealed trait Error extends LogLevel
    /* 3 */ @js.native
    object Error extends TopLevel[Error with Double]
    
    @js.native
    sealed trait Info extends LogLevel
    /* 1 */ @js.native
    object Info extends TopLevel[Info with Double]
    
    @js.native
    sealed trait Success extends LogLevel
    /* 4 */ @js.native
    object Success extends TopLevel[Success with Double]
    
    @js.native
    sealed trait Verbose extends LogLevel
    /* 0 */ @js.native
    object Verbose extends TopLevel[Verbose with Double]
    
    @js.native
    sealed trait Warn extends LogLevel
    /* 2 */ @js.native
    object Warn extends TopLevel[Warn with Double]
  }
  
  @js.native
  class Logger () extends js.Object {
    
    def diagnostic(diagnostic: Diagnostic): Unit = js.native
    
    def diagnostics(diagnostics: js.Array[Diagnostic]): Unit = js.native
    
    def error(text: String, args: String*): Unit = js.native
    
    var errorCount: Double = js.native
    
    def hasErrors(): Boolean = js.native
    
    def hasWarnings(): Boolean = js.native
    
    def log(message: String): Unit = js.native
    def log(message: String, level: js.UndefOr[scala.Nothing], newLine: Boolean): Unit = js.native
    def log(message: String, level: LogLevel): Unit = js.native
    def log(message: String, level: LogLevel, newLine: Boolean): Unit = js.native
    
    def resetErrors(): Unit = js.native
    
    def resetWarnings(): Unit = js.native
    
    def success(text: String, args: String*): Unit = js.native
    
    def verbose(text: String, args: String*): Unit = js.native
    
    def warn(text: String, args: String*): Unit = js.native
    
    var warningCount: Double = js.native
    
    def write(text: String, args: String*): Unit = js.native
    
    def writeln(text: String, args: String*): Unit = js.native
  }
}
