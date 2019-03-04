package typings
package vueDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: java.lang.String
  var location: vueDashRouterLib.typesRouterMod.Location
  // backwards compat
  var normalizedTo: vueDashRouterLib.typesRouterMod.Location
  var resolved: vueDashRouterLib.typesRouterMod.Route
  var route: vueDashRouterLib.typesRouterMod.Route
}

object Anon_Href {
  @scala.inline
  def apply(
    href: java.lang.String,
    location: vueDashRouterLib.typesRouterMod.Location,
    normalizedTo: vueDashRouterLib.typesRouterMod.Location,
    resolved: vueDashRouterLib.typesRouterMod.Route,
    route: vueDashRouterLib.typesRouterMod.Route
  ): Anon_Href = {
    val __obj = js.Dynamic.literal(href = href, location = location, normalizedTo = normalizedTo, resolved = resolved, route = route)
  
    __obj.asInstanceOf[Anon_Href]
  }
}

