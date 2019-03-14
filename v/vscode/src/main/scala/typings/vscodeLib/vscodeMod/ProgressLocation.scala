package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProgressLocation extends js.Object

@JSImport("vscode", "ProgressLocation")
@js.native
object ProgressLocation extends js.Object {
  /**
  		 * Show progress for the source control viewlet, as overlay for the icon and as progress bar
  		 * inside the viewlet (when visible).
  		 */
  @js.native
  sealed trait SourceControl
    extends vscodeLib.vscodeMod.ProgressLocation
  
  /**
  		 * Show progress in the status bar of the editor.
  		 */
  @js.native
  sealed trait Window
    extends vscodeLib.vscodeMod.ProgressLocation
  
  /* 1 */ val SourceControl: SourceControl with scala.Double = js.native
  /* 10 */ val Window: Window with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.ProgressLocation with scala.Double] = js.native
}

