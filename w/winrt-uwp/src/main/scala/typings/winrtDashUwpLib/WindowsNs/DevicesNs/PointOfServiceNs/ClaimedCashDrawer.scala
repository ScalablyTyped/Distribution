package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to exclusive and privileged methods, properties, and events on a point-of-service cash drawer device. */
@JSGlobal("Windows.Devices.PointOfService.ClaimedCashDrawer")
@js.native
abstract class ClaimedCashDrawer () extends js.Object {
  /** Gets the close alarm for this cash drawer. This is only valid if IsDrawerOpenSensorAvailable is true. */
  var closeAlarm: CashDrawerCloseAlarm = js.native
  /** The identifier string of the claimed cash drawer device. */
  var deviceId: java.lang.String = js.native
  /** Indicates whether the cash drawer is open. */
  var isDrawerOpen: scala.Boolean = js.native
  /** Indicates whether the cash drawer is operational and can be used. */
  var isEnabled: scala.Boolean = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  @JSName("onreleasedevicerequested")
  var onreleasedevicerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedCashDrawer, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_releasedevicerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.releasedevicerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedCashDrawer, _]
  ): scala.Unit = js.native
  /** Disposes the claimed cash drawer, releases claim on the device, and disables the device the same way as calling DisableAsync. */
  def close(): scala.Unit = js.native
  /**
    * Notifies the underlying hardware to power off.
    * @return Whether the attempt to disable succeeded or not.
    */
  def disableAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Asynchronously notifies the underlying hardware to power on for use.
    * @return Whether the attempt to enable succeeded or not.
    */
  def enableAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  def onreleasedevicerequested(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[ClaimedCashDrawer]): scala.Unit = js.native
  /**
    * Opens the cash drawer.
    * @return Boolean indicating whether the drawer was successfully opened.
    */
  def openDrawerAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_releasedevicerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.releasedevicerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedCashDrawer, _]
  ): scala.Unit = js.native
  /**
    * Resets the specified device statistics to their defaults.
    * @param statisticsCategories The list of names of the statistics to reset.
    * @return True on success; otherwise false.
    */
  def resetStatisticsAsync(
    statisticsCategories: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Retain the current claim on the cash drawer. This is usually called in response to a ReleaseDeviceRequested event notification.
    * @return True if the retain attempt succeeded; false if the retain attempt failed.
    */
  def retainDeviceAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Updates device statistics values using the provided key/value pair.
    * @param statistics The statistics to update.
    * @return True if update succeeded; otherwise false.
    */
  def updateStatisticsAsync(
    statistics: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

