package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavigationRouteOptions extends js.Object {
  /**
  	 * If any of these patterns match, the route will not handle the request (even if a whitelist RegExp matches).
  	 */
  var blacklist: js.Array[stdLib.RegExp]
  /**
  	 * If any of these patterns match the URL's pathname and search parameter,
  	 * the route will handle the request (assuming the blacklist doesn't match).
  	 */
  var whitelist: js.Array[stdLib.RegExp]
}

object INavigationRouteOptions {
  @scala.inline
  def apply(blacklist: js.Array[stdLib.RegExp], whitelist: js.Array[stdLib.RegExp]): INavigationRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blacklist")(blacklist)
    __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[INavigationRouteOptions]
  }
}

