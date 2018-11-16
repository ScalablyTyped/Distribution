package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object to receive Bluetooth Low Energy (LE) advertisements. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcher")
@js.native
class BluetoothLEAdvertisementWatcher () extends js.Object {
  /**
                       * Creates a new BluetoothLEAdvertisementWatcher object with an advertisement filter to initialize the watcher.
                       * @param advertisementFilter The advertisement filter to initialize the watcher.
                       */
  def this(advertisementFilter: BluetoothLEAdvertisementFilter) = this()
  /** Gets or sets a BluetoothLEAdvertisementFilter object used for configuration of Bluetooth LE advertisement filtering that uses payload section-based filtering. */
  var advertisementFilter: BluetoothLEAdvertisementFilter = js.native
  /** Gets the maximum out of range timeout. */
  var maxOutOfRangeTimeout: scala.Double = js.native
  /** Gets the maximum sampling interval. */
  var maxSamplingInterval: scala.Double = js.native
  /** Gets the minimum out of range timeout. */
  var minOutOfRangeTimeout: scala.Double = js.native
  /** Gets the minimum sampling interval. */
  var minSamplingInterval: scala.Double = js.native
  /** Notification for new Bluetooth LE advertisement events received. */
  @JSName("onreceived")
  var onreceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementReceivedEventArgs] = js.native
  /** Notification to the app that the Bluetooth LE scanning for advertisements has been cancelled or aborted either by the app or due to an error. */
  @JSName("onstopped")
  var onstopped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementWatcherStoppedEventArgs] = js.native
  /** Gets or sets the Bluetooth LE scanning mode. */
  var scanningMode: BluetoothLEScanningMode = js.native
  /** Gets or sets a BluetoothSignalStrengthFilter object used for configuration of Bluetooth LE advertisement filtering that uses signal strength-based filtering. */
  var signalStrengthFilter: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothSignalStrengthFilter = js.native
  /** Gets the current status of the BluetoothLEAdvertisementWatcher . */
  var status: BluetoothLEAdvertisementWatcherStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_received(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.received,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementWatcherStoppedEventArgs]
  ): scala.Unit = js.native
  /** Notification for new Bluetooth LE advertisement events received. */
  def onreceived(
    ev: BluetoothLEAdvertisementReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[BluetoothLEAdvertisementWatcher]
  ): scala.Unit = js.native
  /** Notification to the app that the Bluetooth LE scanning for advertisements has been cancelled or aborted either by the app or due to an error. */
  def onstopped(
    ev: BluetoothLEAdvertisementWatcherStoppedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[BluetoothLEAdvertisementWatcher]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_received(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.received,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementWatcherStoppedEventArgs]
  ): scala.Unit = js.native
  /** Start the BluetoothLEAdvertisementWatcher to scan for Bluetooth LE advertisements. */
  def start(): scala.Unit = js.native
  /** Stop the BluetoothLEAdvertisementWatcher and disable the scanning for Bluetooth LE advertisements. */
  def stop(): scala.Unit = js.native
}

