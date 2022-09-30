package typings.wdioTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMultiremote extends StObject {
  
  var isMultiremote: js.UndefOr[Boolean] = js.undefined
  
  var sessionId: js.UndefOr[String] = js.undefined
}
object IsMultiremote {
  
  inline def apply(): IsMultiremote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsMultiremote]
  }
  
  extension [Self <: IsMultiremote](x: Self) {
    
    inline def setIsMultiremote(value: Boolean): Self = StObject.set(x, "isMultiremote", value.asInstanceOf[js.Any])
    
    inline def setIsMultiremoteUndefined: Self = StObject.set(x, "isMultiremote", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
