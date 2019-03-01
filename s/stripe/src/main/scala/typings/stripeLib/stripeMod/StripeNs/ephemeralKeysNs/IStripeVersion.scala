package typings
package stripeLib.stripeMod.StripeNs.ephemeralKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStripeVersion extends js.Object {
  /**
    * https://stripe.com/docs/upgrades#api-changelog
    */
  var stripe_version: java.lang.String
}

object IStripeVersion {
  @scala.inline
  def apply(stripe_version: java.lang.String): IStripeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stripe_version")(stripe_version)
    __obj.asInstanceOf[IStripeVersion]
  }
}

