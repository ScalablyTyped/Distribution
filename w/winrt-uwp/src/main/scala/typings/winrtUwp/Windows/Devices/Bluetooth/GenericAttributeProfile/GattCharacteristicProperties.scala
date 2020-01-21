package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GattCharacteristicProperties extends js.Object

/** Specifies the values for the GATT characteristic properties as well as the GATT Extended Characteristic Properties Descriptor. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties")
@js.native
object GattCharacteristicProperties extends js.Object {
  /** The characteristic supports signed writes */
  @js.native
  sealed trait authenticatedSignedWrites extends GattCharacteristicProperties
  
  /** The characteristic supports broadcasting */
  @js.native
  sealed trait broadcast extends GattCharacteristicProperties
  
  /** The ExtendedProperties Descriptor is present */
  @js.native
  sealed trait extendedProperties extends GattCharacteristicProperties
  
  /** The characteristic is indicatable */
  @js.native
  sealed trait indicate extends GattCharacteristicProperties
  
  /** The characteristic doesn’t have any properties that apply. */
  @js.native
  sealed trait none extends GattCharacteristicProperties
  
  /** The characteristic is notifiable */
  @js.native
  sealed trait notify extends GattCharacteristicProperties
  
  /** The characteristic is readable */
  @js.native
  sealed trait read extends GattCharacteristicProperties
  
  /** The characteristic supports reliable writes */
  @js.native
  sealed trait reliableWrites extends GattCharacteristicProperties
  
  /** The characteristic has writable auxiliaries */
  @js.native
  sealed trait writableAuxiliaries extends GattCharacteristicProperties
  
  /** The characteristic is writable */
  @js.native
  sealed trait write extends GattCharacteristicProperties
  
  /** The characteristic supports Write Without Response */
  @js.native
  sealed trait writeWithoutResponse extends GattCharacteristicProperties
  
  /* 5 */ @JSName("notify")
  val notify_ : notify with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GattCharacteristicProperties with Double] = js.native
  /* 7 */ @js.native
  object authenticatedSignedWrites extends TopLevel[authenticatedSignedWrites with Double]
  
  /* 1 */ @js.native
  object broadcast extends TopLevel[broadcast with Double]
  
  /* 8 */ @js.native
  object extendedProperties extends TopLevel[extendedProperties with Double]
  
  /* 6 */ @js.native
  object indicate extends TopLevel[indicate with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object read extends TopLevel[read with Double]
  
  /* 9 */ @js.native
  object reliableWrites extends TopLevel[reliableWrites with Double]
  
  /* 10 */ @js.native
  object writableAuxiliaries extends TopLevel[writableAuxiliaries with Double]
  
  /* 4 */ @js.native
  object write extends TopLevel[write with Double]
  
  /* 3 */ @js.native
  object writeWithoutResponse extends TopLevel[writeWithoutResponse with Double]
  
}

