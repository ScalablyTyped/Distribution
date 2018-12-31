package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the app view switching behaviors for an app. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher")
@js.native
abstract class ApplicationViewSwitcher () extends js.Object

/** Represents the app view switching behaviors for an app. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher")
@js.native
object ApplicationViewSwitcher extends js.Object {
  var disableSystemViewActivationPolicy: js.Any = js.native
  /** Disables the primary window (app view) when the app is activated, showing the most recently displayed window instead. */
  def disableShowingMainViewOnActivation(): scala.Unit = js.native
   /* unmapped type */ /**
    * Prepares your app to visually transition between two windows with a custom animation.
    * @param toViewId The ID of the window from which your app is transitioning.
    * @param fromViewId The ID of the window to which your app is transitioning.
    * @param options Enumeration value that specifies thw view switching behaviors.
    * @return Asynchronously returns true if the call succeeds; false if it does not.
    */
  def prepareForCustomAnimatedSwitchAsync(
    toViewId: scala.Double,
    fromViewId: scala.Double,
    options: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewSwitchingOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Visually replaces the calling window (app view) with a specified window.
    * @param toViewId The ID of the window under preparation for display.
    * @param fromViewId The ID of the calling, currently displayed window.
    * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
    */
  def switchAsync(toViewId: scala.Double, fromViewId: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Visually replaces the calling window (app view) with a specified window.
    * @param toViewId The ID of the window under preparation for display.
    * @param fromViewId The ID of the calling, currently displayed window.
    * @param options Options for the display transition behaviors.
    * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
    */
  def switchAsync(
    toViewId: scala.Double,
    fromViewId: scala.Double,
    options: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewSwitchingOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Visually replaces the calling window (app view) with a specified window.
    * @param viewId The ID of the window under preparation for display.
    * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
    */
  def switchAsync(viewId: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Displays another window (app view) for the app on the screen, adjacent to the original window
    * @param viewId The ID of the new window to display.
    * @return Asynchronously returns true if the call succeeds; false if it does not.
    */
  def tryShowAsStandaloneAsync(viewId: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Displays another window (app view) for the app on the screen, adjacent to the original window
    * @param viewId The ID of the new window to display.
    * @param sizePreference The preferred general sizing of the new window.
    * @return Asynchronously returns true if the call succeeds; false if it does not.
    */
  def tryShowAsStandaloneAsync(
    viewId: scala.Double,
    sizePreference: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Displays another window (app view) for the app on the screen, adjacent to the original window.
    * @param viewId The ID of the new window to display.
    * @param sizePreference The preferred general sizing of the new window.
    * @param anchorViewId The ID of the calling (anchor) window.
    * @param anchorSizePreference The preferred new general sizing of the calling window if this call succeeds.
    * @return Asynchronously returns true if the call succeeds; false if it does not.
    */
  def tryShowAsStandaloneAsync(
    viewId: scala.Double,
    sizePreference: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference,
    anchorViewId: scala.Double,
    anchorSizePreference: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

