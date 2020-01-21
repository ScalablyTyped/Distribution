package typings.stripeV3.stripe

import typings.stripeV3.AnonAddress
import typings.stripeV3.AnonAuthenticated
import typings.stripeV3.AnonBankcode
import typings.stripeV3.AnonStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var card: js.UndefOr[Card] = js.undefined
  var client_secret: String
  var created: Double
  var currency: String
  var id: String
  var owner: AnonAddress
  var redirect: js.UndefOr[AnonStatus] = js.undefined
  var sepa_debit: js.UndefOr[AnonBankcode] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var three_d_secure: js.UndefOr[AnonAuthenticated] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    client_secret: String,
    created: Double,
    currency: String,
    id: String,
    owner: AnonAddress,
    card: Card = null,
    redirect: AnonStatus = null,
    sepa_debit: AnonBankcode = null,
    status: String = null,
    three_d_secure: AnonAuthenticated = null
  ): Source = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (sepa_debit != null) __obj.updateDynamic("sepa_debit")(sepa_debit.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (three_d_secure != null) __obj.updateDynamic("three_d_secure")(three_d_secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

