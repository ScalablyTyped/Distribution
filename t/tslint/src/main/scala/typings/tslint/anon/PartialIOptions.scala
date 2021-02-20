package typings.tslint.anon

import typings.tslint.ruleMod.IDisabledInterval
import typings.tslint.ruleMod.RuleSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tslint.tslint/lib/language/rule/rule.IOptions> */
@js.native
trait PartialIOptions extends StObject {
  
  var disabledIntervals: js.UndefOr[js.Array[IDisabledInterval]] = js.native
  
  var ruleArguments: js.UndefOr[js.Array[_]] = js.native
  
  var ruleName: js.UndefOr[String] = js.native
  
  var ruleSeverity: js.UndefOr[RuleSeverity] = js.native
}
object PartialIOptions {
  
  @scala.inline
  def apply(): PartialIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOptions]
  }
  
  @scala.inline
  implicit class PartialIOptionsMutableBuilder[Self <: PartialIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabledIntervals(value: js.Array[IDisabledInterval]): Self = StObject.set(x, "disabledIntervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledIntervalsUndefined: Self = StObject.set(x, "disabledIntervals", js.undefined)
    
    @scala.inline
    def setDisabledIntervalsVarargs(value: IDisabledInterval*): Self = StObject.set(x, "disabledIntervals", js.Array(value :_*))
    
    @scala.inline
    def setRuleArguments(value: js.Array[_]): Self = StObject.set(x, "ruleArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleArgumentsUndefined: Self = StObject.set(x, "ruleArguments", js.undefined)
    
    @scala.inline
    def setRuleArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "ruleArguments", js.Array(value :_*))
    
    @scala.inline
    def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
    
    @scala.inline
    def setRuleSeverity(value: RuleSeverity): Self = StObject.set(x, "ruleSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSeverityUndefined: Self = StObject.set(x, "ruleSeverity", js.undefined)
  }
}
