package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastResponse extends StObject {
  
  var lastResponse: ApiVersion
}
object LastResponse {
  
  inline def apply(lastResponse: ApiVersion): LastResponse = {
    val __obj = js.Dynamic.literal(lastResponse = lastResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastResponse] (val x: Self) extends AnyVal {
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
  }
}
