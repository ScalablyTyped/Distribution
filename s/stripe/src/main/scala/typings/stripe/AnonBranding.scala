package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBranding extends js.Object {
  /**
    * Settings used to apply the account’s branding to email receipts, invoices,
    * Checkout, and other products.
    */
  var branding: js.UndefOr[AnonIcon] = js.undefined
  /**
    * Settings specific to card charging on the account.
    */
  var card_payments: js.UndefOr[AnonDeclineon] = js.undefined
  /**
    * Settings used to configure the account within the Stripe dashboard.
    */
  var dashboard: js.UndefOr[AnonDisplayname] = js.undefined
  /**
    * Settings that apply across payment methods for charging on the account.
    */
  var payments: js.UndefOr[AnonStatementdescriptor] = js.undefined
  /**
    * Settings specific to the account’s payouts.
    */
  var payouts: js.UndefOr[AnonDebitnegativebalances] = js.undefined
}

object AnonBranding {
  @scala.inline
  def apply(
    branding: AnonIcon = null,
    card_payments: AnonDeclineon = null,
    dashboard: AnonDisplayname = null,
    payments: AnonStatementdescriptor = null,
    payouts: AnonDebitnegativebalances = null
  ): AnonBranding = {
    val __obj = js.Dynamic.literal()
    if (branding != null) __obj.updateDynamic("branding")(branding.asInstanceOf[js.Any])
    if (card_payments != null) __obj.updateDynamic("card_payments")(card_payments.asInstanceOf[js.Any])
    if (dashboard != null) __obj.updateDynamic("dashboard")(dashboard.asInstanceOf[js.Any])
    if (payments != null) __obj.updateDynamic("payments")(payments.asInstanceOf[js.Any])
    if (payouts != null) __obj.updateDynamic("payouts")(payouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBranding]
  }
}

