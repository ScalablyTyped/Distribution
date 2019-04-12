package typings
package workboxDashSwLib.workboxDashSwMod

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
  var cacheName: java.lang.String
}

object RegisterNavigationRouteOptions {
  @scala.inline
  def apply(
    blacklist: js.Array[stdLib.RegExp],
    cacheName: java.lang.String,
    whitelist: js.Array[stdLib.RegExp]
  ): RegisterNavigationRouteOptions = {
    val __obj = js.Dynamic.literal(blacklist = blacklist, cacheName = cacheName, whitelist = whitelist)
  
    __obj.asInstanceOf[RegisterNavigationRouteOptions]
  }
}

