package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.releasedevicerequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to exclusive and privileged methods, properties, and events on a point-of-service cash drawer device. */
@js.native
trait ClaimedCashDrawer extends js.Object {
  /** Gets the close alarm for this cash drawer. This is only valid if IsDrawerOpenSensorAvailable is true. */
  var closeAlarm: CashDrawerCloseAlarm = js.native
  /** The identifier string of the claimed cash drawer device. */
  var deviceId: String = js.native
  /** Indicates whether the cash drawer is open. */
  var isDrawerOpen: Boolean = js.native
  /** Indicates whether the cash drawer is operational and can be used. */
  var isEnabled: Boolean = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  @JSName("onreleasedevicerequested")
  var onreleasedevicerequested_Original: TypedEventHandler[ClaimedCashDrawer, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_releasedevicerequested(`type`: releasedevicerequested, listener: TypedEventHandler[ClaimedCashDrawer, _]): Unit = js.native
  /** Disposes the claimed cash drawer, releases claim on the device, and disables the device the same way as calling DisableAsync. */
  def close(): Unit = js.native
  /**
    * Notifies the underlying hardware to power off.
    * @return Whether the attempt to disable succeeded or not.
    */
  def disableAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Asynchronously notifies the underlying hardware to power on for use.
    * @return Whether the attempt to enable succeeded or not.
    */
  def enableAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  def onreleasedevicerequested(ev: js.Any with WinRTEvent[ClaimedCashDrawer]): Unit = js.native
  /**
    * Opens the cash drawer.
    * @return Boolean indicating whether the drawer was successfully opened.
    */
  def openDrawerAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_releasedevicerequested(`type`: releasedevicerequested, listener: TypedEventHandler[ClaimedCashDrawer, _]): Unit = js.native
  /**
    * Resets the specified device statistics to their defaults.
    * @param statisticsCategories The list of names of the statistics to reset.
    * @return True on success; otherwise false.
    */
  def resetStatisticsAsync(statisticsCategories: IIterable[String]): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Retain the current claim on the cash drawer. This is usually called in response to a ReleaseDeviceRequested event notification.
    * @return True if the retain attempt succeeded; false if the retain attempt failed.
    */
  def retainDeviceAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Updates device statistics values using the provided key/value pair.
    * @param statistics The statistics to update.
    * @return True if update succeeded; otherwise false.
    */
  def updateStatisticsAsync(statistics: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncOperation[Boolean] = js.native
}

