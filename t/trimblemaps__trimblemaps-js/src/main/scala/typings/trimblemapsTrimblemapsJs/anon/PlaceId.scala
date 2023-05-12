package typings.trimblemapsTrimblemapsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceId extends StObject {
  
  var placeId: String
  
  var token: String
}
object PlaceId {
  
  inline def apply(placeId: String, token: String): PlaceId = {
    val __obj = js.Dynamic.literal(placeId = placeId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceId] (val x: Self) extends AnyVal {
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
