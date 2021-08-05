package typings.teslajs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Response extends StObject {
    
    var response: Boolean
  }
  object Response {
    
    inline def apply(response: Boolean): Response = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setResponse(value: Boolean): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
