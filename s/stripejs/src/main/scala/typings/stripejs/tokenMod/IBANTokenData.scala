package typings.stripejs.tokenMod

import typings.stripejs.stripejsStrings.company
import typings.stripejs.stripejsStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBANTokenData extends js.Object {
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: String = js.native
  /**
    * The type of entity that holds the account.
    */
  var account_holder_type: individual | company = js.native
  /**
    * Three-letter ISO code for the currency paid out to the bank account
    * @example 'usd'
    */
  var currency: String = js.native
}

object IBANTokenData {
  @scala.inline
  def apply(account_holder_name: String, account_holder_type: individual | company, currency: String): IBANTokenData = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], account_holder_type = account_holder_type.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBANTokenData]
  }
  @scala.inline
  implicit class IBANTokenDataOps[Self <: IBANTokenData] (val x: Self) extends AnyVal {
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
    def setAccount_holder_type(value: individual | company): Self = this.set("account_holder_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
  }
  
}

