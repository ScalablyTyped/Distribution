package typings.webostvjs.mod

import typings.webostvjs.webostvjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCompleteSuccessResponse extends StObject {
  
  var returnValue: `true`
}
object OnCompleteSuccessResponse {
  
  inline def apply(): OnCompleteSuccessResponse = {
    val __obj = js.Dynamic.literal(returnValue = true)
    __obj.asInstanceOf[OnCompleteSuccessResponse]
  }
  
  extension [Self <: OnCompleteSuccessResponse](x: Self) {
    
    inline def setReturnValue(value: `true`): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
