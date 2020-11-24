package typings.winrtUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothAddressType extends js.Object
/** Describes the Bluetooth address type. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothAddressType")
@js.native
object BluetoothAddressType extends js.Object {
  
  /** Public address. */
  @js.native
  sealed trait public extends BluetoothAddressType
  
  /** Random address. */
  @js.native
  sealed trait random extends BluetoothAddressType
}
