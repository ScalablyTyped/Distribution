package typings.webpack.anon

import typings.webpack.webpackOptionsMod.RuleSetConditionOrConditionsAbsolute
import typings.webpack.webpackOptionsMod.RuleSetConditionsAbsolute
import typings.webpack.webpackOptionsMod._RuleSetConditionAbsolute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exclude extends _RuleSetConditionAbsolute {
  
  /**
  			 * Logical AND
  			 */
  var and: js.UndefOr[RuleSetConditionsAbsolute] = js.native
  
  /**
  			 * Exclude all modules matching any of these conditions
  			 */
  var exclude: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.native
  
  /**
  			 * Exclude all modules matching not any of these conditions
  			 */
  var include: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.native
  
  /**
  			 * Logical NOT
  			 */
  var not: js.UndefOr[RuleSetConditionsAbsolute] = js.native
  
  /**
  			 * Logical OR
  			 */
  var or: js.UndefOr[RuleSetConditionsAbsolute] = js.native
  
  /**
  			 * Exclude all modules matching any of these conditions
  			 */
  var test: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.native
}
object Exclude {
  
  @scala.inline
  def apply(): Exclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exclude]
  }
  
  @scala.inline
  implicit class ExcludeOps[Self <: Exclude] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: RuleSetConditionsAbsolute): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnd: Self = this.set("and", js.undefined)
    
    @scala.inline
    def setExcludeFunction1(value: /* value */ String => Boolean): Self = this.set("exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExclude(value: RuleSetConditionOrConditionsAbsolute): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeFunction1(value: /* value */ String => Boolean): Self = this.set("include", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInclude(value: RuleSetConditionOrConditionsAbsolute): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setNot(value: RuleSetConditionsAbsolute): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    
    @scala.inline
    def setOr(value: RuleSetConditionsAbsolute): Self = this.set("or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOr: Self = this.set("or", js.undefined)
    
    @scala.inline
    def setTestFunction1(value: /* value */ String => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTest(value: RuleSetConditionOrConditionsAbsolute): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
