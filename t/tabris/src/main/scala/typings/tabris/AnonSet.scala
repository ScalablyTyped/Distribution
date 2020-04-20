package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSet extends js.Object {
  var set: js.UndefOr[js.Any] = js.undefined
}

object AnonSet {
  @scala.inline
  def apply(set: js.Any = null): AnonSet = {
    val __obj = js.Dynamic.literal()
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSet]
  }
}

