package typings.winrtDashUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val public: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothAddressType.public with Double = js.native
  /* 1 */ val random: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothAddressType.random with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothAddressType with Double] = js.native
}

