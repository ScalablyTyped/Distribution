package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObject extends js.Object {
  var `object`: java.lang.String
}

object IObject {
  @scala.inline
  def apply(`object`: java.lang.String): IObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IObject]
  }
}

