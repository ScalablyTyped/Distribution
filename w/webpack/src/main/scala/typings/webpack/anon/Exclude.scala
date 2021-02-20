package typings.webpack.anon

import typings.webpack.webpackOptionsMod.RuleSetConditionOrConditionsAbsolute
import typings.webpack.webpackOptionsMod.RuleSetConditionsAbsolute
import typings.webpack.webpackOptionsMod._RuleSetConditionAbsolute
import org.scalablytyped.runtime.StObject
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
  implicit class ExcludeMutableBuilder[Self <: Exclude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(value: RuleSetConditionsAbsolute): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    @scala.inline
    def setExclude(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setInclude(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setNot(value: RuleSetConditionsAbsolute): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setOr(value: RuleSetConditionsAbsolute): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
    
    @scala.inline
    def setTest(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
