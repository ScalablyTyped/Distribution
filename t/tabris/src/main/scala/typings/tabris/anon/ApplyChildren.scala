package typings.tabris.anon

import typings.tabris.mod.AnyWidget
import typings.tabris.mod.JSXCandidate
import typings.tabris.mod.JSXChildren
import typings.tabris.mod.RuleSet
import typings.tabris.mod.RuleSetObject
import typings.tabris.mod.RuleSetStatic
import typings.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyChildren[ThisType /* <: JSXCandidate */, ChildType /* <: AnyWidget */] extends StObject {
  
  @JSName("apply")
  var apply: js.UndefOr[RuleSet[ThisType]] = js.undefined
  
  var children: js.UndefOr[JSXChildren[ChildType]] = js.undefined
}
object ApplyChildren {
  
  inline def apply[ThisType /* <: JSXCandidate */, ChildType /* <: AnyWidget */](): ApplyChildren[ThisType, ChildType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyChildren[ThisType, ChildType]]
  }
  
  extension [Self <: ApplyChildren[?, ?], ThisType /* <: JSXCandidate */, ChildType /* <: AnyWidget */](x: Self & (ApplyChildren[ThisType, ChildType])) {
    
    inline def setApply(value: RuleSet[ThisType]): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    inline def setApplyFunction1(value: ThisType => RuleSetStatic): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setApplyNull: Self = StObject.set(x, "apply", null)
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setApplyVarargs(value: RuleSetObject*): Self = StObject.set(x, "apply", js.Array(value*))
    
    inline def setChildren(value: JSXChildren[ChildType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (ChildType | WidgetCollection[ChildType])*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
