package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GattWriteOption extends StObject
/** Indicates what type of write operation is to be performed. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteOption")
@js.native
object GattWriteOption extends StObject {
  
  /** The default GATT write procedure shall be used. */
  @js.native
  sealed trait writeWithResponse extends GattWriteOption
  
  /** The Write Without Response procedure shall be used. */
  @js.native
  sealed trait writeWithoutResponse extends GattWriteOption
}
