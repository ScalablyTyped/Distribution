package typings.webpack.anon

import typings.webpack.webpackOptionsMod.RuleSetConditionOrConditions
import typings.webpack.webpackOptionsMod.RuleSetConditions
import typings.webpack.webpackOptionsMod._RuleSetCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait And extends _RuleSetCondition {
  
  /**
  			 * Logical AND
  			 */
  var and: js.UndefOr[RuleSetConditions] = js.native
  
  /**
  			 * Exclude all modules matching any of these conditions
  			 */
  var exclude: js.UndefOr[RuleSetConditionOrConditions] = js.native
  
  /**
  			 * Exclude all modules matching not any of these conditions
  			 */
  var include: js.UndefOr[RuleSetConditionOrConditions] = js.native
  
  /**
  			 * Logical NOT
  			 */
  var not: js.UndefOr[RuleSetConditions] = js.native
  
  /**
  			 * Logical OR
  			 */
  var or: js.UndefOr[RuleSetConditions] = js.native
  
  /**
  			 * Exclude all modules matching any of these conditions
  			 */
  var test: js.UndefOr[RuleSetConditionOrConditions] = js.native
}
object And {
  
  @scala.inline
  def apply(): And = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And]
  }
  
  @scala.inline
  implicit class AndOps[Self <: And] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: RuleSetConditions): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnd: Self = this.set("and", js.undefined)
    
    @scala.inline
    def setExcludeFunction1(value: /* value */ String => Boolean): Self = this.set("exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExclude(value: RuleSetConditionOrConditions): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeFunction1(value: /* value */ String => Boolean): Self = this.set("include", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInclude(value: RuleSetConditionOrConditions): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setNot(value: RuleSetConditions): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    
    @scala.inline
    def setOr(value: RuleSetConditions): Self = this.set("or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOr: Self = this.set("or", js.undefined)
    
    @scala.inline
    def setTestFunction1(value: /* value */ String => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTest(value: RuleSetConditionOrConditions): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
