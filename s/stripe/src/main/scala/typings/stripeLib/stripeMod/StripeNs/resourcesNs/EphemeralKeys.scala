package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EphemeralKeys extends js.Object {
  def create(
    customer: stripeLib.stripeMod.StripeNs.ephemeralKeysNs.ICustomer,
    stripe_version: stripeLib.stripeMod.StripeNs.ephemeralKeysNs.IStripeVersion
  ): js.Promise[stripeLib.stripeMod.StripeNs.ephemeralKeysNs.IEphemeralKey] = js.native
  def create(
    customer: stripeLib.stripeMod.StripeNs.ephemeralKeysNs.ICustomer,
    stripe_version: stripeLib.stripeMod.StripeNs.ephemeralKeysNs.IStripeVersion,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.ephemeralKeysNs.IEphemeralKey]
  ): js.Promise[stripeLib.stripeMod.StripeNs.ephemeralKeysNs.IEphemeralKey] = js.native
}

