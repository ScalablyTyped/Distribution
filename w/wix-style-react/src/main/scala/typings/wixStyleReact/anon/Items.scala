package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  var className: Any
  
  var dataHook: Any
  
  var items: Any
  
  var maxItems: Any
  
  var showDivider: Any
  
  var size: Any
  
  var `type`: Any
}
object Items {
  
  inline def apply(className: Any, dataHook: Any, items: Any, maxItems: Any, showDivider: Any, size: Any, `type`: Any): Items = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], showDivider = showDivider.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  extension [Self <: Items](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: Any): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setShowDivider(value: Any): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
