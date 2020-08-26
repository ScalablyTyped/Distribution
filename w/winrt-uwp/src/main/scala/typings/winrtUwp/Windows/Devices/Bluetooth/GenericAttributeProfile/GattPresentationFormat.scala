package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of a single Presentation Format GATT Descriptor. */
@js.native
trait GattPresentationFormat extends js.Object {
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

object GattPresentationFormat {
  @scala.inline
  def apply(description: Double, exponent: Double, formatType: Double, namespace: Double, unit: Double): GattPresentationFormat = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exponent = exponent.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattPresentationFormat]
  }
  @scala.inline
  implicit class GattPresentationFormatOps[Self <: GattPresentationFormat] (val x: Self) extends AnyVal {
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
    def setDescription(value: Double): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setExponent(value: Double): Self = this.set("exponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatType(value: Double): Self = this.set("formatType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Double): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit(value: Double): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
  
}

