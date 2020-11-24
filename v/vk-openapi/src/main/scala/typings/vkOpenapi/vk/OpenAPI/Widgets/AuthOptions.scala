package typings.vkOpenapi.vk.OpenAPI.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthOptions extends js.Object {
  
  var authUrl: js.UndefOr[String] = js.native
  
  var onAuth: js.UndefOr[js.Function1[/* user */ AuthUserData, Unit]] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object AuthOptions {
  
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthUrl(value: String): Self = this.set("authUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthUrl: Self = this.set("authUrl", js.undefined)
    
    @scala.inline
    def setOnAuth(value: /* user */ AuthUserData => Unit): Self = this.set("onAuth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAuth: Self = this.set("onAuth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
