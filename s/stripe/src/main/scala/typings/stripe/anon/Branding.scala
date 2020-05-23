package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branding extends js.Object {
  /**
    * Settings used to apply the account’s branding to email receipts, invoices,
    * Checkout, and other products.
    */
  var branding: js.UndefOr[Icon] = js.undefined
  /**
    * Settings specific to card charging on the account.
    */
  var card_payments: js.UndefOr[Declineon] = js.undefined
  /**
    * Settings used to configure the account within the Stripe dashboard.
    */
  var dashboard: js.UndefOr[Displayname] = js.undefined
  /**
    * Settings that apply across payment methods for charging on the account.
    */
  var payments: js.UndefOr[Statementdescriptor] = js.undefined
  /**
    * Settings specific to the account’s payouts.
    */
  var payouts: js.UndefOr[Debitnegativebalances] = js.undefined
}

object Branding {
  @scala.inline
  def apply(
    branding: Icon = null,
    card_payments: Declineon = null,
    dashboard: Displayname = null,
    payments: Statementdescriptor = null,
    payouts: Debitnegativebalances = null
  ): Branding = {
    val __obj = js.Dynamic.literal()
    if (branding != null) __obj.updateDynamic("branding")(branding.asInstanceOf[js.Any])
    if (card_payments != null) __obj.updateDynamic("card_payments")(card_payments.asInstanceOf[js.Any])
    if (dashboard != null) __obj.updateDynamic("dashboard")(dashboard.asInstanceOf[js.Any])
    if (payments != null) __obj.updateDynamic("payments")(payments.asInstanceOf[js.Any])
    if (payouts != null) __obj.updateDynamic("payouts")(payouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branding]
  }
}

