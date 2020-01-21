package typings.stripe.mod.ephemeralKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociatedObject extends js.Object {
  var id: String
  var `type`: String
}

object IAssociatedObject {
  @scala.inline
  def apply(id: String, `type`: String): IAssociatedObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssociatedObject]
  }
}

