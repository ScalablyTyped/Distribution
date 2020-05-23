package typings.winrtUwp.global.Windows.UI.ViewManagement

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the input pane Hiding and Showing events. */
@JSGlobal("Windows.UI.ViewManagement.InputPaneVisibilityEventArgs")
@js.native
abstract class InputPaneVisibilityEventArgs ()
  extends typings.winrtUwp.Windows.UI.ViewManagement.InputPaneVisibilityEventArgs {
  /** Identifies whether the application has taken steps to ensure that the input pane doesn't cover the UI element that has focus. */
  /* CompleteClass */
  override var ensuredFocusedElementInView: Boolean = js.native
  /** Gets the region of the application's window that the input pane is covering. */
  /* CompleteClass */
  override var occludedRect: Rect = js.native
}

