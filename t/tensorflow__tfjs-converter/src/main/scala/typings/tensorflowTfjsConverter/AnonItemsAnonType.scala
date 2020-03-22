package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsAnonType extends js.Object {
  var items: AnonType
  var `type`: String
}

object AnonItemsAnonType {
  @scala.inline
  def apply(items: AnonType, `type`: String): AnonItemsAnonType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsAnonType]
  }
}

