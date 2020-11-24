package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents transfer coding information used in the Transfer-Encoding HTTP header on an HTTP request. */
@js.native
trait HttpTransferCodingHeaderValue extends js.Object {
  
  /** Gets a set of parameters used in the Transfer-Encoding HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  
  /** Gets the transfer-coding value used in the Transfer-Encoding HTTP header. */
  var value: String = js.native
}
object HttpTransferCodingHeaderValue {
  
  @scala.inline
  def apply(parameters: IVector[HttpNameValueHeaderValue], value: String): HttpTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpTransferCodingHeaderValue]
  }
  
  @scala.inline
  implicit class HttpTransferCodingHeaderValueOps[Self <: HttpTransferCodingHeaderValue] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IVector[HttpNameValueHeaderValue]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
