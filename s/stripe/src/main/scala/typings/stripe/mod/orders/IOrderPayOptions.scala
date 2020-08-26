package typings.stripe.mod.orders

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.cards.ICardSourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOrderPayOptions extends IDataOptionsWithMetadata {
  /**
    * A fee in cents/pence that will be applied to the order and transferred to the application owner's Stripe account. To use an application
    * fee, the request must be made on behalf of another account, using the Stripe-Account header or OAuth key. For more information, see
    * the application fees documentation.
    */
  var application_fee: js.UndefOr[Double] = js.native
  /**
    * The ID of an existing customer that will be charged in this request.
    *
    * Either customer or source is required
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * The email address of the customer placing the order. If a customer is specified, that customer's email address will be used.
    *
    * Optional, but required if not previously specified.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * A payment source to be charged, such as a credit card. If you also pass a customer ID, the source must be the ID of a source belonging
    * to the customer. Otherwise, if you do not pass a customer ID, the source you provide must either be a token, like the ones returned
    * by Stripe.js, or a object containing a user's credit card details, with the options described below. Although not all information is
    * required, the extra info helps prevent fraud.
    *
    * Either source or customer is required
    */
  var source: js.UndefOr[String | ICardSourceCreationOptions] = js.native
}

object IOrderPayOptions {
  @scala.inline
  def apply(): IOrderPayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOrderPayOptions]
  }
  @scala.inline
  implicit class IOrderPayOptionsOps[Self <: IOrderPayOptions] (val x: Self) extends AnyVal {
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
    def setApplication_fee(value: Double): Self = this.set("application_fee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication_fee: Self = this.set("application_fee", js.undefined)
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setSource(value: String | ICardSourceCreationOptions): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

