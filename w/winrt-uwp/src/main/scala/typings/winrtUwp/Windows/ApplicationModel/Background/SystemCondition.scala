package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a system condition that must be in effect for a background task to run. */
@js.native
trait SystemCondition extends StObject {
  
  /** Gets the condition type of a system condition. */
  var conditionType: SystemConditionType = js.native
}
object SystemCondition {
  
  @scala.inline
  def apply(conditionType: SystemConditionType): SystemCondition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemCondition]
  }
  
  @scala.inline
  implicit class SystemConditionMutableBuilder[Self <: SystemCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionType(value: SystemConditionType): Self = StObject.set(x, "conditionType", value.asInstanceOf[js.Any])
  }
}
