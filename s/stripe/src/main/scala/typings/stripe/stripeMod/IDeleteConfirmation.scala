package typings.stripe.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeleteConfirmation extends js.Object {
  var deleted: Boolean
  var id: String
  var `object`: String
}

object IDeleteConfirmation {
  @scala.inline
  def apply(deleted: Boolean, id: String, `object`: String): IDeleteConfirmation = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteConfirmation]
  }
}

