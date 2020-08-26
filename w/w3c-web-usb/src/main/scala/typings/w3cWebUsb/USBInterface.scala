package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBInterface extends js.Object {
  val alternate: USBAlternateInterface = js.native
  val alternates: js.Array[USBAlternateInterface] = js.native
  val claimed: Boolean = js.native
  val interfaceNumber: Double = js.native
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
  @scala.inline
  implicit class USBInterfaceOps[Self <: USBInterface] (val x: Self) extends AnyVal {
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
    def setAlternate(value: USBAlternateInterface): Self = this.set("alternate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlternatesVarargs(value: USBAlternateInterface*): Self = this.set("alternates", js.Array(value :_*))
    @scala.inline
    def setAlternates(value: js.Array[USBAlternateInterface]): Self = this.set("alternates", value.asInstanceOf[js.Any])
    @scala.inline
    def setClaimed(value: Boolean): Self = this.set("claimed", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterfaceNumber(value: Double): Self = this.set("interfaceNumber", value.asInstanceOf[js.Any])
  }
  
}

