package typings.workboxDashRouting.registerNavigationRouteMod

import typings.std.RegExp
import typings.workboxDashRouting.navigationRouteMod.NavigationRouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterNavigationRouteOptions extends NavigationRouteOptions {
  var cacheName: js.UndefOr[String] = js.undefined
}

object RegisterNavigationRouteOptions {
  @scala.inline
  def apply(blacklist: js.Array[RegExp] = null, cacheName: String = null, whitelist: js.Array[RegExp] = null): RegisterNavigationRouteOptions = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterNavigationRouteOptions]
  }
}

