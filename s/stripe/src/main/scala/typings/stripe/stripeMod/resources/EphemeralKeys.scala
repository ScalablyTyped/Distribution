package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.ephemeralKeys.ICustomer
import typings.stripe.stripeMod.ephemeralKeys.IEphemeralKey
import typings.stripe.stripeMod.ephemeralKeys.IStripeVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.EphemeralKeys")
@js.native
class EphemeralKeys () extends js.Object {
  def create(customer: ICustomer, stripe_version: IStripeVersion): js.Promise[IEphemeralKey] = js.native
  def create(customer: ICustomer, stripe_version: IStripeVersion, response: IResponseFn[IEphemeralKey]): js.Promise[IEphemeralKey] = js.native
}

