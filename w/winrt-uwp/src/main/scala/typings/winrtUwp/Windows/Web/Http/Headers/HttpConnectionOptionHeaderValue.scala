package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents connection information used in the Connection HTTP header on an HTTP request. */
@js.native
trait HttpConnectionOptionHeaderValue extends js.Object {
  
  /** Gets the value of the connection-token in the Connection HTTP header. */
  var token: String = js.native
}
object HttpConnectionOptionHeaderValue {
  
  @scala.inline
  def apply(token: String): HttpConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpConnectionOptionHeaderValue]
  }
  
  @scala.inline
  implicit class HttpConnectionOptionHeaderValueOps[Self <: HttpConnectionOptionHeaderValue] (val x: Self) extends AnyVal {
    
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
