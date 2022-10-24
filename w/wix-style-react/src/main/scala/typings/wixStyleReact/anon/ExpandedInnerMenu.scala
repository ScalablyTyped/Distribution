package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandedInnerMenu extends StObject {
  
  var collapsibleOnScreenChildren: Any
  
  var expandedInnerMenu: Unit
}
object ExpandedInnerMenu {
  
  inline def apply(collapsibleOnScreenChildren: Any, expandedInnerMenu: Unit): ExpandedInnerMenu = {
    val __obj = js.Dynamic.literal(collapsibleOnScreenChildren = collapsibleOnScreenChildren.asInstanceOf[js.Any], expandedInnerMenu = expandedInnerMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedInnerMenu]
  }
  
  extension [Self <: ExpandedInnerMenu](x: Self) {
    
    inline def setCollapsibleOnScreenChildren(value: Any): Self = StObject.set(x, "collapsibleOnScreenChildren", value.asInstanceOf[js.Any])
    
    inline def setExpandedInnerMenu(value: Unit): Self = StObject.set(x, "expandedInnerMenu", value.asInstanceOf[js.Any])
  }
}
