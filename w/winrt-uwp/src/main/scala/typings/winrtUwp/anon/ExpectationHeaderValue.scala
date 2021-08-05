package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpExpectationHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpectationHeaderValue extends StObject {
  
  /** The HttpExpectationHeaderValue version of the string. */ var expectationHeaderValue: HttpExpectationHeaderValue
  
  /** true if input is valid HttpExpectationHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object ExpectationHeaderValue {
  
  inline def apply(expectationHeaderValue: HttpExpectationHeaderValue, returnValue: Boolean): ExpectationHeaderValue = {
    val __obj = js.Dynamic.literal(expectationHeaderValue = expectationHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectationHeaderValue]
  }
  
  extension [Self <: ExpectationHeaderValue](x: Self) {
    
    inline def setExpectationHeaderValue(value: HttpExpectationHeaderValue): Self = StObject.set(x, "expectationHeaderValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
