package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnabledRulesetsUpdateRulesetOptionsType extends StObject {
  
  /**
    * Optional.
    */
  var disableRulesetIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.
    */
  var enableRulesetIds: js.UndefOr[js.Array[String]] = js.undefined
}
object UpdateEnabledRulesetsUpdateRulesetOptionsType {
  
  inline def apply(): UpdateEnabledRulesetsUpdateRulesetOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEnabledRulesetsUpdateRulesetOptionsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEnabledRulesetsUpdateRulesetOptionsType] (val x: Self) extends AnyVal {
    
    inline def setDisableRulesetIds(value: js.Array[String]): Self = StObject.set(x, "disableRulesetIds", value.asInstanceOf[js.Any])
    
    inline def setDisableRulesetIdsUndefined: Self = StObject.set(x, "disableRulesetIds", js.undefined)
    
    inline def setDisableRulesetIdsVarargs(value: String*): Self = StObject.set(x, "disableRulesetIds", js.Array(value*))
    
    inline def setEnableRulesetIds(value: js.Array[String]): Self = StObject.set(x, "enableRulesetIds", value.asInstanceOf[js.Any])
    
    inline def setEnableRulesetIdsUndefined: Self = StObject.set(x, "enableRulesetIds", js.undefined)
    
    inline def setEnableRulesetIdsVarargs(value: String*): Self = StObject.set(x, "enableRulesetIds", js.Array(value*))
  }
}
