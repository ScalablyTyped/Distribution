package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAgentBasedDeployment extends StObject {
  
  var enumValues: AgentBasedDeployment
}
object EnumValuesAgentBasedDeployment {
  
  inline def apply(enumValues: AgentBasedDeployment): EnumValuesAgentBasedDeployment = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAgentBasedDeployment]
  }
  
  extension [Self <: EnumValuesAgentBasedDeployment](x: Self) {
    
    inline def setEnumValues(value: AgentBasedDeployment): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
