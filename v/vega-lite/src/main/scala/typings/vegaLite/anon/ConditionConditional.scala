package typings.vegaLite.anon

import typings.vegaLite.channeldefMod.Conditional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionConditional extends StObject {
  
  var condition: Conditional[_] = js.native
}
object ConditionConditional {
  
  @scala.inline
  def apply(condition: Conditional[_]): ConditionConditional = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionConditional]
  }
  
  @scala.inline
  implicit class ConditionConditionalMutableBuilder[Self <: ConditionConditional] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Conditional[_]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
