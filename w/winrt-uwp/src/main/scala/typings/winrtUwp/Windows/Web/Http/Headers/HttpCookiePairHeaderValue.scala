package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents cookie information used in the Cookie HTTP header on an HTTP request. */
@js.native
trait HttpCookiePairHeaderValue extends js.Object {
  
  /** Gets a token that represents the cookie name used in the Cookie HTTP header. */
  var name: String = js.native
  
  /** Gets or sets a value for the cookie used in the Cookie HTTP header. */
  var value: String = js.native
}
object HttpCookiePairHeaderValue {
  
  @scala.inline
  def apply(name: String, value: String): HttpCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCookiePairHeaderValue]
  }
  
  @scala.inline
  implicit class HttpCookiePairHeaderValueOps[Self <: HttpCookiePairHeaderValue] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
