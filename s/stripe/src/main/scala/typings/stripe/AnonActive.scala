package typings.stripe

import typings.stripe.stripeStrings.active
import typings.stripe.stripeStrings.inactive
import typings.stripe.stripeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  /**
    * The status of the card payments capability of the account, or whether
    * the account can directly process credit and debit card charges.
    */
  var card_payments: js.UndefOr[active | inactive | pending] = js.undefined
  /**
    * The status of the legacy payments capability of the account.
    */
  var legacy_payments: js.UndefOr[active | inactive | pending] = js.undefined
  /**
    * The status of the transfers capability of the account, or whether your
    * platform can transfer funds to the account.
    */
  var transfers: js.UndefOr[active | inactive | pending] = js.undefined
}

object AnonActive {
  @scala.inline
  def apply(
    card_payments: active | inactive | pending = null,
    legacy_payments: active | inactive | pending = null,
    transfers: active | inactive | pending = null
  ): AnonActive = {
    val __obj = js.Dynamic.literal()
    if (card_payments != null) __obj.updateDynamic("card_payments")(card_payments.asInstanceOf[js.Any])
    if (legacy_payments != null) __obj.updateDynamic("legacy_payments")(legacy_payments.asInstanceOf[js.Any])
    if (transfers != null) __obj.updateDynamic("transfers")(transfers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

