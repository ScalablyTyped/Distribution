package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipJsErrorsOptionsObject extends StObject {
  
  var message: js.UndefOr[String | js.RegExp] = js.undefined
  
  var pageUrl: js.UndefOr[String | js.RegExp] = js.undefined
  
  var stack: js.UndefOr[String | js.RegExp] = js.undefined
}
object SkipJsErrorsOptionsObject {
  
  inline def apply(): SkipJsErrorsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipJsErrorsOptionsObject]
  }
  
  extension [Self <: SkipJsErrorsOptionsObject](x: Self) {
    
    inline def setMessage(value: String | js.RegExp): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPageUrl(value: String | js.RegExp): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    
    inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    inline def setStack(value: String | js.RegExp): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
