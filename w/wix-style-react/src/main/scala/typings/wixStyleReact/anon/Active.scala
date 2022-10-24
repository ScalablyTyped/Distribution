package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  var active: Boolean
  
  var previous: Any
  
  var value: String
}
object Active {
  
  inline def apply(active: Boolean, previous: Any, value: String): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  extension [Self <: Active](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: Any): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
