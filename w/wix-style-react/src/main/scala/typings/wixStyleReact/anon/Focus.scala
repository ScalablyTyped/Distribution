package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focus extends StObject {
  
  var focus: Boolean
  
  var value: Any
}
object Focus {
  
  inline def apply(focus: Boolean, value: Any): Focus = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focus]
  }
  
  extension [Self <: Focus](x: Self) {
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
