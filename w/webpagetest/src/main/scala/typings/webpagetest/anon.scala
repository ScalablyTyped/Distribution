package typings.webpagetest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Location extends StObject {
    
    var location: js.Array[typings.webpagetest.mod.Location]
  }
  object Location {
    
    inline def apply(location: js.Array[typings.webpagetest.mod.Location]): Location = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setLocation(value: js.Array[typings.webpagetest.mod.Location]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationVarargs(value: typings.webpagetest.mod.Location*): Self = StObject.set(x, "location", js.Array(value*))
    }
  }
  
  trait Response extends StObject {
    
    var response: typings.webpagetest.mod.Response[Location]
  }
  object Response {
    
    inline def apply(response: typings.webpagetest.mod.Response[Location]): Response = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setResponse(value: typings.webpagetest.mod.Response[Location]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
