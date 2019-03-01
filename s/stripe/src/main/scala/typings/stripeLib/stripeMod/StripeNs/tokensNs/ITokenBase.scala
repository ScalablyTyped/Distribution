package typings
package stripeLib.stripeMod.StripeNs.tokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenBase
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * IP address of the client that generated the token
    */
  var client_ip: java.lang.String
  var created: scala.Double
  var livemode: scala.Boolean
  /**
    * Value is "token""
    */
  @JSName("object")
  var object_ITokenBase: stripeLib.stripeLibStrings.token
  /**
    * Type of the token: card or bank_account
    */
  var `type`: stripeLib.stripeLibStrings.card | stripeLib.stripeLibStrings.bank_account
  /**
    * Whether or not this token has already been used (tokens can be used only once)
    */
  var used: scala.Boolean
}

object ITokenBase {
  @scala.inline
  def apply(
    client_ip: java.lang.String,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: stripeLib.stripeLibStrings.token,
    `type`: stripeLib.stripeLibStrings.card | stripeLib.stripeLibStrings.bank_account,
    used: scala.Boolean
  ): ITokenBase = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("client_ip")(client_ip)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("livemode")(livemode)
    __obj.updateDynamic("used")(used)
    __obj.asInstanceOf[ITokenBase]
  }
}

