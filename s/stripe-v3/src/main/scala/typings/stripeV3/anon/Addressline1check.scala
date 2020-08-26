package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addressline1check extends js.Object {
  var address_line1_check: Boolean | Null = js.native
  var address_postal_code_check: Boolean | Null = js.native
  var cvc_check: Boolean | Null = js.native
}

object Addressline1check {
  @scala.inline
  def apply(): Addressline1check = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Addressline1check]
  }
  @scala.inline
  implicit class Addressline1checkOps[Self <: Addressline1check] (val x: Self) extends AnyVal {
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
    def setAddress_line1_check(value: Boolean): Self = this.set("address_line1_check", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress_line1_checkNull: Self = this.set("address_line1_check", null)
    @scala.inline
    def setAddress_postal_code_check(value: Boolean): Self = this.set("address_postal_code_check", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress_postal_code_checkNull: Self = this.set("address_postal_code_check", null)
    @scala.inline
    def setCvc_check(value: Boolean): Self = this.set("cvc_check", value.asInstanceOf[js.Any])
    @scala.inline
    def setCvc_checkNull: Self = this.set("cvc_check", null)
  }
  
}

