package typings.vueDashRouter

import typings.vueDashRouter.typesRouterMod.Location
import typings.vueDashRouter.typesRouterMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: String
  var location: Location
  // backwards compat
  var normalizedTo: Location
  var resolved: Route
  var route: Route
}

object Anon_Href {
  @scala.inline
  def apply(href: String, location: Location, normalizedTo: Location, resolved: Route, route: Route): Anon_Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], normalizedTo = normalizedTo.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Href]
  }
}

