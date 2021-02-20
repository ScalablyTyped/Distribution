package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseCondition extends Condition {
  
  var result: Boolean = js.native
}
object ReleaseCondition {
  
  @scala.inline
  def apply(conditionType: ConditionType, name: String, result: Boolean, value: String): ReleaseCondition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseCondition]
  }
  
  @scala.inline
  implicit class ReleaseConditionMutableBuilder[Self <: ReleaseCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
