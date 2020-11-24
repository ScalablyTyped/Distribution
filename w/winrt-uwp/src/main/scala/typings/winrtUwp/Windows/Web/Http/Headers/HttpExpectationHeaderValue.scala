package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a token for a particular server behavior required by the client that is used in the Expect HTTP header on an HTTP request. */
@js.native
trait HttpExpectationHeaderValue extends js.Object {
  
  /** Gets or sets a token that represents a name for a server behavior used in the Expect HTTP header. */
  var name: String = js.native
  
  /** Gets a set of parameters for a server behavior included in the Expect HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  
  /** Gets or sets a value for a server behavior used in the Expect HTTP header. */
  var value: String = js.native
}
object HttpExpectationHeaderValue {
  
  @scala.inline
  def apply(name: String, parameters: IVector[HttpNameValueHeaderValue], value: String): HttpExpectationHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpExpectationHeaderValue]
  }
  
  @scala.inline
  implicit class HttpExpectationHeaderValueOps[Self <: HttpExpectationHeaderValue] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IVector[HttpNameValueHeaderValue]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
