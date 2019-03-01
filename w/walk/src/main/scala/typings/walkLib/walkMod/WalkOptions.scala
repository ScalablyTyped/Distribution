package typings
package walkLib.walkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkOptions extends js.Object {
  var filters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var followLinks: js.UndefOr[scala.Boolean] = js.undefined
  var listeners: js.UndefOr[WalkOptionsListeners] = js.undefined
}

object WalkOptions {
  @scala.inline
  def apply(
    filters: js.Array[java.lang.String] = null,
    followLinks: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: WalkOptionsListeners = null
  ): WalkOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(followLinks)) __obj.updateDynamic("followLinks")(followLinks)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    __obj.asInstanceOf[WalkOptions]
  }
}

