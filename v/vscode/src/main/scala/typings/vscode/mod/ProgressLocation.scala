package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProgressLocation extends js.Object
@JSImport("vscode", "ProgressLocation")
@js.native
object ProgressLocation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProgressLocation with Double] = js.native
  
  /**
    * Show progress as notification with an optional cancel button. Supports to show infinite and discrete progress.
    */
  @js.native
  sealed trait Notification extends ProgressLocation
  /* 15 */ @js.native
  object Notification extends TopLevel[Notification with Double]
  
  /**
    * Show progress for the source control viewlet, as overlay for the icon and as progress bar
    * inside the viewlet (when visible). Neither supports cancellation nor discrete progress.
    */
  @js.native
  sealed trait SourceControl extends ProgressLocation
  /* 1 */ @js.native
  object SourceControl
    extends TopLevel[typings.vscode.mod.ProgressLocation.SourceControl with Double]
  
  /**
    * Show progress in the status bar of the editor. Neither supports cancellation nor discrete progress.
    */
  @js.native
  sealed trait Window extends ProgressLocation
  /* 10 */ @js.native
  object Window extends TopLevel[Window with Double]
}
