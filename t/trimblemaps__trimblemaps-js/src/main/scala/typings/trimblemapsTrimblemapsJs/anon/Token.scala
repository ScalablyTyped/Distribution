package typings.trimblemapsTrimblemapsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  var placeId: String
  
  var token: js.UndefOr[String] = js.undefined
}
object Token {
  
  inline def apply(placeId: String): Token = {
    val __obj = js.Dynamic.literal(placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
