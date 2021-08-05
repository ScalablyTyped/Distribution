package typings.vegaLite.anon

import typings.vegaLite.channeldefMod.Conditional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionConditional extends StObject {
  
  var condition: Conditional[js.Any]
}
object ConditionConditional {
  
  inline def apply(condition: Conditional[js.Any]): ConditionConditional = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionConditional]
  }
  
  extension [Self <: ConditionConditional](x: Self) {
    
    inline def setCondition(value: Conditional[js.Any]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
