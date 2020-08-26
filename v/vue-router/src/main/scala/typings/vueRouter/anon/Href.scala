package typings.vueRouter.anon

import typings.vueRouter.routerMod.Location
import typings.vueRouter.routerMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Href extends js.Object {
  var href: String = js.native
  var location: Location = js.native
  // backwards compat
  var normalizedTo: Location = js.native
  var resolved: Route = js.native
  var route: Route = js.native
}

object Href {
  @scala.inline
  def apply(href: String, location: Location, normalizedTo: Location, resolved: Route, route: Route): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], normalizedTo = normalizedTo.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  @scala.inline
  implicit class HrefOps[Self <: Href] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalizedTo(value: Location): Self = this.set("normalizedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolved(value: Route): Self = this.set("resolved", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: Route): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

