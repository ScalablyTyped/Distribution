package typings.stripe.stripeMod.ephemeralKeysNs

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
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IAssociatedObject]
  }
}

