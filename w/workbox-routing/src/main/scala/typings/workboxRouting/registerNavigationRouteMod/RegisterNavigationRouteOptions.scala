package typings.workboxRouting.registerNavigationRouteMod

import typings.workboxRouting.navigationRouteMod.NavigationRouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterNavigationRouteOptions extends NavigationRouteOptions {
  var cacheName: js.UndefOr[String] = js.native
}

object RegisterNavigationRouteOptions {
  @scala.inline
  def apply(): RegisterNavigationRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterNavigationRouteOptions]
  }
  @scala.inline
  implicit class RegisterNavigationRouteOptionsOps[Self <: RegisterNavigationRouteOptions] (val x: Self) extends AnyVal {
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
    def setCacheName(value: String): Self = this.set("cacheName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheName: Self = this.set("cacheName", js.undefined)
  }
  
}

