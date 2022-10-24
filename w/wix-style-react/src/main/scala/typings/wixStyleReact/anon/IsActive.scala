package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsActive extends StObject {
  
  var id: Any
  
  var isActive: Any
  
  var item: Any
  
  var maxWidth: Any
  
  var onClick: Any
}
object IsActive {
  
  inline def apply(id: Any, isActive: Any, item: Any, maxWidth: Any, onClick: Any): IsActive = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsActive]
  }
  
  extension [Self <: IsActive](x: Self) {
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Any): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Any): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
  }
}
