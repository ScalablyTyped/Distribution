package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptionHeaderValue extends StObject {
  
  /** The HttpConnectionOptionHeaderValue version of the string. */ var connectionOptionHeaderValue: HttpConnectionOptionHeaderValue = js.native
  
  /** true if input is valid HttpConnectionOptionHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}
object ConnectionOptionHeaderValue {
  
  @scala.inline
  def apply(connectionOptionHeaderValue: HttpConnectionOptionHeaderValue, returnValue: Boolean): ConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(connectionOptionHeaderValue = connectionOptionHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptionHeaderValue]
  }
  
  @scala.inline
  implicit class ConnectionOptionHeaderValueMutableBuilder[Self <: ConnectionOptionHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionOptionHeaderValue(value: HttpConnectionOptionHeaderValue): Self = StObject.set(x, "connectionOptionHeaderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
