package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs

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
  sealed trait public
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothAddressType
  
  /** Random address. */
  @js.native
  sealed trait random
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothAddressType
  
  val public: public with java.lang.String = js.native
  val random: random with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothAddressType with java.lang.String
  ] = js.native
}

