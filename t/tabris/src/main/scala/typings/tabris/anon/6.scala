package typings.tabris.anon

import typings.tabris.mod.Action
import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Page
import typings.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var children: js.UndefOr[JSXChildren[Page | Action]] = js.undefined
}
object `6` {
  
  @scala.inline
  def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: JSXChildren[Page | Action]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ((Page | Action) | (WidgetCollection[Page | Action]))*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
