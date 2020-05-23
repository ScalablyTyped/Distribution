package typings.stripe.mod.paymentIntents

import typings.stripe.anon.Returnurl
import typings.stripe.stripeStrings.redirect_to_url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentNextActionRedirectToUrl extends js.Object {
  /**
    * Contains instructions for authenticating a payment by redirecting your customer to another page or application.
    */
  var redirect_to_url: Returnurl
  var `type`: redirect_to_url
}

object IPaymentIntentNextActionRedirectToUrl {
  @scala.inline
  def apply(redirect_to_url: Returnurl, `type`: redirect_to_url): IPaymentIntentNextActionRedirectToUrl = {
    val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentNextActionRedirectToUrl]
  }
}

