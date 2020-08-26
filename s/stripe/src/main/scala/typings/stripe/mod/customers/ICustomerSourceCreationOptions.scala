package typings.stripe.mod.customers

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.bankAccounts.ISourceCreationOptions
import typings.stripe.mod.cards.ICardSourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerSourceCreationOptions extends IDataOptionsWithMetadata {
  /**
    * When adding a card to a customer, the parameter name is source. When
    * adding to an account, the parameter name is external_account. The
    * value can either be a token, like the ones returned by our Stripe.js, or a
    * dictionary containing a user’s credit card details (with the options shown
    * below). Stripe will automatically validate the card.
    */
  var source: String | ICardSourceCreationOptions | ISourceCreationOptions = js.native
}

object ICustomerSourceCreationOptions {
  @scala.inline
  def apply(source: String | ICardSourceCreationOptions | ISourceCreationOptions): ICustomerSourceCreationOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerSourceCreationOptions]
  }
  @scala.inline
  implicit class ICustomerSourceCreationOptionsOps[Self <: ICustomerSourceCreationOptions] (val x: Self) extends AnyVal {
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
    def setSource(value: String | ICardSourceCreationOptions | ISourceCreationOptions): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

