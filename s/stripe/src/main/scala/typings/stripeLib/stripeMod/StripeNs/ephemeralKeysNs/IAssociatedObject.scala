package typings
package stripeLib.stripeMod.StripeNs.ephemeralKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociatedObject extends js.Object {
  var id: java.lang.String
  var `type`: java.lang.String
}

object IAssociatedObject {
  @scala.inline
  def apply(id: java.lang.String, `type`: java.lang.String): IAssociatedObject = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[IAssociatedObject]
  }
}

