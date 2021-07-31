package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothLEAdvertisementWatcherStatus extends StObject
/** Represents the possible states of the BluetoothLEAdvertisementWatcher . */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus")
@js.native
object BluetoothLEAdvertisementWatcherStatus extends StObject {
  
  /** An error occurred during transition or scanning that stopped the watcher due to an error. */
  @js.native
  sealed trait aborted
    extends StObject
       with BluetoothLEAdvertisementWatcherStatus
  
  /** The initial status of the watcher. */
  @js.native
  sealed trait created
    extends StObject
       with BluetoothLEAdvertisementWatcherStatus
  
  /** The watcher is started. */
  @js.native
  sealed trait started
    extends StObject
       with BluetoothLEAdvertisementWatcherStatus
  
  /** The watcher is stopped. */
  @js.native
  sealed trait stopped
    extends StObject
       with BluetoothLEAdvertisementWatcherStatus
  
  /** The watcher stop command was issued. */
  @js.native
  sealed trait stopping
    extends StObject
       with BluetoothLEAdvertisementWatcherStatus
}
