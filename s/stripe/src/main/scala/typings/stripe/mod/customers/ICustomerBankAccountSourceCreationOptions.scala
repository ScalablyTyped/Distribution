package typings.stripe.mod.customers

import typings.stripe.mod.bankAccounts.ISourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerBankAccountSourceCreationOptions extends ICustomerSourceCreationOptions {
  @JSName("source")
  var source_ICustomerBankAccountSourceCreationOptions: ISourceCreationOptions = js.native
}

object ICustomerBankAccountSourceCreationOptions {
  @scala.inline
  def apply(source: ISourceCreationOptions): ICustomerBankAccountSourceCreationOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerBankAccountSourceCreationOptions]
  }
  @scala.inline
  implicit class ICustomerBankAccountSourceCreationOptionsOps[Self <: ICustomerBankAccountSourceCreationOptions] (val x: Self) extends AnyVal {
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
    def setSource(value: ISourceCreationOptions): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

