package typings.stripe.mod.tokens

import typings.stripe.mod.cards.ICardSourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardTokenCreationOptions extends ITokenCreationOptionsBase {
  /**
    * The card this token will represent. If you also pass in a customer,
    * the card must be the ID of a card belonging to the customer.
    * Otherwise, if you do not pass a customer, a object containing a
    * user's credit card details, with the options described below.
    */
  var card: js.UndefOr[String | ICardSourceCreationOptions] = js.native
}

object ICardTokenCreationOptions {
  @scala.inline
  def apply(): ICardTokenCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardTokenCreationOptions]
  }
  @scala.inline
  implicit class ICardTokenCreationOptionsOps[Self <: ICardTokenCreationOptions] (val x: Self) extends AnyVal {
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
    def setCard(value: String | ICardSourceCreationOptions): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
  }
  
}

