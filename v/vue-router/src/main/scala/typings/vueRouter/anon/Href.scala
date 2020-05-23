package typings.vueRouter.anon

import typings.vueRouter.routerMod.Location
import typings.vueRouter.routerMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Href extends js.Object {
  var href: String
  var location: Location
  // backwards compat
  var normalizedTo: Location
  var resolved: Route
  var route: Route
}

object Href {
  @scala.inline
  def apply(href: String, location: Location, normalizedTo: Location, resolved: Route, route: Route): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], normalizedTo = normalizedTo.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
}

