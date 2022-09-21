package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Logic operators used in a condition matcher.
  */
trait RuleSetLogicalConditions extends StObject {
  
  /**
  	 * Logical AND.
  	 */
  var and: js.UndefOr[js.Array[RuleSetCondition]] = js.undefined
  
  /**
  	 * Logical NOT.
  	 */
  var not: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
  ] = js.undefined
  
  /**
  	 * Logical OR.
  	 */
  var or: js.UndefOr[js.Array[RuleSetCondition]] = js.undefined
}
object RuleSetLogicalConditions {
  
  inline def apply(): RuleSetLogicalConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleSetLogicalConditions]
  }
  
  extension [Self <: RuleSetLogicalConditions](x: Self) {
    
    inline def setAnd(value: js.Array[RuleSetCondition]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    inline def setAndVarargs(value: RuleSetCondition*): Self = StObject.set(x, "and", js.Array(value*))
    
    inline def setNot(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    ): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "not", js.Any.fromFunction1(value))
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    inline def setNotVarargs(value: RuleSetCondition*): Self = StObject.set(x, "not", js.Array(value*))
    
    inline def setOr(value: js.Array[RuleSetCondition]): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
    
    inline def setOrVarargs(value: RuleSetCondition*): Self = StObject.set(x, "or", js.Array(value*))
  }
}
