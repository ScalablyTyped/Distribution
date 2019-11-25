package typings.walk.walkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkOptions extends js.Object {
  var filters: js.UndefOr[js.Array[String]] = js.undefined
  var followLinks: js.UndefOr[Boolean] = js.undefined
  var listeners: js.UndefOr[WalkOptionsListeners] = js.undefined
}

object WalkOptions {
  @scala.inline
  def apply(
    filters: js.Array[String] = null,
    followLinks: js.UndefOr[Boolean] = js.undefined,
    listeners: WalkOptionsListeners = null
  ): WalkOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(followLinks)) __obj.updateDynamic("followLinks")(followLinks.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkOptions]
  }
}

