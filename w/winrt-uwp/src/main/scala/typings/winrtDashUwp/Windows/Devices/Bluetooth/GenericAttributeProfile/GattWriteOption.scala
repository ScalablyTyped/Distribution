package typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteOption.writeWithResponse
import typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteOption.writeWithoutResponse
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GattWriteOption with Double] = js.native
  /* 0 */ @js.native
  object writeWithResponse extends TopLevel[writeWithResponse with Double]
  
  /* 1 */ @js.native
  object writeWithoutResponse extends TopLevel[writeWithoutResponse with Double]
  
}

