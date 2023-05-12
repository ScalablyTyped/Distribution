package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSImport("vscode", "LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
  
  /**
  		 * Messages with debug and higher log level are logged with this level.
  		 */
  @js.native
  sealed trait Debug
    extends StObject
       with LogLevel
  /* 2 */ val Debug: typings.vscode.mod.LogLevel.Debug & Double = js.native
  
  /**
  		 * Only error messages are logged with this level.
  		 */
  @js.native
  sealed trait Error
    extends StObject
       with LogLevel
  /* 5 */ val Error: typings.vscode.mod.LogLevel.Error & Double = js.native
  
  /**
  		 * Messages with info and higher log level are logged with this level.
  		 */
  @js.native
  sealed trait Info
    extends StObject
       with LogLevel
  /* 3 */ val Info: typings.vscode.mod.LogLevel.Info & Double = js.native
  
  /**
  		 * No messages are logged with this level.
  		 */
  @js.native
  sealed trait Off
    extends StObject
       with LogLevel
  /* 0 */ val Off: typings.vscode.mod.LogLevel.Off & Double = js.native
  
  /**
  		 * All messages are logged with this level.
  		 */
  @js.native
  sealed trait Trace
    extends StObject
       with LogLevel
  /* 1 */ val Trace: typings.vscode.mod.LogLevel.Trace & Double = js.native
  
  /**
  		 * Messages with warning and higher log level are logged with this level.
  		 */
  @js.native
  sealed trait Warning
    extends StObject
       with LogLevel
  /* 4 */ val Warning: typings.vscode.mod.LogLevel.Warning & Double = js.native
}
