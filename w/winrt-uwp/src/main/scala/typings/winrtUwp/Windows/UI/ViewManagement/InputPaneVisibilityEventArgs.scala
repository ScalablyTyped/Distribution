package typings.winrtUwp.Windows.UI.ViewManagement

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the input pane Hiding and Showing events. */
trait InputPaneVisibilityEventArgs extends js.Object {
  /** Identifies whether the application has taken steps to ensure that the input pane doesn't cover the UI element that has focus. */
  var ensuredFocusedElementInView: Boolean
  /** Gets the region of the application's window that the input pane is covering. */
  var occludedRect: Rect
}

object InputPaneVisibilityEventArgs {
  @scala.inline
  def apply(ensuredFocusedElementInView: Boolean, occludedRect: Rect): InputPaneVisibilityEventArgs = {
    val __obj = js.Dynamic.literal(ensuredFocusedElementInView = ensuredFocusedElementInView.asInstanceOf[js.Any], occludedRect = occludedRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputPaneVisibilityEventArgs]
  }
}

