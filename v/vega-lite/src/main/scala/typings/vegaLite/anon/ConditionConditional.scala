package typings.vegaLite.anon

import typings.vegaLite.buildSrcChanneldefMod.Conditional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionConditional extends StObject {
  
  var condition: Conditional[Any]
}
object ConditionConditional {
  
  inline def apply(condition: Conditional[Any]): ConditionConditional = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionConditional]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionConditional] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Conditional[Any]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
