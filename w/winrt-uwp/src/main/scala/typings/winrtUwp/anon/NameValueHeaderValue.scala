package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameValueHeaderValue extends StObject {
  
  /** The HttpNameValueHeaderValue version of the string. */ var nameValueHeaderValue: HttpNameValueHeaderValue
  
  /** true if input is valid HttpNameValueHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object NameValueHeaderValue {
  
  @scala.inline
  def apply(nameValueHeaderValue: HttpNameValueHeaderValue, returnValue: Boolean): NameValueHeaderValue = {
    val __obj = js.Dynamic.literal(nameValueHeaderValue = nameValueHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameValueHeaderValue]
  }
  
  @scala.inline
  implicit class NameValueHeaderValueMutableBuilder[Self <: NameValueHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameValueHeaderValue(value: HttpNameValueHeaderValue): Self = StObject.set(x, "nameValueHeaderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
