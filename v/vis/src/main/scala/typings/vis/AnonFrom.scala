package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom extends js.Object {
  var from: js.UndefOr[Boolean | AnonEnabled] = js.undefined
  var middle: js.UndefOr[Boolean | AnonEnabled] = js.undefined
  var to: js.UndefOr[Boolean | AnonEnabled] = js.undefined
}

object AnonFrom {
  @scala.inline
  def apply(
    from: Boolean | AnonEnabled = null,
    middle: Boolean | AnonEnabled = null,
    to: Boolean | AnonEnabled = null
  ): AnonFrom = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (middle != null) __obj.updateDynamic("middle")(middle.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrom]
  }
}

