package typings.workboxDashRouting.navigationRouteMod

import typings.workboxDashRouting.routeMod.Route
import typings.workboxDashRouting.typesRouteHandlerMod.RouteHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/NavigationRoute", "NavigationRoute")
@js.native
class NavigationRoute protected () extends Route[Boolean] {
  def this(handler: RouteHandler) = this()
  def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
}

