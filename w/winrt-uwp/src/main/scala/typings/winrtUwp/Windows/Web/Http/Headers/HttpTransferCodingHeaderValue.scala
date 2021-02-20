package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents transfer coding information used in the Transfer-Encoding HTTP header on an HTTP request. */
@js.native
trait HttpTransferCodingHeaderValue extends StObject {
  
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
  implicit class HttpTransferCodingHeaderValueMutableBuilder[Self <: HttpTransferCodingHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IVector[HttpNameValueHeaderValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
