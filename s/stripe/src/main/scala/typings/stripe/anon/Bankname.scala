package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bankname extends js.Object {
  var account_number: String = js.native
  var bank_name: String = js.native
  var fingerprint: String = js.native
  var refund_account_holder_name: js.UndefOr[String | Null] = js.native
  var refund_account_holder_type: js.UndefOr[String | Null] = js.native
  var refund_routing_number: js.UndefOr[String | Null] = js.native
  var routing_number: String = js.native
  var swift_code: String = js.native
}

object Bankname {
  @scala.inline
  def apply(
    account_number: String,
    bank_name: String,
    fingerprint: String,
    routing_number: String,
    swift_code: String
  ): Bankname = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_code = swift_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankname]
  }
  @scala.inline
  implicit class BanknameOps[Self <: Bankname] (val x: Self) extends AnyVal {
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
    def setAccount_number(value: String): Self = this.set("account_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setBank_name(value: String): Self = this.set("bank_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouting_number(value: String): Self = this.set("routing_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwift_code(value: String): Self = this.set("swift_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefund_account_holder_name(value: String): Self = this.set("refund_account_holder_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund_account_holder_name: Self = this.set("refund_account_holder_name", js.undefined)
    @scala.inline
    def setRefund_account_holder_nameNull: Self = this.set("refund_account_holder_name", null)
    @scala.inline
    def setRefund_account_holder_type(value: String): Self = this.set("refund_account_holder_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund_account_holder_type: Self = this.set("refund_account_holder_type", js.undefined)
    @scala.inline
    def setRefund_account_holder_typeNull: Self = this.set("refund_account_holder_type", null)
    @scala.inline
    def setRefund_routing_number(value: String): Self = this.set("refund_routing_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund_routing_number: Self = this.set("refund_routing_number", js.undefined)
    @scala.inline
    def setRefund_routing_numberNull: Self = this.set("refund_routing_number", null)
  }
  
}

