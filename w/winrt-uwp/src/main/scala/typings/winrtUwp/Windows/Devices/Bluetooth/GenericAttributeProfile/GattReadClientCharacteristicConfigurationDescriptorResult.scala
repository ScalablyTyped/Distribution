package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of reading a GATT Client CharacteristicConfigurationClientDescriptor value. */
@js.native
trait GattReadClientCharacteristicConfigurationDescriptorResult extends StObject {
  
  /** Gets the result of an asynchronous read operation. */
  var clientCharacteristicConfigurationDescriptor: GattClientCharacteristicConfigurationDescriptorValue = js.native
  
  /** Gets the status of an asynchronous operation. */
  var status: GattCommunicationStatus = js.native
}
object GattReadClientCharacteristicConfigurationDescriptorResult {
  
  @scala.inline
  def apply(
    clientCharacteristicConfigurationDescriptor: GattClientCharacteristicConfigurationDescriptorValue,
    status: GattCommunicationStatus
  ): GattReadClientCharacteristicConfigurationDescriptorResult = {
    val __obj = js.Dynamic.literal(clientCharacteristicConfigurationDescriptor = clientCharacteristicConfigurationDescriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattReadClientCharacteristicConfigurationDescriptorResult]
  }
  
  @scala.inline
  implicit class GattReadClientCharacteristicConfigurationDescriptorResultMutableBuilder[Self <: GattReadClientCharacteristicConfigurationDescriptorResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientCharacteristicConfigurationDescriptor(value: GattClientCharacteristicConfigurationDescriptorValue): Self = StObject.set(x, "clientCharacteristicConfigurationDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: GattCommunicationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
