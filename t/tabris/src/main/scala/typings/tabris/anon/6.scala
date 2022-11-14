package typings.tabris.anon

import typings.tabris.mod.AnyWidget
import typings.tabris.mod.JSXChildren
import typings.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[WidgetType /* <: AnyWidget */] extends StObject {
  
  var children: js.UndefOr[JSXChildren[WidgetType]] = js.undefined
}
object `6` {
  
  inline def apply[WidgetType /* <: AnyWidget */](): `6`[WidgetType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[WidgetType]]
  }
  
  extension [Self <: `6`[?], WidgetType /* <: AnyWidget */](x: Self & `6`[WidgetType]) {
    
    inline def setChildren(value: JSXChildren[WidgetType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (WidgetType | WidgetCollection[WidgetType])*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
