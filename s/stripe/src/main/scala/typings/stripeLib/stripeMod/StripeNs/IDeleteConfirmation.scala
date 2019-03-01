package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeleteConfirmation extends js.Object {
  var deleted: scala.Boolean
  var id: java.lang.String
  var `object`: java.lang.String
}

object IDeleteConfirmation {
  @scala.inline
  def apply(deleted: scala.Boolean, id: java.lang.String, `object`: java.lang.String): IDeleteConfirmation = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("deleted")(deleted)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[IDeleteConfirmation]
  }
}

