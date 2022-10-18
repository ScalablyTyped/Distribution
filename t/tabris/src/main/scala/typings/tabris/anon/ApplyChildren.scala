package typings.tabris.anon

import typings.tabris.mod.Composite
import typings.tabris.mod.JSXChildren
import typings.tabris.mod.RuleSet
import typings.tabris.mod.RuleSetObject
import typings.tabris.mod.RuleSetStatic
import typings.tabris.mod.Widget
import typings.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyChildren[T /* <: Composite[Widget[Any]] */, U /* <: Widget[Any] */] extends StObject {
  
  @JSName("apply")
  var apply: js.UndefOr[RuleSet[T]] = js.undefined
  
  var children: js.UndefOr[JSXChildren[U]] = js.undefined
}
object ApplyChildren {
  
  inline def apply[T /* <: Composite[Widget[Any]] */, U /* <: Widget[Any] */](): ApplyChildren[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyChildren[T, U]]
  }
  
  extension [Self <: ApplyChildren[?, ?], T /* <: Composite[Widget[Any]] */, U /* <: Widget[Any] */](x: Self & (ApplyChildren[T, U])) {
    
    inline def setApply(value: RuleSet[T]): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    inline def setApplyFunction1(value: T => RuleSetStatic): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setApplyNull: Self = StObject.set(x, "apply", null)
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setApplyVarargs(value: RuleSetObject*): Self = StObject.set(x, "apply", js.Array(value*))
    
    inline def setChildren(value: JSXChildren[U]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (U | WidgetCollection[U])*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
