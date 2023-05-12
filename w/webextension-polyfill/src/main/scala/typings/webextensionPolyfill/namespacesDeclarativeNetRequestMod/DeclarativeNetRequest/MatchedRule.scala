package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchedRule extends StObject {
  
  /**
    * ID of the extension, if this rule belongs to a different extension.
    * Optional.
    */
  var extensionId: js.UndefOr[String] = js.undefined
  
  /**
    * A matching rule's ID.
    */
  var ruleId: Double
  
  /**
    * ID of the Ruleset this rule belongs to.
    */
  var rulesetId: String
}
object MatchedRule {
  
  inline def apply(ruleId: Double, rulesetId: String): MatchedRule = {
    val __obj = js.Dynamic.literal(ruleId = ruleId.asInstanceOf[js.Any], rulesetId = rulesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchedRule] (val x: Self) extends AnyVal {
    
    inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    inline def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
    
    inline def setRuleId(value: Double): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRulesetId(value: String): Self = StObject.set(x, "rulesetId", value.asInstanceOf[js.Any])
  }
}
