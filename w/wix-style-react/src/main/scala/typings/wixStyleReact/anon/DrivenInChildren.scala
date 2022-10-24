package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrivenInChildren extends StObject {
  
  var collapsibleOnScreenChildren: Any
  
  var drivenInChildren: Any
  
  var expandedInnerMenu: Unit
  
  var lastSelectedKey: Any
  
  var selectedKey: Any
}
object DrivenInChildren {
  
  inline def apply(
    collapsibleOnScreenChildren: Any,
    drivenInChildren: Any,
    expandedInnerMenu: Unit,
    lastSelectedKey: Any,
    selectedKey: Any
  ): DrivenInChildren = {
    val __obj = js.Dynamic.literal(collapsibleOnScreenChildren = collapsibleOnScreenChildren.asInstanceOf[js.Any], drivenInChildren = drivenInChildren.asInstanceOf[js.Any], expandedInnerMenu = expandedInnerMenu.asInstanceOf[js.Any], lastSelectedKey = lastSelectedKey.asInstanceOf[js.Any], selectedKey = selectedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivenInChildren]
  }
  
  extension [Self <: DrivenInChildren](x: Self) {
    
    inline def setCollapsibleOnScreenChildren(value: Any): Self = StObject.set(x, "collapsibleOnScreenChildren", value.asInstanceOf[js.Any])
    
    inline def setDrivenInChildren(value: Any): Self = StObject.set(x, "drivenInChildren", value.asInstanceOf[js.Any])
    
    inline def setExpandedInnerMenu(value: Unit): Self = StObject.set(x, "expandedInnerMenu", value.asInstanceOf[js.Any])
    
    inline def setLastSelectedKey(value: Any): Self = StObject.set(x, "lastSelectedKey", value.asInstanceOf[js.Any])
    
    inline def setSelectedKey(value: Any): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
  }
}
