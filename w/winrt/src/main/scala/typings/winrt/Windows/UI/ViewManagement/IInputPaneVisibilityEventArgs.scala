package typings.winrt.Windows.UI.ViewManagement

import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputPaneVisibilityEventArgs extends js.Object {
  var ensuredFocusedElementInView: Boolean
  var occludedRect: Rect
}

object IInputPaneVisibilityEventArgs {
  @scala.inline
  def apply(ensuredFocusedElementInView: Boolean, occludedRect: Rect): IInputPaneVisibilityEventArgs = {
    val __obj = js.Dynamic.literal(ensuredFocusedElementInView = ensuredFocusedElementInView.asInstanceOf[js.Any], occludedRect = occludedRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputPaneVisibilityEventArgs]
  }
}

