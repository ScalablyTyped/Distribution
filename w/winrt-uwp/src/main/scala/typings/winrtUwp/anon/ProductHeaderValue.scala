package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpProductHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductHeaderValue extends StObject {
  
  /** The HttpProductHeaderValue version of the string. */ var productHeaderValue: HttpProductHeaderValue
  
  /** true if input is valid HttpProductHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object ProductHeaderValue {
  
  inline def apply(productHeaderValue: HttpProductHeaderValue, returnValue: Boolean): ProductHeaderValue = {
    val __obj = js.Dynamic.literal(productHeaderValue = productHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductHeaderValue]
  }
  
  extension [Self <: ProductHeaderValue](x: Self) {
    
    inline def setProductHeaderValue(value: HttpProductHeaderValue): Self = StObject.set(x, "productHeaderValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
