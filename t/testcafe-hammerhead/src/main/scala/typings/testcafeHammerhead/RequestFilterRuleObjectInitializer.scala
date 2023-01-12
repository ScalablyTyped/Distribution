package typings.testcafeHammerhead

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestFilterRuleObjectInitializer extends StObject {
  
  var isAjax: Boolean
  
  var method: String
  
  var url: String | js.RegExp
}
object RequestFilterRuleObjectInitializer {
  
  inline def apply(isAjax: Boolean, method: String, url: String | js.RegExp): RequestFilterRuleObjectInitializer = {
    val __obj = js.Dynamic.literal(isAjax = isAjax.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestFilterRuleObjectInitializer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestFilterRuleObjectInitializer] (val x: Self) extends AnyVal {
    
    inline def setIsAjax(value: Boolean): Self = StObject.set(x, "isAjax", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String | js.RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
