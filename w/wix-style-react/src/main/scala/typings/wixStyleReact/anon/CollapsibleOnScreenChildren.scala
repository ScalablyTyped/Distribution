package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleOnScreenChildren extends StObject {
  
  var collapsibleOnScreenChildren: js.Array[scala.Nothing]
  
  var drivenInChildren: js.Array[scala.Nothing]
  
  var drivenOutChildren: js.Array[scala.Nothing]
  
  var expandedInnerMenu: Unit
  
  var lastSelectedKey: String
  
  var onScreenChildren: js.Array[scala.Nothing]
  
  var persistentBottomChildren: js.Array[scala.Nothing]
  
  var persistentTopChildren: js.Array[scala.Nothing]
  
  var selectedKey: String
}
object CollapsibleOnScreenChildren {
  
  inline def apply(
    collapsibleOnScreenChildren: js.Array[scala.Nothing],
    drivenInChildren: js.Array[scala.Nothing],
    drivenOutChildren: js.Array[scala.Nothing],
    expandedInnerMenu: Unit,
    lastSelectedKey: String,
    onScreenChildren: js.Array[scala.Nothing],
    persistentBottomChildren: js.Array[scala.Nothing],
    persistentTopChildren: js.Array[scala.Nothing],
    selectedKey: String
  ): CollapsibleOnScreenChildren = {
    val __obj = js.Dynamic.literal(collapsibleOnScreenChildren = collapsibleOnScreenChildren.asInstanceOf[js.Any], drivenInChildren = drivenInChildren.asInstanceOf[js.Any], drivenOutChildren = drivenOutChildren.asInstanceOf[js.Any], expandedInnerMenu = expandedInnerMenu.asInstanceOf[js.Any], lastSelectedKey = lastSelectedKey.asInstanceOf[js.Any], onScreenChildren = onScreenChildren.asInstanceOf[js.Any], persistentBottomChildren = persistentBottomChildren.asInstanceOf[js.Any], persistentTopChildren = persistentTopChildren.asInstanceOf[js.Any], selectedKey = selectedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleOnScreenChildren]
  }
  
  extension [Self <: CollapsibleOnScreenChildren](x: Self) {
    
    inline def setCollapsibleOnScreenChildren(value: js.Array[scala.Nothing]): Self = StObject.set(x, "collapsibleOnScreenChildren", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleOnScreenChildrenVarargs(value: scala.Nothing*): Self = StObject.set(x, "collapsibleOnScreenChildren", js.Array(value*))
    
    inline def setDrivenInChildren(value: js.Array[scala.Nothing]): Self = StObject.set(x, "drivenInChildren", value.asInstanceOf[js.Any])
    
    inline def setDrivenInChildrenVarargs(value: scala.Nothing*): Self = StObject.set(x, "drivenInChildren", js.Array(value*))
    
    inline def setDrivenOutChildren(value: js.Array[scala.Nothing]): Self = StObject.set(x, "drivenOutChildren", value.asInstanceOf[js.Any])
    
    inline def setDrivenOutChildrenVarargs(value: scala.Nothing*): Self = StObject.set(x, "drivenOutChildren", js.Array(value*))
    
    inline def setExpandedInnerMenu(value: Unit): Self = StObject.set(x, "expandedInnerMenu", value.asInstanceOf[js.Any])
    
    inline def setLastSelectedKey(value: String): Self = StObject.set(x, "lastSelectedKey", value.asInstanceOf[js.Any])
    
    inline def setOnScreenChildren(value: js.Array[scala.Nothing]): Self = StObject.set(x, "onScreenChildren", value.asInstanceOf[js.Any])
    
    inline def setOnScreenChildrenVarargs(value: scala.Nothing*): Self = StObject.set(x, "onScreenChildren", js.Array(value*))
    
    inline def setPersistentBottomChildren(value: js.Array[scala.Nothing]): Self = StObject.set(x, "persistentBottomChildren", value.asInstanceOf[js.Any])
    
    inline def setPersistentBottomChildrenVarargs(value: scala.Nothing*): Self = StObject.set(x, "persistentBottomChildren", js.Array(value*))
    
    inline def setPersistentTopChildren(value: js.Array[scala.Nothing]): Self = StObject.set(x, "persistentTopChildren", value.asInstanceOf[js.Any])
    
    inline def setPersistentTopChildrenVarargs(value: scala.Nothing*): Self = StObject.set(x, "persistentTopChildren", js.Array(value*))
    
    inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
  }
}
