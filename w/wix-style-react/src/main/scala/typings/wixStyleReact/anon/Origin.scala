package typings.wixStyleReact.anon

import typings.wixStyleReact.wixStyleReactStrings.SINGLE_TOGGLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Origin extends StObject {
  
  var id: String
  
  var origin: String
  
  var `type`: SINGLE_TOGGLE
  
  var value: Boolean
}
object Origin {
  
  inline def apply(id: String, origin: String, value: Boolean): Origin = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SINGLE_TOGGLE")
    __obj.asInstanceOf[Origin]
  }
  
  extension [Self <: Origin](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setType(value: SINGLE_TOGGLE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
