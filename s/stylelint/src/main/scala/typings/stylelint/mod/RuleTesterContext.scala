package typings.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleTesterContext extends js.Object {
  
  var caseDescription: String = js.native
  
  var comparisonCount: Double = js.native
  
  var completeAssertionDescription: String = js.native
  
  var only: js.UndefOr[Boolean] = js.native
}
object RuleTesterContext {
  
  @scala.inline
  def apply(caseDescription: String, comparisonCount: Double, completeAssertionDescription: String): RuleTesterContext = {
    val __obj = js.Dynamic.literal(caseDescription = caseDescription.asInstanceOf[js.Any], comparisonCount = comparisonCount.asInstanceOf[js.Any], completeAssertionDescription = completeAssertionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleTesterContext]
  }
  
  @scala.inline
  implicit class RuleTesterContextOps[Self <: RuleTesterContext] (val x: Self) extends AnyVal {
    
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
    def setCaseDescription(value: String): Self = this.set("caseDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonCount(value: Double): Self = this.set("comparisonCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteAssertionDescription(value: String): Self = this.set("completeAssertionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnly(value: Boolean): Self = this.set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
  }
}
