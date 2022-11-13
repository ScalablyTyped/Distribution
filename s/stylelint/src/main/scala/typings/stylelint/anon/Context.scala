package typings.stylelint.anon

import typings.postcss.mod.Root_
import typings.std.NonNullable
import typings.stylelint.mod.ConfigRuleSettings
import typings.stylelint.mod.PostcssResult
import typings.stylelint.mod.RuleContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context[T, O /* <: js.Object */] extends StObject {
  
  var context: js.UndefOr[RuleContext] = js.undefined
  
  var result: js.UndefOr[PostcssResult] = js.undefined
  
  var root: Root_
  
  var ruleName: String
  
  var ruleSettings: ConfigRuleSettings[T, O]
}
object Context {
  
  inline def apply[T, O /* <: js.Object */](root: Root_, ruleName: String): Context[T, O] = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[T, O]]
  }
  
  extension [Self <: Context[?, ?], T, O /* <: js.Object */](x: Self & (Context[T, O])) {
    
    inline def setContext(value: RuleContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setResult(value: PostcssResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setRoot(value: Root_): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setRuleSettings(value: ConfigRuleSettings[T, O]): Self = StObject.set(x, "ruleSettings", value.asInstanceOf[js.Any])
    
    inline def setRuleSettingsNull: Self = StObject.set(x, "ruleSettings", null)
    
    inline def setRuleSettingsUndefined: Self = StObject.set(x, "ruleSettings", js.undefined)
    
    inline def setRuleSettingsVarargs(value: NonNullable[T]*): Self = StObject.set(x, "ruleSettings", js.Array(value*))
  }
}
