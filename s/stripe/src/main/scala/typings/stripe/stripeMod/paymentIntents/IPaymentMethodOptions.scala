package typings.stripe.stripeMod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentMethodOptions extends js.Object {
  /**
    * Configuration for any card payments attempted on this PaymentIntent.
    */
  var card: js.UndefOr[IPaymentMethodCardOptions] = js.undefined
}

object IPaymentMethodOptions {
  @scala.inline
  def apply(card: IPaymentMethodCardOptions = null): IPaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodOptions]
  }
}

