package typings.winrt.WindowsNs.UINs.ViewManagementNs

import typings.winrt.WindowsNs.FoundationNs.Rect
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
    val __obj = js.Dynamic.literal(ensuredFocusedElementInView = ensuredFocusedElementInView, occludedRect = occludedRect)
  
    __obj.asInstanceOf[IInputPaneVisibilityEventArgs]
  }
}

