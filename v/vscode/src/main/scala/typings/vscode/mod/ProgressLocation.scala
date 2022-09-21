package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProgressLocation extends StObject
@JSImport("vscode", "ProgressLocation")
@js.native
object ProgressLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProgressLocation & Double] = js.native
  
  /**
    * Show progress as notification with an optional cancel button. Supports to show infinite and discrete
    * progress but does not support rendering of icons.
    */
  @js.native
  sealed trait Notification
    extends StObject
       with ProgressLocation
  /* 15 */ val Notification: typings.vscode.mod.ProgressLocation.Notification & Double = js.native
  
  /**
    * Show progress for the source control viewlet, as overlay for the icon and as progress bar
    * inside the viewlet (when visible). Neither supports cancellation nor discrete progress nor
    * a label to describe the operation.
    */
  @js.native
  sealed trait SourceControl
    extends StObject
       with ProgressLocation
  /* 1 */ val SourceControl: typings.vscode.mod.ProgressLocation.SourceControl & Double = js.native
  
  /**
    * Show progress in the status bar of the editor. Neither supports cancellation nor discrete progress.
    * Supports rendering of {@link ThemeIcon theme icons} via the `$(<name>)`-syntax in the progress label.
    */
  @js.native
  sealed trait Window
    extends StObject
       with ProgressLocation
  /* 10 */ val Window: typings.vscode.mod.ProgressLocation.Window & Double = js.native
}
