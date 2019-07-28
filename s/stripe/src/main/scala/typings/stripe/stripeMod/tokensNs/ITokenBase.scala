package typings.stripe.stripeMod.tokensNs

import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenBase extends IResourceObject {
  /**
    * IP address of the client that generated the token
    */
  var client_ip: String
  var created: Double
  var livemode: Boolean
  /**
    * Value is "token""
    */
  @JSName("object")
  var object_ITokenBase: token
  /**
    * Type of the token: card or bank_account
    */
  var `type`: card | bank_account
  /**
    * Whether or not this token has already been used (tokens can be used only once)
    */
  var used: Boolean
}

object ITokenBase {
  @scala.inline
  def apply(
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: token,
    `type`: card | bank_account,
    used: Boolean
  ): ITokenBase = {
    val __obj = js.Dynamic.literal(client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITokenBase]
  }
}

