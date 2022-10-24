package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableEditing extends StObject {
  
  var disableEditing: Boolean
  
  var value: Any
}
object DisableEditing {
  
  inline def apply(disableEditing: Boolean, value: Any): DisableEditing = {
    val __obj = js.Dynamic.literal(disableEditing = disableEditing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableEditing]
  }
  
  extension [Self <: DisableEditing](x: Self) {
    
    inline def setDisableEditing(value: Boolean): Self = StObject.set(x, "disableEditing", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
