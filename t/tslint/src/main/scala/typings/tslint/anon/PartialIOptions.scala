package typings.tslint.anon

import typings.tslint.ruleMod.IDisabledInterval
import typings.tslint.ruleMod.RuleSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tslint.tslint/lib/language/rule/rule.IOptions> */
@js.native
trait PartialIOptions extends js.Object {
  
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
  implicit class PartialIOptionsOps[Self <: PartialIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisabledIntervalsVarargs(value: IDisabledInterval*): Self = this.set("disabledIntervals", js.Array(value :_*))
    
    @scala.inline
    def setDisabledIntervals(value: js.Array[IDisabledInterval]): Self = this.set("disabledIntervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledIntervals: Self = this.set("disabledIntervals", js.undefined)
    
    @scala.inline
    def setRuleArgumentsVarargs(value: js.Any*): Self = this.set("ruleArguments", js.Array(value :_*))
    
    @scala.inline
    def setRuleArguments(value: js.Array[_]): Self = this.set("ruleArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleArguments: Self = this.set("ruleArguments", js.undefined)
    
    @scala.inline
    def setRuleName(value: String): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleName: Self = this.set("ruleName", js.undefined)
    
    @scala.inline
    def setRuleSeverity(value: RuleSeverity): Self = this.set("ruleSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleSeverity: Self = this.set("ruleSeverity", js.undefined)
  }
}
