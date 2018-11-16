package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebHooks extends js.Object {
  def constructEvent[T](requestBody: js.Any, signature: java.lang.String, endpointSecret: java.lang.String): stripeLib.stripeMod.StripeNs.webhooksNs.StripeWebhookEvent[T] = js.native
  def constructEvent[T](
    requestBody: js.Any,
    signature: java.lang.String,
    endpointSecret: java.lang.String,
    tolerance: scala.Double
  ): stripeLib.stripeMod.StripeNs.webhooksNs.StripeWebhookEvent[T] = js.native
  def constructEvent[T](requestBody: js.Any, signature: js.Array[java.lang.String], endpointSecret: java.lang.String): stripeLib.stripeMod.StripeNs.webhooksNs.StripeWebhookEvent[T] = js.native
  def constructEvent[T](
    requestBody: js.Any,
    signature: js.Array[java.lang.String],
    endpointSecret: java.lang.String,
    tolerance: scala.Double
  ): stripeLib.stripeMod.StripeNs.webhooksNs.StripeWebhookEvent[T] = js.native
}

