package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBAlternateInterface extends js.Object {
  val alternateSetting: Double
  val endpoints: js.Array[USBEndpoint]
  val interfaceClass: Double
  val interfaceName: js.UndefOr[String] = js.undefined
  val interfaceProtocol: Double
  val interfaceSubclass: Double
}

object USBAlternateInterface {
  @scala.inline
  def apply(
    alternateSetting: Double,
    endpoints: js.Array[USBEndpoint],
    interfaceClass: Double,
    interfaceProtocol: Double,
    interfaceSubclass: Double,
    interfaceName: String = null
  ): USBAlternateInterface = {
    val __obj = js.Dynamic.literal(alternateSetting = alternateSetting.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], interfaceClass = interfaceClass.asInstanceOf[js.Any], interfaceProtocol = interfaceProtocol.asInstanceOf[js.Any], interfaceSubclass = interfaceSubclass.asInstanceOf[js.Any])
    if (interfaceName != null) __obj.updateDynamic("interfaceName")(interfaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBAlternateInterface]
  }
}

