package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GattCharacteristicProperties extends StObject
/** Specifies the values for the GATT characteristic properties as well as the GATT Extended Characteristic Properties Descriptor. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties")
@js.native
object GattCharacteristicProperties extends StObject {
  
  /** The characteristic supports signed writes */
  @js.native
  sealed trait authenticatedSignedWrites
    extends StObject
       with GattCharacteristicProperties
  
  /** The characteristic supports broadcasting */
  @js.native
  sealed trait broadcast
    extends StObject
       with GattCharacteristicProperties
  
  /** The ExtendedProperties Descriptor is present */
  @js.native
  sealed trait extendedProperties
    extends StObject
       with GattCharacteristicProperties
  
  /** The characteristic is indicatable */
  @js.native
  sealed trait indicate
    extends StObject
       with GattCharacteristicProperties
  
  /** The characteristic doesn’t have any properties that apply. */
  @js.native
  sealed trait none
    extends StObject
       with GattCharacteristicProperties
  
  /** The characteristic is notifiable */
  @js.native
  sealed trait notify
    extends StObject
       with GattCharacteristicProperties
  
  /** The characteristic is readable */
  @js.native
  sealed trait read
    extends StObject
       with GattCharacteristicProperties
  
  /** The characteristic supports reliable writes */
  @js.native
  sealed trait reliableWrites
    extends StObject
       with GattCharacteristicProperties
  
  /** The characteristic has writable auxiliaries */
  @js.native
  sealed trait writableAuxiliaries
    extends StObject
       with GattCharacteristicProperties
  
  /** The characteristic is writable */
  @js.native
  sealed trait write
    extends StObject
       with GattCharacteristicProperties
  
  /** The characteristic supports Write Without Response */
  @js.native
  sealed trait writeWithoutResponse
    extends StObject
       with GattCharacteristicProperties
}
