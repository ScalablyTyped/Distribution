package typings
package stripeLib.stripeMod.StripeNs.webhooksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeWebhookEvent[T] extends js.Object {
  var api_version: java.lang.String
  var created: scala.Double
  var data: stripeLib.Anon_Object[T]
  var id: java.lang.String
  var livemode: scala.Boolean
  var `object`: java.lang.String
  var pending_webhooks: scala.Double
  /**
    * One of https://stripe.com/docs/api#event_types
    * E.g. account.updated
    */
  var `type`: java.lang.String
}

