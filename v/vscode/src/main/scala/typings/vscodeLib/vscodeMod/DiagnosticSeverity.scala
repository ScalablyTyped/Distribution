package typings
package vscodeLib.vscodeMod

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
  sealed trait Error
    extends vscodeLib.vscodeMod.DiagnosticSeverity
  
  /**
  		 * Something to hint to a better way of doing it, like proposing
  		 * a refactoring.
  		 */
  @js.native
  sealed trait Hint
    extends vscodeLib.vscodeMod.DiagnosticSeverity
  
  /**
  		 * Something to inform about but not a problem.
  		 */
  @js.native
  sealed trait Information
    extends vscodeLib.vscodeMod.DiagnosticSeverity
  
  /**
  		 * Something suspicious but allowed.
  		 */
  @js.native
  sealed trait Warning
    extends vscodeLib.vscodeMod.DiagnosticSeverity
  
  /* 0 */ val Error: Error with scala.Double = js.native
  /* 3 */ val Hint: Hint with scala.Double = js.native
  /* 2 */ val Information: Information with scala.Double = js.native
  /* 1 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.DiagnosticSeverity with scala.Double] = js.native
}

