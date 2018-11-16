package typings
package winrtDashUwpLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a context menu. */
@JSGlobal("Windows.UI.Popups.PopupMenu")
@js.native
class PopupMenu () extends js.Object {
  /** Gets the commands for the context menu. */
  var commands: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[IUICommand] = js.native
  /**
                   * Shows the context menu at the specified client coordinates.
                   * @param invocationPoint The coordinates (in DIPs), relative to the window, of the user's finger or mouse pointer when the oncontextmenu event fired. The menu is placed above and centered on this point.
                   * @return A IUICommand object that represents the context menu command that was invoked by the user, after the ShowAsync call completes.
                   */
  def showAsync(invocationPoint: winrtDashUwpLib.WindowsNs.FoundationNs.Point): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[IUICommand] = js.native
  /**
                   * Shows the context menu above the specified selection.
                   * @param selection The coordinates (in DIPs) of the selected rectangle, relative to the window. The context menu is placed directly above and centered on this rectangle such that selection is not covered.
                   * @return A IUICommand object that represents the context menu command invoked by the user, after the ShowForSelectionAsync call completes.
                   */
  def showForSelectionAsync(selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[IUICommand] = js.native
  /**
                   * Shows the context menu in the preferred placement relative to the specified selection.
                   * @param selection The coordinates (in DIPs) of the selected rectangle, relative to the window.
                   * @param preferredPlacement The preferred placement of the context menu relative to the selection rectangle.
                   * @return A IUICommand object that represents the context menu command invoked by the user, after the ShowForSelectionAsync call completes.
                   */
  def showForSelectionAsync(selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect, preferredPlacement: Placement): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[IUICommand] = js.native
}

