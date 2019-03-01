package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceObject extends IObject {
  var id: java.lang.String
}

object IResourceObject {
  @scala.inline
  def apply(id: java.lang.String, `object`: java.lang.String): IResourceObject = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[IResourceObject]
  }
}

