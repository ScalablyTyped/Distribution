package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends StObject {
  
  /**
    * Gets or sets the condition type.
    */
  var conditionType: ConditionType = js.native
  
  /**
    * Gets or sets the name of the condition. e.g. 'ReleaseStarted'.
    */
  var name: String = js.native
  
  /**
    * Gets or set value of the condition.
    */
  var value: String = js.native
}
object Condition {
  
  @scala.inline
  def apply(conditionType: ConditionType, name: String, value: String): Condition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionType(value: ConditionType): Self = StObject.set(x, "conditionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
