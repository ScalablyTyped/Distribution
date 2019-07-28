package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of reading a GATT Client CharacteristicConfigurationClientDescriptor value. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadClientCharacteristicConfigurationDescriptorResult")
@js.native
abstract class GattReadClientCharacteristicConfigurationDescriptorResult () extends js.Object {
  /** Gets the result of an asynchronous read operation. */
  var clientCharacteristicConfigurationDescriptor: GattClientCharacteristicConfigurationDescriptorValue = js.native
  /** Gets the status of an asynchronous operation. */
  var status: GattCommunicationStatus = js.native
}

