package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBConfiguration extends js.Object {
  val configurationName: js.UndefOr[String] = js.undefined
  val configurationValue: Double
  val interfaces: js.Array[USBInterface]
}

object USBConfiguration {
  @scala.inline
  def apply(configurationValue: Double, interfaces: js.Array[USBInterface], configurationName: String = null): USBConfiguration = {
    val __obj = js.Dynamic.literal(configurationValue = configurationValue.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any])
    if (configurationName != null) __obj.updateDynamic("configurationName")(configurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBConfiguration]
  }
}

