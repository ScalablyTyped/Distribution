package typings.tabris.anon

import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Widget
import typings.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenJSXChildren extends StObject {
  
  var children: JSXChildren[Widget[Any]]
}
object ChildrenJSXChildren {
  
  inline def apply(): ChildrenJSXChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenJSXChildren]
  }
  
  extension [Self <: ChildrenJSXChildren](x: Self) {
    
    inline def setChildren(value: JSXChildren[Widget[Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Widget[Any] | WidgetCollection[Widget[Any]])*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
