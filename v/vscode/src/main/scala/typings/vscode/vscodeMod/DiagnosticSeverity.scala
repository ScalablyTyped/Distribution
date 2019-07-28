package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagnosticSeverity extends js.Object

@JSImport("vscode", "DiagnosticSeverity")
@js.native
object DiagnosticSeverity extends js.Object {
  /**
  		 * Something not allowed by the rules of a language or other means.
  		 */
  @js.native
  sealed trait Error extends DiagnosticSeverity
  
  /**
  		 * Something to hint to a better way of doing it, like proposing
  		 * a refactoring.
  		 */
  @js.native
  sealed trait Hint extends DiagnosticSeverity
  
  /**
  		 * Something to inform about but not a problem.
  		 */
  @js.native
  sealed trait Information extends DiagnosticSeverity
  
  /**
  		 * Something suspicious but allowed.
  		 */
  @js.native
  sealed trait Warning extends DiagnosticSeverity
  
  /* 0 */ val Error: typings.vscode.vscodeMod.DiagnosticSeverity.Error with Double = js.native
  /* 3 */ val Hint: typings.vscode.vscodeMod.DiagnosticSeverity.Hint with Double = js.native
  /* 2 */ val Information: typings.vscode.vscodeMod.DiagnosticSeverity.Information with Double = js.native
  /* 1 */ val Warning: typings.vscode.vscodeMod.DiagnosticSeverity.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticSeverity with Double] = js.native
}

