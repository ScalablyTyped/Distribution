package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyAttributesRuleSet
  extends StObject
     with ApplyAttributes[Any] {
  
  var children: js.UndefOr[RuleSet[Widget[Any]]] = js.undefined
}
object ApplyAttributesRuleSet {
  
  inline def apply(): ApplyAttributesRuleSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyAttributesRuleSet]
  }
  
  extension [Self <: ApplyAttributesRuleSet](x: Self) {
    
    inline def setChildren(value: RuleSet[Widget[Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: Widget[Any] => RuleSetStatic): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: RuleSetObject*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
