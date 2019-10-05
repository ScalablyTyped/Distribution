package typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

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
  sealed trait writeWithResponse extends GattWriteOption
  
  /** The Write Without Response procedure shall be used. */
  @js.native
  sealed trait writeWithoutResponse extends GattWriteOption
  
  /* 0 */ val writeWithResponse: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteOption.writeWithResponse with Double = js.native
  /* 1 */ val writeWithoutResponse: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteOption.writeWithoutResponse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GattWriteOption with Double] = js.native
}

