package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebHooks extends js.Object {
  def constructEvent(requestBody: js.Any, signature: java.lang.String, endpointSecret: java.lang.String): stripeLib.stripeMod.StripeNs.webhooksNs.StripeWebhookEvent[_] = js.native
  def constructEvent(
    requestBody: js.Any,
    signature: java.lang.String,
    endpointSecret: java.lang.String,
    tolerance: scala.Double
  ): stripeLib.stripeMod.StripeNs.webhooksNs.StripeWebhookEvent[_] = js.native
  def constructEvent(requestBody: js.Any, signature: js.Array[java.lang.String], endpointSecret: java.lang.String): stripeLib.stripeMod.StripeNs.webhooksNs.StripeWebhookEvent[_] = js.native
  def constructEvent(
    requestBody: js.Any,
    signature: js.Array[java.lang.String],
    endpointSecret: java.lang.String,
    tolerance: scala.Double
  ): stripeLib.stripeMod.StripeNs.webhooksNs.StripeWebhookEvent[_] = js.native
}

