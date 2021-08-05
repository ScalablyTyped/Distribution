package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * Gets or sets the condition type.
    */
  var conditionType: ConditionType
  
  /**
    * Gets or sets the name of the condition. e.g. 'ReleaseStarted'.
    */
  var name: String
  
  /**
    * Gets or set value of the condition.
    */
  var value: String
}
object Condition {
  
  inline def apply(conditionType: ConditionType, name: String, value: String): Condition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  extension [Self <: Condition](x: Self) {
    
    inline def setConditionType(value: ConditionType): Self = StObject.set(x, "conditionType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
