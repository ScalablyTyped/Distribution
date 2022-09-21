package typings.tslint.anon

import typings.tslint.ruleMod.IDisabledInterval
import typings.tslint.ruleMod.RuleSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tslint.tslint/lib/language/rule/rule.IOptions> */
trait PartialIOptions extends StObject {
  
  var disabledIntervals: js.UndefOr[js.Array[IDisabledInterval]] = js.undefined
  
  var ruleArguments: js.UndefOr[js.Array[Any]] = js.undefined
  
  var ruleName: js.UndefOr[String] = js.undefined
  
  var ruleSeverity: js.UndefOr[RuleSeverity] = js.undefined
}
object PartialIOptions {
  
  inline def apply(): PartialIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOptions]
  }
  
  extension [Self <: PartialIOptions](x: Self) {
    
    inline def setDisabledIntervals(value: js.Array[IDisabledInterval]): Self = StObject.set(x, "disabledIntervals", value.asInstanceOf[js.Any])
    
    inline def setDisabledIntervalsUndefined: Self = StObject.set(x, "disabledIntervals", js.undefined)
    
    inline def setDisabledIntervalsVarargs(value: IDisabledInterval*): Self = StObject.set(x, "disabledIntervals", js.Array(value*))
    
    inline def setRuleArguments(value: js.Array[Any]): Self = StObject.set(x, "ruleArguments", value.asInstanceOf[js.Any])
    
    inline def setRuleArgumentsUndefined: Self = StObject.set(x, "ruleArguments", js.undefined)
    
    inline def setRuleArgumentsVarargs(value: Any*): Self = StObject.set(x, "ruleArguments", js.Array(value*))
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
    
    inline def setRuleSeverity(value: RuleSeverity): Self = StObject.set(x, "ruleSeverity", value.asInstanceOf[js.Any])
    
    inline def setRuleSeverityUndefined: Self = StObject.set(x, "ruleSeverity", js.undefined)
  }
}
