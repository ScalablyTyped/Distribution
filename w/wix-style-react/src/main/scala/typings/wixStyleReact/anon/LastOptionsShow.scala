package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastOptionsShow extends StObject {
  
  var inputValue: Any
  
  var isEditing: Boolean
  
  var lastOptionsShow: Double
  
  var showOptions: Boolean
}
object LastOptionsShow {
  
  inline def apply(inputValue: Any, isEditing: Boolean, lastOptionsShow: Double, showOptions: Boolean): LastOptionsShow = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isEditing = isEditing.asInstanceOf[js.Any], lastOptionsShow = lastOptionsShow.asInstanceOf[js.Any], showOptions = showOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastOptionsShow]
  }
  
  extension [Self <: LastOptionsShow](x: Self) {
    
    inline def setInputValue(value: Any): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
    
    inline def setLastOptionsShow(value: Double): Self = StObject.set(x, "lastOptionsShow", value.asInstanceOf[js.Any])
    
    inline def setShowOptions(value: Boolean): Self = StObject.set(x, "showOptions", value.asInstanceOf[js.Any])
  }
}
