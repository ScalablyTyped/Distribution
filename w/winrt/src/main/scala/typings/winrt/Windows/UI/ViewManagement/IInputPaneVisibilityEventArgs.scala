package typings.winrt.Windows.UI.ViewManagement

import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputPaneVisibilityEventArgs extends js.Object {
  var ensuredFocusedElementInView: Boolean = js.native
  var occludedRect: Rect = js.native
}

object IInputPaneVisibilityEventArgs {
  @scala.inline
  def apply(ensuredFocusedElementInView: Boolean, occludedRect: Rect): IInputPaneVisibilityEventArgs = {
    val __obj = js.Dynamic.literal(ensuredFocusedElementInView = ensuredFocusedElementInView.asInstanceOf[js.Any], occludedRect = occludedRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputPaneVisibilityEventArgs]
  }
  @scala.inline
  implicit class IInputPaneVisibilityEventArgsOps[Self <: IInputPaneVisibilityEventArgs] (val x: Self) extends AnyVal {
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

