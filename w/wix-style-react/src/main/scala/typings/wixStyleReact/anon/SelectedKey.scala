package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedKey extends StObject {
  
  var collapsibleOnScreenChildren: Any
  
  var expandedInnerMenu: Unit
  
  var selectedKey: Any
}
object SelectedKey {
  
  inline def apply(collapsibleOnScreenChildren: Any, expandedInnerMenu: Unit, selectedKey: Any): SelectedKey = {
    val __obj = js.Dynamic.literal(collapsibleOnScreenChildren = collapsibleOnScreenChildren.asInstanceOf[js.Any], expandedInnerMenu = expandedInnerMenu.asInstanceOf[js.Any], selectedKey = selectedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedKey]
  }
  
  extension [Self <: SelectedKey](x: Self) {
    
    inline def setCollapsibleOnScreenChildren(value: Any): Self = StObject.set(x, "collapsibleOnScreenChildren", value.asInstanceOf[js.Any])
    
    inline def setExpandedInnerMenu(value: Unit): Self = StObject.set(x, "expandedInnerMenu", value.asInstanceOf[js.Any])
    
    inline def setSelectedKey(value: Any): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
  }
}
