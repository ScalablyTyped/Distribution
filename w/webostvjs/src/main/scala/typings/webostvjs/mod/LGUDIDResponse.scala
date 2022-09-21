package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LGUDIDResponse extends StObject {
  
  /**
    * LG unique device ID.
    */
  var id: String
}
object LGUDIDResponse {
  
  inline def apply(id: String): LGUDIDResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LGUDIDResponse]
  }
  
  extension [Self <: LGUDIDResponse](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
