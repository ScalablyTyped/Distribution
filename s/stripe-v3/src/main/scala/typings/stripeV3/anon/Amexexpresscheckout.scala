package typings.stripeV3.anon

import typings.stripeV3.stripeV3Strings.amex_express_checkout
import typings.stripeV3.stripeV3Strings.apple_pay
import typings.stripeV3.stripeV3Strings.google_pay
import typings.stripeV3.stripeV3Strings.masterpass
import typings.stripeV3.stripeV3Strings.samsung_pay
import typings.stripeV3.stripeV3Strings.visa_checkout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amexexpresscheckout extends js.Object {
  var amex_express_checkout: js.UndefOr[js.Any] = js.native
  var apple_pay: js.UndefOr[js.Any] = js.native
  var dynamic_last4: js.UndefOr[js.Any] = js.native
  var google_pay: js.UndefOr[js.Any] = js.native
  var masterpass: js.UndefOr[js.Any] = js.native
  var samsung_pay: js.UndefOr[js.Any] = js.native
  var `type`: amex_express_checkout | apple_pay | google_pay | masterpass | samsung_pay | visa_checkout = js.native
  var visa_checkout: js.UndefOr[js.Any] = js.native
}

object Amexexpresscheckout {
  @scala.inline
  def apply(`type`: amex_express_checkout | apple_pay | google_pay | masterpass | samsung_pay | visa_checkout): Amexexpresscheckout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amexexpresscheckout]
  }
  @scala.inline
  implicit class AmexexpresscheckoutOps[Self <: Amexexpresscheckout] (val x: Self) extends AnyVal {
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
    def setType(value: amex_express_checkout | apple_pay | google_pay | masterpass | samsung_pay | visa_checkout): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmex_express_checkout(value: js.Any): Self = this.set("amex_express_checkout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmex_express_checkout: Self = this.set("amex_express_checkout", js.undefined)
    @scala.inline
    def setApple_pay(value: js.Any): Self = this.set("apple_pay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApple_pay: Self = this.set("apple_pay", js.undefined)
    @scala.inline
    def setDynamic_last4(value: js.Any): Self = this.set("dynamic_last4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamic_last4: Self = this.set("dynamic_last4", js.undefined)
    @scala.inline
    def setGoogle_pay(value: js.Any): Self = this.set("google_pay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogle_pay: Self = this.set("google_pay", js.undefined)
    @scala.inline
    def setMasterpass(value: js.Any): Self = this.set("masterpass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterpass: Self = this.set("masterpass", js.undefined)
    @scala.inline
    def setSamsung_pay(value: js.Any): Self = this.set("samsung_pay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamsung_pay: Self = this.set("samsung_pay", js.undefined)
    @scala.inline
    def setVisa_checkout(value: js.Any): Self = this.set("visa_checkout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisa_checkout: Self = this.set("visa_checkout", js.undefined)
  }
  
}

