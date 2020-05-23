package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupFieldRef extends _Field {
  var group: Field
  var level: js.UndefOr[Double] = js.undefined
}

object GroupFieldRef {
  @scala.inline
  def apply(group: Field, level: js.UndefOr[Double] = js.undefined): GroupFieldRef = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupFieldRef]
  }
}

