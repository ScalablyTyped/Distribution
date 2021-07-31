package typings.tabris.anon

import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Widget
import typings.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19`[WidgetType /* <: Widget */] extends StObject {
  
  var children: js.UndefOr[JSXChildren[WidgetType]] = js.undefined
}
object `19` {
  
  @scala.inline
  def apply[WidgetType /* <: Widget */](): `19`[WidgetType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`19`[WidgetType]]
  }
  
  @scala.inline
  implicit class `19MutableBuilder`[Self <: `19`[?], WidgetType /* <: Widget */] (val x: Self & `19`[WidgetType]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: JSXChildren[WidgetType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (WidgetType | WidgetCollection[WidgetType])*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
