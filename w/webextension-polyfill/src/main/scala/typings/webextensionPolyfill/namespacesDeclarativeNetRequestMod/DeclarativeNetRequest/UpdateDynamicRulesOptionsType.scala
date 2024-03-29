package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDynamicRulesOptionsType extends StObject {
  
  /**
    * Rules to add.
    * Optional.
    */
  var addRules: js.UndefOr[js.Array[Rule]] = js.undefined
  
  /**
    * IDs of the rules to remove. Any invalid IDs will be ignored.
    * Optional.
    */
  var removeRuleIds: js.UndefOr[js.Array[Double]] = js.undefined
}
object UpdateDynamicRulesOptionsType {
  
  inline def apply(): UpdateDynamicRulesOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDynamicRulesOptionsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDynamicRulesOptionsType] (val x: Self) extends AnyVal {
    
    inline def setAddRules(value: js.Array[Rule]): Self = StObject.set(x, "addRules", value.asInstanceOf[js.Any])
    
    inline def setAddRulesUndefined: Self = StObject.set(x, "addRules", js.undefined)
    
    inline def setAddRulesVarargs(value: Rule*): Self = StObject.set(x, "addRules", js.Array(value*))
    
    inline def setRemoveRuleIds(value: js.Array[Double]): Self = StObject.set(x, "removeRuleIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveRuleIdsUndefined: Self = StObject.set(x, "removeRuleIds", js.undefined)
    
    inline def setRemoveRuleIdsVarargs(value: Double*): Self = StObject.set(x, "removeRuleIds", js.Array(value*))
  }
}
