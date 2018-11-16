package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GattWriteOption extends js.Object

/** Indicates what type of write operation is to be performed. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteOption")
@js.native
object GattWriteOption extends js.Object {
  /** The default GATT write procedure shall be used. */
  @js.native
  sealed trait writeWithResponse
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattWriteOption
  
  /** The Write Without Response procedure shall be used. */
  @js.native
  sealed trait writeWithoutResponse
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattWriteOption
  
  val writeWithResponse: writeWithResponse with java.lang.String = js.native
  val writeWithoutResponse: writeWithoutResponse with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattWriteOption with java.lang.String
  ] = js.native
}

