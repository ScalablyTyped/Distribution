package typings.winrtDashUwp.Windows.UI.ViewManagement

import typings.winrtDashUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the input pane Hiding and Showing events. */
@JSGlobal("Windows.UI.ViewManagement.InputPaneVisibilityEventArgs")
@js.native
abstract class InputPaneVisibilityEventArgs () extends js.Object {
  /** Identifies whether the application has taken steps to ensure that the input pane doesn't cover the UI element that has focus. */
  var ensuredFocusedElementInView: Boolean = js.native
  /** Gets the region of the application's window that the input pane is covering. */
  var occludedRect: Rect = js.native
}

