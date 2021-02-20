package typings.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothConnectionStatus extends StObject
/** Indicates the connection status of the device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothConnectionStatus")
@js.native
object BluetoothConnectionStatus extends StObject {
  
  /** The device is connected. */
  @js.native
  sealed trait connected extends BluetoothConnectionStatus
  
  /** The device is disconnected. */
  @js.native
  sealed trait disconnected extends BluetoothConnectionStatus
}
