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

