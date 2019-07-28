package typings.stripe.stripeMod.paymentIntentsNs

import typings.stripe.Anon_Returnurl
import typings.stripe.stripeStrings.redirect_to_url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentNextActionRedirectToUrl extends js.Object {
  /**
    * Contains instructions for authenticating a payment by redirecting your customer to another page or application.
    */
  var redirect_to_url: Anon_Returnurl
  var `type`: redirect_to_url
}

object IPaymentIntentNextActionRedirectToUrl {
  @scala.inline
  def apply(redirect_to_url: Anon_Returnurl, `type`: redirect_to_url): IPaymentIntentNextActionRedirectToUrl = {
    val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPaymentIntentNextActionRedirectToUrl]
  }
}

