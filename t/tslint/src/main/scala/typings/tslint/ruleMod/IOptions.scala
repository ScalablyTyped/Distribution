package typings.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  /**
    * @deprecated
    * Tslint now handles disables itself.
    * This will be empty.
    */
  var disabledIntervals: js.Array[IDisabledInterval] = js.native
  
  var ruleArguments: js.Array[_] = js.native
  
  var ruleName: String = js.native
  
  var ruleSeverity: RuleSeverity = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    disabledIntervals: js.Array[IDisabledInterval],
    ruleArguments: js.Array[_],
    ruleName: String,
    ruleSeverity: RuleSeverity
  ): IOptions = {
    val __obj = js.Dynamic.literal(disabledIntervals = disabledIntervals.asInstanceOf[js.Any], ruleArguments = ruleArguments.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSeverity = ruleSeverity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setRuleArgumentsVarargs(value: js.Any*): Self = this.set("ruleArguments", js.Array(value :_*))
    
    @scala.inline
    def setRuleArguments(value: js.Array[_]): Self = this.set("ruleArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleName(value: String): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSeverity(value: RuleSeverity): Self = this.set("ruleSeverity", value.asInstanceOf[js.Any])
  }
}
