package typings.tabris.anon

import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Widget
import typings.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentView extends StObject {
  
  var children: js.UndefOr[JSXChildren[Widget]] = js.undefined
  
  var contentView: js.UndefOr[scala.Nothing] = js.undefined
}
object ContentView {
  
  inline def apply(): ContentView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentView]
  }
  
  extension [Self <: ContentView](x: Self) {
    
    inline def setChildren(value: JSXChildren[Widget]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Widget | WidgetCollection[Widget])*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
