package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsTypeAnonType extends js.Object {
  var items: AnonType
  var `type`: String
}

object AnonItemsTypeAnonType {
  @scala.inline
  def apply(items: AnonType, `type`: String): AnonItemsTypeAnonType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsTypeAnonType]
  }
}

