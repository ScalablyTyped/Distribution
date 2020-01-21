package typings.stripe.mod.setupIntents

import typings.stripe.AnonAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentPaymentMethodOptions extends js.Object {
  /**
    * Configuration for any card payments attempted on this SetupIntent.
    */
  var card: js.UndefOr[AnonAny] = js.undefined
}

object ISetupIntentPaymentMethodOptions {
  @scala.inline
  def apply(card: AnonAny = null): ISetupIntentPaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentPaymentMethodOptions]
  }
}

