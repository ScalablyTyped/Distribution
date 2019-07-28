package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Branding extends js.Object {
  /**
    * Settings used to apply the account’s branding to email receipts, invoices,
    * Checkout, and other products.
    */
  var branding: js.UndefOr[Anon_Icon] = js.undefined
  /**
    * Settings specific to card charging on the account.
    */
  var card_payments: js.UndefOr[Anon_Declineon] = js.undefined
  /**
    * Settings used to configure the account within the Stripe dashboard.
    */
  var dashboard: js.UndefOr[Anon_Displayname] = js.undefined
  /**
    * Settings that apply across payment methods for charging on the account.
    */
  var payments: js.UndefOr[Anon_Statementdescriptor] = js.undefined
  /**
    * Settings specific to the account’s payouts.
    */
  var payouts: js.UndefOr[Anon_Debitnegativebalances] = js.undefined
}

object Anon_Branding {
  @scala.inline
  def apply(
    branding: Anon_Icon = null,
    card_payments: Anon_Declineon = null,
    dashboard: Anon_Displayname = null,
    payments: Anon_Statementdescriptor = null,
    payouts: Anon_Debitnegativebalances = null
  ): Anon_Branding = {
    val __obj = js.Dynamic.literal()
    if (branding != null) __obj.updateDynamic("branding")(branding)
    if (card_payments != null) __obj.updateDynamic("card_payments")(card_payments)
    if (dashboard != null) __obj.updateDynamic("dashboard")(dashboard)
    if (payments != null) __obj.updateDynamic("payments")(payments)
    if (payouts != null) __obj.updateDynamic("payouts")(payouts)
    __obj.asInstanceOf[Anon_Branding]
  }
}

