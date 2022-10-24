package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrivenOutChildren extends StObject {
  
  var collapsibleOnScreenChildren: Any
  
  var drivenInChildren: Any
  
  var drivenOutChildren: js.Array[scala.Nothing]
  
  var expandedInnerMenu: Unit
  
  var lastSelectedKey: Any
  
  var selectedKey: Any
}
object DrivenOutChildren {
  
  inline def apply(
    collapsibleOnScreenChildren: Any,
    drivenInChildren: Any,
    drivenOutChildren: js.Array[scala.Nothing],
    expandedInnerMenu: Unit,
    lastSelectedKey: Any,
    selectedKey: Any
  ): DrivenOutChildren = {
    val __obj = js.Dynamic.literal(collapsibleOnScreenChildren = collapsibleOnScreenChildren.asInstanceOf[js.Any], drivenInChildren = drivenInChildren.asInstanceOf[js.Any], drivenOutChildren = drivenOutChildren.asInstanceOf[js.Any], expandedInnerMenu = expandedInnerMenu.asInstanceOf[js.Any], lastSelectedKey = lastSelectedKey.asInstanceOf[js.Any], selectedKey = selectedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivenOutChildren]
  }
  
  extension [Self <: DrivenOutChildren](x: Self) {
    
    inline def setCollapsibleOnScreenChildren(value: Any): Self = StObject.set(x, "collapsibleOnScreenChildren", value.asInstanceOf[js.Any])
    
    inline def setDrivenInChildren(value: Any): Self = StObject.set(x, "drivenInChildren", value.asInstanceOf[js.Any])
    
    inline def setDrivenOutChildren(value: js.Array[scala.Nothing]): Self = StObject.set(x, "drivenOutChildren", value.asInstanceOf[js.Any])
    
    inline def setDrivenOutChildrenVarargs(value: scala.Nothing*): Self = StObject.set(x, "drivenOutChildren", js.Array(value*))
    
    inline def setExpandedInnerMenu(value: Unit): Self = StObject.set(x, "expandedInnerMenu", value.asInstanceOf[js.Any])
    
    inline def setLastSelectedKey(value: Any): Self = StObject.set(x, "lastSelectedKey", value.asInstanceOf[js.Any])
    
    inline def setSelectedKey(value: Any): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
  }
}
