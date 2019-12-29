package typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothLEAdvertisementWatcherStatus with Double] = js.native
  /* 4 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 0 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 1 */ @js.native
  object started extends TopLevel[started with Double]
  
  /* 3 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
  /* 2 */ @js.native
  object stopping extends TopLevel[stopping with Double]
  
}

