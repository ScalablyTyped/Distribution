package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentFieldRef extends _Field {
  var level: js.UndefOr[Double] = js.undefined
  var parent: Field
}

object ParentFieldRef {
  @scala.inline
  def apply(parent: Field, level: js.UndefOr[Double] = js.undefined): ParentFieldRef = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentFieldRef]
  }
}

