package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var bits: js.UndefOr[scala.Double] = js.undefined
  var emptyRepo: js.UndefOr[scala.Boolean] = js.undefined
  var log: js.UndefOr[js.Function] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    bits: scala.Int | scala.Double = null,
    emptyRepo: js.UndefOr[scala.Boolean] = js.undefined,
    log: js.Function = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (bits != null) __obj.updateDynamic("bits")(bits.asInstanceOf[js.Any])
    if (!js.isUndefined(emptyRepo)) __obj.updateDynamic("emptyRepo")(emptyRepo)
    if (log != null) __obj.updateDynamic("log")(log)
    __obj.asInstanceOf[InitOptions]
  }
}

