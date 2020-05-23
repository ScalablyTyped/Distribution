package typings.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of reading a GATT Client CharacteristicConfigurationClientDescriptor value. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadClientCharacteristicConfigurationDescriptorResult")
@js.native
abstract class GattReadClientCharacteristicConfigurationDescriptorResult ()
  extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadClientCharacteristicConfigurationDescriptorResult {
  /** Gets the result of an asynchronous read operation. */
  /* CompleteClass */
  override var clientCharacteristicConfigurationDescriptor: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue = js.native
  /** Gets the status of an asynchronous operation. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus = js.native
}

