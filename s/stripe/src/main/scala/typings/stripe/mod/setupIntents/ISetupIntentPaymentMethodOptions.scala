package typings.stripe.mod.setupIntents

import typings.stripe.anon.Requestthreedsecure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentPaymentMethodOptions extends js.Object {
  /**
    * Configuration for any card payments attempted on this SetupIntent.
    */
  var card: js.UndefOr[Requestthreedsecure] = js.undefined
}

object ISetupIntentPaymentMethodOptions {
  @scala.inline
  def apply(card: Requestthreedsecure = null): ISetupIntentPaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentPaymentMethodOptions]
  }
}

