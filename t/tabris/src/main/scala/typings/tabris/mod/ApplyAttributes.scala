package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tabris.mod.ApplyAttributesTypedSetter[WidgetConstructor]
  - typings.tabris.mod.ApplyAttributesUntypedSetter
  - typings.tabris.mod.ApplyAttributesRuleSet
*/
trait ApplyAttributes[WidgetConstructor /* <: BaseConstructor[Widget[Any]] */] extends StObject
object ApplyAttributes {
  
  inline def ApplyAttributesRuleSet(): typings.tabris.mod.ApplyAttributesRuleSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.tabris.mod.ApplyAttributesRuleSet]
  }
  
  inline def ApplyAttributesTypedSetter[WidgetConstructor /* <: BaseConstructor[Widget[Any]] */](target: WidgetConstructor): typings.tabris.mod.ApplyAttributesTypedSetter[WidgetConstructor] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tabris.mod.ApplyAttributesTypedSetter[WidgetConstructor]]
  }
  
  inline def ApplyAttributesUntypedSetter(): typings.tabris.mod.ApplyAttributesUntypedSetter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.tabris.mod.ApplyAttributesUntypedSetter]
  }
}
