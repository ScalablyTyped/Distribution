package typings.winrtUwp.global.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the connection status of the device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothConnectionStatus")
@js.native
object BluetoothConnectionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothConnectionStatus & Double] = js.native
  
  /* 1 */ val connected: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothConnectionStatus.connected & Double = js.native
  
  /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothConnectionStatus.disconnected & Double = js.native
}
