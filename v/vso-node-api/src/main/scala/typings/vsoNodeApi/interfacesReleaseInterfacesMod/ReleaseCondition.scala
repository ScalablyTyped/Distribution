package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseCondition
  extends StObject
     with Condition {
  
  var result: Boolean
}
object ReleaseCondition {
  
  inline def apply(conditionType: ConditionType, name: String, result: Boolean, value: String): ReleaseCondition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseCondition]
  }
  
  extension [Self <: ReleaseCondition](x: Self) {
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
