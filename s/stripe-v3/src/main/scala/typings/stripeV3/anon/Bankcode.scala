package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bankcode extends js.Object {
  var bank_code: String | Null = js.native
  var country: String | Null = js.native
  var fingerprint: String = js.native
  var last4: String = js.native
  var mandate_reference: String = js.native
}

object Bankcode {
  @scala.inline
  def apply(fingerprint: String, last4: String, mandate_reference: String): Bankcode = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], mandate_reference = mandate_reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankcode]
  }
  @scala.inline
  implicit class BankcodeOps[Self <: Bankcode] (val x: Self) extends AnyVal {
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
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    @scala.inline
    def setMandate_reference(value: String): Self = this.set("mandate_reference", value.asInstanceOf[js.Any])
    @scala.inline
    def setBank_code(value: String): Self = this.set("bank_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setBank_codeNull: Self = this.set("bank_code", null)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryNull: Self = this.set("country", null)
  }
  
}

