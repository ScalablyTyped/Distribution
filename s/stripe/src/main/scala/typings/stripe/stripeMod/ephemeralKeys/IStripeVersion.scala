package typings.stripe.stripeMod.ephemeralKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStripeVersion extends js.Object {
  /**
    * https://stripe.com/docs/upgrades#api-changelog
    */
  var stripe_version: String
}

object IStripeVersion {
  @scala.inline
  def apply(stripe_version: String): IStripeVersion = {
    val __obj = js.Dynamic.literal(stripe_version = stripe_version)
  
    __obj.asInstanceOf[IStripeVersion]
  }
}

