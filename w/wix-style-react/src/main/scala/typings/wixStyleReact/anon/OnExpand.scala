package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnExpand extends StObject {
  
  var children: Any
  
  var disabled: Any
  
  var itemKey: Any
  
  var onClick: Any
  
  var onCollapse: Any
  
  var onExpand: Any
  
  var onToggle: Any
  
  var selectedKey: Any
}
object OnExpand {
  
  inline def apply(
    children: Any,
    disabled: Any,
    itemKey: Any,
    onClick: Any,
    onCollapse: Any,
    onExpand: Any,
    onToggle: Any,
    selectedKey: Any
  ): OnExpand = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], itemKey = itemKey.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onCollapse = onCollapse.asInstanceOf[js.Any], onExpand = onExpand.asInstanceOf[js.Any], onToggle = onToggle.asInstanceOf[js.Any], selectedKey = selectedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExpand]
  }
  
  extension [Self <: OnExpand](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setItemKey(value: Any): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnCollapse(value: Any): Self = StObject.set(x, "onCollapse", value.asInstanceOf[js.Any])
    
    inline def setOnExpand(value: Any): Self = StObject.set(x, "onExpand", value.asInstanceOf[js.Any])
    
    inline def setOnToggle(value: Any): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
    
    inline def setSelectedKey(value: Any): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
  }
}
