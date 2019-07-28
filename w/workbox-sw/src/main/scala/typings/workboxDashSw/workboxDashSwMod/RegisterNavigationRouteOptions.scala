package typings.workboxDashSw.workboxDashSwMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== RoutingNamespace =====
  */
trait RegisterNavigationRouteOptions extends NavigationRouteOptions {
  /**
  	 *  Cache name to store and retrieve requests. Defaults to precache cache name provided by `cacheNames`.
  	 */
  var cacheName: String
}

object RegisterNavigationRouteOptions {
  @scala.inline
  def apply(blacklist: js.Array[RegExp], cacheName: String, whitelist: js.Array[RegExp]): RegisterNavigationRouteOptions = {
    val __obj = js.Dynamic.literal(blacklist = blacklist, cacheName = cacheName, whitelist = whitelist)
  
    __obj.asInstanceOf[RegisterNavigationRouteOptions]
  }
}

