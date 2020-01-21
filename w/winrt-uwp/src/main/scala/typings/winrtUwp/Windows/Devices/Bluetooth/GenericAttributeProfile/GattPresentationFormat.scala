package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of a single Presentation Format GATT Descriptor. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormat")
@js.native
abstract class GattPresentationFormat () extends js.Object {
  /** Gets the Description of the GattPresentationFormat object. */
  var description: Double = js.native
  /** Gets the Exponent of the GattPresentationFormat object. */
  var exponent: Double = js.native
  /** Gets the Format Type of the GattPresentationFormat object. */
  var formatType: Double = js.native
  /** Gets the Namespace of the GattPresentationFormat object. */
  var namespace: Double = js.native
  /** Gets the Unit of the GattPresentationFormat object. */
  var unit: Double = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormat")
@js.native
object GattPresentationFormat extends js.Object {
  /** Gets the value of the Bluetooth SIG Assigned Numbers Namespace. */
  var bluetoothSigAssignedNumbers: Double = js.native
}

