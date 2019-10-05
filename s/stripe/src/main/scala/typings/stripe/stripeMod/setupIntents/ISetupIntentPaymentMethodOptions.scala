package typings.stripe.stripeMod.setupIntents

import typings.stripe.Anon_AnyAutomatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentPaymentMethodOptions extends js.Object {
  /**
    * Configuration for any card payments attempted on this SetupIntent.
    */
  var card: js.UndefOr[Anon_AnyAutomatic] = js.undefined
}

object ISetupIntentPaymentMethodOptions {
  @scala.inline
  def apply(card: Anon_AnyAutomatic = null): ISetupIntentPaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[ISetupIntentPaymentMethodOptions]
  }
}

