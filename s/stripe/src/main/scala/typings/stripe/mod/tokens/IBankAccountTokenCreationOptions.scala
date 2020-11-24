package typings.stripe.mod.tokens

import typings.stripe.mod.bankAccounts.ISourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBankAccountTokenCreationOptions extends ITokenCreationOptionsBase {
  
  /**
    * The bank account this token will represent. If you also pass in
    * a customer, the bank account must be the ID of a bank account
    * belonging to the customer.  Otherwise, if you do not pass a
    * customer, a object containing a user's bank account details,
    * with the options described below.
    */
  var bank_account: String | ISourceCreationOptions = js.native
}
object IBankAccountTokenCreationOptions {
  
  @scala.inline
  def apply(bank_account: String | ISourceCreationOptions): IBankAccountTokenCreationOptions = {
    val __obj = js.Dynamic.literal(bank_account = bank_account.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountTokenCreationOptions]
  }
  
  @scala.inline
  implicit class IBankAccountTokenCreationOptionsOps[Self <: IBankAccountTokenCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setBank_account(value: String | ISourceCreationOptions): Self = this.set("bank_account", value.asInstanceOf[js.Any])
  }
}
