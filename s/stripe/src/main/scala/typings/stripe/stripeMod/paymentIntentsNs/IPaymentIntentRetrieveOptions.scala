package typings.stripe.stripeMod.paymentIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentRetrieveOptions extends js.Object {
  /**
    * The client secret of the PaymentIntent. Required if a publishable key is used to retrieve the source.
    *
    * REQUIRED IF USING PUBLISHABLE KEY!
    */
  var client_secret: String
}

object IPaymentIntentRetrieveOptions {
  @scala.inline
  def apply(client_secret: String): IPaymentIntentRetrieveOptions = {
    val __obj = js.Dynamic.literal(client_secret = client_secret)
  
    __obj.asInstanceOf[IPaymentIntentRetrieveOptions]
  }
}

