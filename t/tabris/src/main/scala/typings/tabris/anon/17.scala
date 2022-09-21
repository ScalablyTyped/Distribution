package typings.tabris.anon

import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Widget
import typings.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17`[WidgetType /* <: Widget[Any] */] extends StObject {
  
  var children: js.UndefOr[JSXChildren[WidgetType]] = js.undefined
}
object `17` {
  
  inline def apply[WidgetType /* <: Widget[Any] */](): `17`[WidgetType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`17`[WidgetType]]
  }
  
  extension [Self <: `17`[?], WidgetType /* <: Widget[Any] */](x: Self & `17`[WidgetType]) {
    
    inline def setChildren(value: JSXChildren[WidgetType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (WidgetType | WidgetCollection[WidgetType])*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
