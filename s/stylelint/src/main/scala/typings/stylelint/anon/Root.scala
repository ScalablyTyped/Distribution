package typings.stylelint.anon

import typings.postcss.mod.Root_
import typings.std.NonNullable
import typings.stylelint.mod.ConfigRuleSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root[T, O /* <: js.Object */] extends StObject {
  
  var root: Root_
  
  var ruleName: String
  
  var ruleSettings: ConfigRuleSettings[T, O]
}
object Root {
  
  inline def apply[T, O /* <: js.Object */](root: Root_, ruleName: String): Root[T, O] = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root[T, O]]
  }
  
  extension [Self <: Root[?, ?], T, O /* <: js.Object */](x: Self & (Root[T, O])) {
    
    inline def setRoot(value: Root_): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setRuleSettings(value: ConfigRuleSettings[T, O]): Self = StObject.set(x, "ruleSettings", value.asInstanceOf[js.Any])
    
    inline def setRuleSettingsNull: Self = StObject.set(x, "ruleSettings", null)
    
    inline def setRuleSettingsUndefined: Self = StObject.set(x, "ruleSettings", js.undefined)
    
    inline def setRuleSettingsVarargs(value: NonNullable[T]*): Self = StObject.set(x, "ruleSettings", js.Array(value*))
  }
}
