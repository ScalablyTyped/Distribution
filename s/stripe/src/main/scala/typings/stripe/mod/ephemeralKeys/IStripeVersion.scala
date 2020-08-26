package typings.stripe.mod.ephemeralKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStripeVersion extends js.Object {
  /**
    * https://stripe.com/docs/upgrades#api-changelog
    */
  var stripe_version: String = js.native
}

object IStripeVersion {
  @scala.inline
  def apply(stripe_version: String): IStripeVersion = {
    val __obj = js.Dynamic.literal(stripe_version = stripe_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStripeVersion]
  }
  @scala.inline
  implicit class IStripeVersionOps[Self <: IStripeVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStripe_version(value: String): Self = this.set("stripe_version", value.asInstanceOf[js.Any])
  }
  
}

