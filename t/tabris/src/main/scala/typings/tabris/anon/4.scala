package typings.tabris.anon

import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Widget
import typings.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[ChildType /* <: Widget */] extends StObject {
  
  var children: js.UndefOr[JSXChildren[ChildType]] = js.undefined
}
object `4` {
  
  inline def apply[ChildType /* <: Widget */](): `4`[ChildType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[ChildType]]
  }
  
  extension [Self <: `4`[?], ChildType /* <: Widget */](x: Self & `4`[ChildType]) {
    
    inline def setChildren(value: JSXChildren[ChildType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (ChildType | WidgetCollection[ChildType])*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
