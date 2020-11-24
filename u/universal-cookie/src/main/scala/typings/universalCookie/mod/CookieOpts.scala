package typings.universalCookie.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieOpts extends js.Object {
  
  /**
    * domain for the cookie (sub.domain.com or .allsubdomains.com)
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * absolute expiration date for the cookie
    */
  var expires: js.UndefOr[Date] = js.native
  
  /**
    * Is only the server can access the cookie?
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * relative max age of the cookie from when the client receives it in second
    */
  var maxAge: js.UndefOr[Double] = js.native
  
  /**
    * cookie path, use / as the path if you want your cookie to be accessible on all pages
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Is only accessible through HTTPS?
    */
  var secure: js.UndefOr[Boolean] = js.native
}
object CookieOpts {
  
  @scala.inline
  def apply(): CookieOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieOpts]
  }
  
  @scala.inline
  implicit class CookieOptsOps[Self <: CookieOpts] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setExpires(value: Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
}
