package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BankAccountTokenOptions extends js.Object {
  var account_holder_name: String = js.native
  var account_holder_type: String = js.native
  var account_number: String = js.native
  var country: String = js.native
  var currency: String = js.native
  var routing_number: String = js.native
}

object BankAccountTokenOptions {
  @scala.inline
  def apply(
    account_holder_name: String,
    account_holder_type: String,
    account_number: String,
    country: String,
    currency: String,
    routing_number: String
  ): BankAccountTokenOptions = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], account_holder_type = account_holder_type.asInstanceOf[js.Any], account_number = account_number.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccountTokenOptions]
  }
  @scala.inline
  implicit class BankAccountTokenOptionsOps[Self <: BankAccountTokenOptions] (val x: Self) extends AnyVal {
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
    def setAccount_number(value: String): Self = this.set("account_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouting_number(value: String): Self = this.set("routing_number", value.asInstanceOf[js.Any])
  }
  
}

