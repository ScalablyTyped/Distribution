package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagnosticTag extends js.Object

@JSImport("vscode", "DiagnosticTag")
@js.native
object DiagnosticTag extends js.Object {
  /**
  		 * Unused or unnecessary code.
  		 *
  		 * Diagnostics with this tag are rendered faded out. The amount of fading
  		 * is controlled by the `"editorUnnecessaryCode.opacity"` theme color. For
  		 * example, `"editorUnnecessaryCode.opacity": "#000000c0"` will render the
  		 * code with 75% opacity. For high contrast themes, use the
  		 * `"editorUnnecessaryCode.border"` theme color to underline unnecessary code
  		 * instead of fading it out.
  		 */
  @js.native
  sealed trait Unnecessary
    extends vscodeLib.vscodeMod.DiagnosticTag
  
  /* 1 */ val Unnecessary: Unnecessary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.DiagnosticTag with scala.Double] = js.native
}

