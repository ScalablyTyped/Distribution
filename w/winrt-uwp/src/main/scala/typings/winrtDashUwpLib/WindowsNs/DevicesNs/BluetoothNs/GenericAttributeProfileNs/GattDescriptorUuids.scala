package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an enumeration of the most well known Descriptor UUID values, and provides convenience methods for working with GATT descriptor UUIDs, and static properties providing descriptor UUIDs for common GATT descriptors. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids")
@js.native
abstract class GattDescriptorUuids () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids")
@js.native
object GattDescriptorUuids extends js.Object {
  /** Gets the Bluetooth SIG-defined Characteristic Aggregate Format Descriptor UUID. */
  var characteristicAggregateFormat: java.lang.String = js.native
  /** Gets the Bluetooth SIG-defined Characteristic Extended Properties Descriptor UUID. */
  var characteristicExtendedProperties: java.lang.String = js.native
  /** Gets the Bluetooth SIG-defined Characteristic Presentation Format Descriptor UUID. */
  var characteristicPresentationFormat: java.lang.String = js.native
  /** Gets the Bluetooth SIG-defined Characteristic User Description Descriptor UUID. */
  var characteristicUserDescription: java.lang.String = js.native
  /** Gets the Bluetooth SIG-defined Client Characteristic Configuration Descriptor UUID. */
  var clientCharacteristicConfiguration: java.lang.String = js.native
  /** Gets the Bluetooth SIG-defined Server Characteristic Configuration Descriptor UUID. */
  var serverCharacteristicConfiguration: java.lang.String = js.native
}

