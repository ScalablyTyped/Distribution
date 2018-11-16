package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

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
  sealed trait aborted
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementWatcherStatus
  
  /** The initial status of the watcher. */
  @js.native
  sealed trait created
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementWatcherStatus
  
  /** The watcher is started. */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementWatcherStatus
  
  /** The watcher is stopped. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementWatcherStatus
  
  /** The watcher stop command was issued. */
  @js.native
  sealed trait stopping
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementWatcherStatus
  
  val aborted: aborted with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  val stopping: stopping with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementWatcherStatus with java.lang.String
  ] = js.native
}

