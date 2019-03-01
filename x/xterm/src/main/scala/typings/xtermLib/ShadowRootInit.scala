package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowRootInit extends js.Object {
  var delegatesFocus: js.UndefOr[scala.Boolean] = js.undefined
  var mode: xtermLib.xtermLibStrings.open | xtermLib.xtermLibStrings.closed
}

object ShadowRootInit {
  @scala.inline
  def apply(
    mode: xtermLib.xtermLibStrings.open | xtermLib.xtermLibStrings.closed,
    delegatesFocus: js.UndefOr[scala.Boolean] = js.undefined
  ): ShadowRootInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(delegatesFocus)) __obj.updateDynamic("delegatesFocus")(delegatesFocus)
    __obj.asInstanceOf[ShadowRootInit]
  }
}

