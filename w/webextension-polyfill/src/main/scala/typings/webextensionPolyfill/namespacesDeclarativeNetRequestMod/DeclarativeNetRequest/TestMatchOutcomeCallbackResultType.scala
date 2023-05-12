package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestMatchOutcomeCallbackResultType extends StObject {
  
  /**
    * The rules (if any) that match the hypothetical request.
    */
  var matchedRules: js.Array[MatchedRule]
}
object TestMatchOutcomeCallbackResultType {
  
  inline def apply(matchedRules: js.Array[MatchedRule]): TestMatchOutcomeCallbackResultType = {
    val __obj = js.Dynamic.literal(matchedRules = matchedRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMatchOutcomeCallbackResultType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestMatchOutcomeCallbackResultType] (val x: Self) extends AnyVal {
    
    inline def setMatchedRules(value: js.Array[MatchedRule]): Self = StObject.set(x, "matchedRules", value.asInstanceOf[js.Any])
    
    inline def setMatchedRulesVarargs(value: MatchedRule*): Self = StObject.set(x, "matchedRules", js.Array(value*))
  }
}
