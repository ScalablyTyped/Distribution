package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a set of methods for managing the windows (app views) sent to secondary displays, such as projectors. */
@JSGlobal("Windows.UI.ViewManagement.ProjectionManager")
@js.native
abstract class ProjectionManager () extends js.Object

/** Defines a set of methods for managing the windows (app views) sent to secondary displays, such as projectors. */
@JSGlobal("Windows.UI.ViewManagement.ProjectionManager")
@js.native
object ProjectionManager extends js.Object {
  /** Occurs when a projector or other secondary display becomes available or unavailable. */
  @JSName("onprojectiondisplayavailablechanged")
  var onprojectiondisplayavailablechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Gets whether or not a projection display is available to use. */
  var projectionDisplayAvailable: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_projectiondisplayavailablechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.projectiondisplayavailablechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
                   * Returns a string that is used to enumerate device services.
                   * @return A string that is used to enumerate device services.
                   */
  def getDeviceSelector(): java.lang.String = js.native
  /** Occurs when a projector or other secondary display becomes available or unavailable. */
  def onprojectiondisplayavailablechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_projectiondisplayavailablechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.projectiondisplayavailablechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
                   * Makes a request to asynchronously sends a window (app view) to the projector or other secondary display.
                   * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
                   * @param anchorViewId The ID of the original window before projection.
                   * @param selection The area to one side of which the flyout is displayed.
                   * @return true if projection started; otherwise, false.
                   */
  def requestStartProjectingAsync(
    projectionViewId: scala.Double,
    anchorViewId: scala.Double,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Makes a request to asynchronously sends a window (app view) to the projector or other secondary display with the specified preferred placement.
                   * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
                   * @param anchorViewId The ID of the original window before projection.
                   * @param selection The area to one side of which the flyout is displayed.
                   * @param prefferedPlacement The side of the rectangle where the flyout should appear.
                   * @return true if projection started; otherwise, false.
                   */
  def requestStartProjectingAsync(
    projectionViewId: scala.Double,
    anchorViewId: scala.Double,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    prefferedPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Asynchronously sends a window (app view) to the projector or other secondary display.
                   * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
                   * @param anchorViewId The ID of the original window before projection.
                   * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
                   */
  def startProjectingAsync(projectionViewId: scala.Double, anchorViewId: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously sends a window (app view) to the projector or other secondary display, and provides info about the display.
                   * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
                   * @param anchorViewId The ID of the original window before projection.
                   * @param displayDeviceInfo Information about the display device.
                   * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
                   */
  def startProjectingAsync(
    projectionViewId: scala.Double,
    anchorViewId: scala.Double,
    displayDeviceInfo: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously hides a window (app view) displayed by a projector or other secondary display.
                   * @param projectionViewId The ID of the window currently displayed by the projector or other secondary display.
                   * @param anchorViewId The ID of the original window before projection.
                   * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
                   */
  def stopProjectingAsync(projectionViewId: scala.Double, anchorViewId: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously swaps the calling window (app view) with the window displayed on the projector or other secondary display. The result is that the calling window is displayed on the projector, and the formerly projected window is displayed on the device screen.
                   * @param projectionViewId The ID of the window currently displayed by the projector.
                   * @param anchorViewId The ID of the window to swap with the projected window.
                   * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
                   */
  def swapDisplaysForViewsAsync(projectionViewId: scala.Double, anchorViewId: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

