package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of reading a GATT Client CharacteristicConfigurationClientDescriptor value. */
trait GattReadClientCharacteristicConfigurationDescriptorResult extends js.Object {
  /** Gets the result of an asynchronous read operation. */
  var clientCharacteristicConfigurationDescriptor: GattClientCharacteristicConfigurationDescriptorValue
  /** Gets the status of an asynchronous operation. */
  var status: GattCommunicationStatus
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
}

