package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEditing extends StObject {
  
  var isEditing: Boolean
  
  var value: Any
}
object IsEditing {
  
  inline def apply(isEditing: Boolean, value: Any): IsEditing = {
    val __obj = js.Dynamic.literal(isEditing = isEditing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEditing]
  }
  
  extension [Self <: IsEditing](x: Self) {
    
    inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
