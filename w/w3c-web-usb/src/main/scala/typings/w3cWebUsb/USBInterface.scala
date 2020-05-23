package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBInterface extends js.Object {
  val alternate: USBAlternateInterface
  val alternates: js.Array[USBAlternateInterface]
  val claimed: Boolean
  val interfaceNumber: Double
}

object USBInterface {
  @scala.inline
  def apply(
    alternate: USBAlternateInterface,
    alternates: js.Array[USBAlternateInterface],
    claimed: Boolean,
    interfaceNumber: Double
  ): USBInterface = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], alternates = alternates.asInstanceOf[js.Any], claimed = claimed.asInstanceOf[js.Any], interfaceNumber = interfaceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBInterface]
  }
}

