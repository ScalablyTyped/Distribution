package typings.stripe.stripeMod.paymentIntents

import typings.stripe.stripeStrings.any
import typings.stripe.stripeStrings.automatic
import typings.stripe.stripeStrings.challenge_only
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentMethodCardOptions extends js.Object {
  /**
    * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication based on risk level and other requirements. However, if you wish to request 3D Secure based on
    * logic from your own fraud engine, provide this option. Permitted values include: automatic, any, or challenge_only. If not provided, defaults to automatic.
    */
  var request_three_d_secure: js.UndefOr[automatic | challenge_only | any] = js.undefined
}

object IPaymentMethodCardOptions {
  @scala.inline
  def apply(request_three_d_secure: automatic | challenge_only | any = null): IPaymentMethodCardOptions = {
    val __obj = js.Dynamic.literal()
    if (request_three_d_secure != null) __obj.updateDynamic("request_three_d_secure")(request_three_d_secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodCardOptions]
  }
}

