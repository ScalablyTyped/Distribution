package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveAny extends StObject {
  
  var active: Any
}
object ActiveAny {
  
  inline def apply(active: Any): ActiveAny = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveAny]
  }
  
  extension [Self <: ActiveAny](x: Self) {
    
    inline def setActive(value: Any): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
  }
}
