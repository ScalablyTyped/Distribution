package typings.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothAddressType extends StObject
/** Describes the Bluetooth address type. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothAddressType")
@js.native
object BluetoothAddressType extends StObject {
  
  /** Public address. */
  @js.native
  sealed trait public
    extends StObject
       with BluetoothAddressType
  
  /** Random address. */
  @js.native
  sealed trait random
    extends StObject
       with BluetoothAddressType
}
