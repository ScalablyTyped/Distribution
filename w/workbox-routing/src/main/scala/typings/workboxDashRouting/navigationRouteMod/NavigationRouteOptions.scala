package typings.workboxDashRouting.navigationRouteMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationRouteOptions extends js.Object {
  var blacklist: js.UndefOr[js.Array[RegExp]] = js.undefined
  var whitelist: js.UndefOr[js.Array[RegExp]] = js.undefined
}

object NavigationRouteOptions {
  @scala.inline
  def apply(blacklist: js.Array[RegExp] = null, whitelist: js.Array[RegExp] = null): NavigationRouteOptions = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[NavigationRouteOptions]
  }
}

