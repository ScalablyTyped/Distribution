package typings.stripeV3.anon

import typings.stripeV3.stripe.OwnerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Owner extends js.Object {
  var owner: js.UndefOr[OwnerInfo] = js.undefined
}

object Owner {
  @scala.inline
  def apply(owner: OwnerInfo = null): Owner = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Owner]
  }
}

