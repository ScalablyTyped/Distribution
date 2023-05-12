package typings.stylelint.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait RuleOptions extends StObject {
  
  var actual: Any
  
  var optional: js.UndefOr[Boolean] = js.undefined
  
  var possible: js.UndefOr[
    RuleOptionsPossibleFunc | js.Array[RuleOptionsPossible] | (Record[String, js.Array[RuleOptionsPossible]])
  ] = js.undefined
}
object RuleOptions {
  
  inline def apply(actual: Any): RuleOptions = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleOptions] (val x: Self) extends AnyVal {
    
    inline def setActual(value: Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setPossible(
      value: RuleOptionsPossibleFunc | js.Array[RuleOptionsPossible] | (Record[String, js.Array[RuleOptionsPossible]])
    ): Self = StObject.set(x, "possible", value.asInstanceOf[js.Any])
    
    inline def setPossibleFunction1(value: /* value */ Any => Boolean): Self = StObject.set(x, "possible", js.Any.fromFunction1(value))
    
    inline def setPossibleUndefined: Self = StObject.set(x, "possible", js.undefined)
    
    inline def setPossibleVarargs(value: RuleOptionsPossible*): Self = StObject.set(x, "possible", js.Array(value*))
  }
}
