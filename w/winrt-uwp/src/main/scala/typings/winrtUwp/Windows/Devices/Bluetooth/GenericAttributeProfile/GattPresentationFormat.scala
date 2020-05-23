package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of a single Presentation Format GATT Descriptor. */
trait GattPresentationFormat extends js.Object {
  /** Gets the Description of the GattPresentationFormat object. */
  var description: Double
  /** Gets the Exponent of the GattPresentationFormat object. */
  var exponent: Double
  /** Gets the Format Type of the GattPresentationFormat object. */
  var formatType: Double
  /** Gets the Namespace of the GattPresentationFormat object. */
  var namespace: Double
  /** Gets the Unit of the GattPresentationFormat object. */
  var unit: Double
}

object GattPresentationFormat {
  @scala.inline
  def apply(description: Double, exponent: Double, formatType: Double, namespace: Double, unit: Double): GattPresentationFormat = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exponent = exponent.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattPresentationFormat]
  }
}

