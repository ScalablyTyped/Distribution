package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BankAccount extends js.Object {
  var account_holder_name: String = js.native
  var account_holder_type: String = js.native
  var bank_name: String = js.native
  var country: String = js.native
  var currency: String = js.native
  var fingerprint: String = js.native
  var id: String = js.native
  var last4: String = js.native
  var `object`: String = js.native
  var routing_number: String = js.native
  var status: statusType = js.native
}

object BankAccount {
  @scala.inline
  def apply(
    account_holder_name: String,
    account_holder_type: String,
    bank_name: String,
    country: String,
    currency: String,
    fingerprint: String,
    id: String,
    last4: String,
    `object`: String,
    routing_number: String,
    status: statusType
  ): BankAccount = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], account_holder_type = account_holder_type.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccount]
  }
  @scala.inline
  implicit class BankAccountOps[Self <: BankAccount] (val x: Self) extends AnyVal {
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
    def setAccount_holder_name(value: String): Self = this.set("account_holder_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount_holder_type(value: String): Self = this.set("account_holder_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBank_name(value: String): Self = this.set("bank_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouting_number(value: String): Self = this.set("routing_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: statusType): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

