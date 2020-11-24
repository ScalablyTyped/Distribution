package typings.winrtUwp.Windows.UI.ViewManagement

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the input pane Hiding and Showing events. */
@js.native
trait InputPaneVisibilityEventArgs extends js.Object {
  
  /** Identifies whether the application has taken steps to ensure that the input pane doesn't cover the UI element that has focus. */
  var ensuredFocusedElementInView: Boolean = js.native
  
  /** Gets the region of the application's window that the input pane is covering. */
  var occludedRect: Rect = js.native
}
object InputPaneVisibilityEventArgs {
  
  @scala.inline
  def apply(ensuredFocusedElementInView: Boolean, occludedRect: Rect): InputPaneVisibilityEventArgs = {
    val __obj = js.Dynamic.literal(ensuredFocusedElementInView = ensuredFocusedElementInView.asInstanceOf[js.Any], occludedRect = occludedRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputPaneVisibilityEventArgs]
  }
  
  @scala.inline
  implicit class InputPaneVisibilityEventArgsOps[Self <: InputPaneVisibilityEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnsuredFocusedElementInView(value: Boolean): Self = this.set("ensuredFocusedElementInView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccludedRect(value: Rect): Self = this.set("occludedRect", value.asInstanceOf[js.Any])
  }
}
