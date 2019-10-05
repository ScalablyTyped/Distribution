package typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

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
  var characteristicAggregateFormat: String = js.native
  /** Gets the Bluetooth SIG-defined Characteristic Extended Properties Descriptor UUID. */
  var characteristicExtendedProperties: String = js.native
  /** Gets the Bluetooth SIG-defined Characteristic Presentation Format Descriptor UUID. */
  var characteristicPresentationFormat: String = js.native
  /** Gets the Bluetooth SIG-defined Characteristic User Description Descriptor UUID. */
  var characteristicUserDescription: String = js.native
  /** Gets the Bluetooth SIG-defined Client Characteristic Configuration Descriptor UUID. */
  var clientCharacteristicConfiguration: String = js.native
  /** Gets the Bluetooth SIG-defined Server Characteristic Configuration Descriptor UUID. */
  var serverCharacteristicConfiguration: String = js.native
}

