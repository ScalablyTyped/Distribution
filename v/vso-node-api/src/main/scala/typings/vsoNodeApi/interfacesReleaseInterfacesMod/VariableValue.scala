package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableValue extends StObject {
  
  var isSecret: Boolean
  
  var value: String
}
object VariableValue {
  
  inline def apply(isSecret: Boolean, value: String): VariableValue = {
    val __obj = js.Dynamic.literal(isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValue]
  }
  
  extension [Self <: VariableValue](x: Self) {
    
    inline def setIsSecret(value: Boolean): Self = StObject.set(x, "isSecret", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
