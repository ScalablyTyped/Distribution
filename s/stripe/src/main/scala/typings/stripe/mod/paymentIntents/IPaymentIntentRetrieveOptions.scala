package typings.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentIntentRetrieveOptions extends js.Object {
  /**
    * The client secret of the PaymentIntent. Required if a publishable key is used to retrieve the source.
    *
    * REQUIRED IF USING PUBLISHABLE KEY!
    */
  var client_secret: String = js.native
}

object IPaymentIntentRetrieveOptions {
  @scala.inline
  def apply(client_secret: String): IPaymentIntentRetrieveOptions = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentRetrieveOptions]
  }
  @scala.inline
  implicit class IPaymentIntentRetrieveOptionsOps[Self <: IPaymentIntentRetrieveOptions] (val x: Self) extends AnyVal {
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
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
  }
  
}

