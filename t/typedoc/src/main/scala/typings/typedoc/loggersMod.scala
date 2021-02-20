package typings.typedoc

import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggersMod {
  
  @JSImport("typedoc/dist/lib/utils/loggers", "CallbackLogger")
  @js.native
  class CallbackLogger protected () extends Logger {
    def this(callback: js.Function) = this()
    
    var callback: js.Function = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/loggers", "ConsoleLogger")
  @js.native
  class ConsoleLogger () extends Logger
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("typedoc/dist/lib/utils/loggers", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    
    @js.native
    sealed trait Error extends LogLevel
    /* 3 */ val Error: typings.typedoc.loggersMod.LogLevel.Error with Double = js.native
    
    @js.native
    sealed trait Info extends LogLevel
    /* 1 */ val Info: typings.typedoc.loggersMod.LogLevel.Info with Double = js.native
    
    @js.native
    sealed trait Success extends LogLevel
    /* 4 */ val Success: typings.typedoc.loggersMod.LogLevel.Success with Double = js.native
    
    @js.native
    sealed trait Verbose extends LogLevel
    /* 0 */ val Verbose: typings.typedoc.loggersMod.LogLevel.Verbose with Double = js.native
    
    @js.native
    sealed trait Warn extends LogLevel
    /* 2 */ val Warn: typings.typedoc.loggersMod.LogLevel.Warn with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/loggers", "Logger")
  @js.native
  class Logger () extends StObject {
    
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
