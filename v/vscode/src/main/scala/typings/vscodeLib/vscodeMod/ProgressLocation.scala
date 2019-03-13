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
  		 * Show progress as notification with an optional cancel button. Supports to show infinite and discrete progress.
  		 */
  @js.native
  sealed trait Notification
    extends vscodeLib.vscodeMod.ProgressLocation
  
  /**
  		 * Show progress for the source control viewlet, as overlay for the icon and as progress bar
  		 * inside the viewlet (when visible). Neither supports cancellation nor discrete progress.
  		 */
  @js.native
  sealed trait SourceControl
    extends vscodeLib.vscodeMod.ProgressLocation
  
  /**
  		 * Show progress in the status bar of the editor. Neither supports cancellation nor discrete progress.
  		 */
  @js.native
  sealed trait Window
    extends vscodeLib.vscodeMod.ProgressLocation
  
  /* 15 */ val Notification: Notification with scala.Double = js.native
  /* 1 */ val SourceControl: SourceControl with scala.Double = js.native
  /* 10 */ val Window: Window with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.ProgressLocation with scala.Double] = js.native
}

