package typings
package xstateLib.esStateTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateTreeOptions extends js.Object {
  var resolved: js.UndefOr[scala.Boolean] = js.undefined
}

object StateTreeOptions {
  @scala.inline
  def apply(resolved: js.UndefOr[scala.Boolean] = js.undefined): StateTreeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resolved)) __obj.updateDynamic("resolved")(resolved)
    __obj.asInstanceOf[StateTreeOptions]
  }
}

