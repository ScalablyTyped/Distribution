package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of reading a GATT Client CharacteristicConfigurationClientDescriptor value. */
@js.native
trait GattReadClientCharacteristicConfigurationDescriptorResult extends js.Object {
  
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
  implicit class GattReadClientCharacteristicConfigurationDescriptorResultOps[Self <: GattReadClientCharacteristicConfigurationDescriptorResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientCharacteristicConfigurationDescriptor(value: GattClientCharacteristicConfigurationDescriptorValue): Self = this.set("clientCharacteristicConfigurationDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: GattCommunicationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
