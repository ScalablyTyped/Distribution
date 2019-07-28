package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothLEAdvertisementWatcherStatus extends js.Object

/** Represents the possible states of the BluetoothLEAdvertisementWatcher . */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus")
@js.native
object BluetoothLEAdvertisementWatcherStatus extends js.Object {
  /** An error occurred during transition or scanning that stopped the watcher due to an error. */
  @js.native
  sealed trait aborted extends BluetoothLEAdvertisementWatcherStatus
  
  /** The initial status of the watcher. */
  @js.native
  sealed trait created extends BluetoothLEAdvertisementWatcherStatus
  
  /** The watcher is started. */
  @js.native
  sealed trait started extends BluetoothLEAdvertisementWatcherStatus
  
  /** The watcher is stopped. */
  @js.native
  sealed trait stopped extends BluetoothLEAdvertisementWatcherStatus
  
  /** The watcher stop command was issued. */
  @js.native
  sealed trait stopping extends BluetoothLEAdvertisementWatcherStatus
  
  /* 4 */ val aborted: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementWatcherStatus.aborted with Double = js.native
  /* 0 */ val created: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementWatcherStatus.created with Double = js.native
  /* 1 */ val started: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementWatcherStatus.started with Double = js.native
  /* 3 */ val stopped: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementWatcherStatus.stopped with Double = js.native
  /* 2 */ val stopping: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementWatcherStatus.stopping with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothLEAdvertisementWatcherStatus with Double] = js.native
}

