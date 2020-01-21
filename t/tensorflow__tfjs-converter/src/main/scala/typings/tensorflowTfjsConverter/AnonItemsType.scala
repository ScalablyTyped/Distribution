package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsType extends js.Object {
  var items: js.UndefOr[scala.Nothing] = js.undefined
  var `type`: String
}

object AnonItemsType {
  @scala.inline
  def apply(`type`: String, items: js.UndefOr[scala.Nothing] = js.undefined): AnonItemsType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsType]
  }
}

