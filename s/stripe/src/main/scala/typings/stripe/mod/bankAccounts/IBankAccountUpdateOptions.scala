package typings.stripe.mod.bankAccounts

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBankAccountUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: js.UndefOr[String | Null] = js.native
  /**
    * The type of entity that holds the account. This can be either "individual" or "company".
    */
  var account_holder_type: js.UndefOr[individual | company | Null] = js.native
}

object IBankAccountUpdateOptions {
  @scala.inline
  def apply(): IBankAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBankAccountUpdateOptions]
  }
  @scala.inline
  implicit class IBankAccountUpdateOptionsOps[Self <: IBankAccountUpdateOptions] (val x: Self) extends AnyVal {
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
    def deleteAccount_holder_name: Self = this.set("account_holder_name", js.undefined)
    @scala.inline
    def setAccount_holder_nameNull: Self = this.set("account_holder_name", null)
    @scala.inline
    def setAccount_holder_type(value: individual | company): Self = this.set("account_holder_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_holder_type: Self = this.set("account_holder_type", js.undefined)
    @scala.inline
    def setAccount_holder_typeNull: Self = this.set("account_holder_type", null)
  }
  
}

