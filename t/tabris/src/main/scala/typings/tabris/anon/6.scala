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
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setChildren(value: JSXChildren[Page | Action]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ((Page | Action) | (WidgetCollection[Page | Action]))*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
