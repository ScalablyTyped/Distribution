package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var disabled: Boolean
  
  var id: String
  
  var overrideOptionStyle: Boolean
  
  var value: Any
}
object Id {
  
  inline def apply(disabled: Boolean, id: String, overrideOptionStyle: Boolean, value: Any): Id = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], overrideOptionStyle = overrideOptionStyle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOverrideOptionStyle(value: Boolean): Self = StObject.set(x, "overrideOptionStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
