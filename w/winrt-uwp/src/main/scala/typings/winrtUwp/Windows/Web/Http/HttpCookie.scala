package typings.winrtUwp.Windows.Web.Http

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a set of properties and methods to manage an HTTP cookie. */
@js.native
trait HttpCookie extends js.Object {
  
  /** Get the domain for which the HttpCookie is valid. */
  var domain: String = js.native
  
  /** Get or set the expiration date and time for the HttpCookie . */
  var expires: Date = js.native
  
  /** Get or set a value that controls whether a script or other active content can access this HttpCookie . */
  var httpOnly: Boolean = js.native
  
  /** Get the token that represents the HttpCookie name. */
  var name: String = js.native
  
  /** Get the URI path component to which the HttpCookie applies. */
  var path: String = js.native
  
  /** Get or set the security level for the HttpCookie . */
  var secure: Boolean = js.native
  
  /** Get or set the value for the HttpCookie . */
  var value: String = js.native
}
object HttpCookie {
  
  @scala.inline
  def apply(
    domain: String,
    expires: Date,
    httpOnly: Boolean,
    name: String,
    path: String,
    secure: Boolean,
    value: String
  ): HttpCookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCookie]
  }
  
  @scala.inline
  implicit class HttpCookieOps[Self <: HttpCookie] (val x: Self) extends AnyVal {
    
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
    def setExpires(value: Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
