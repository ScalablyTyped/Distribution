package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationVariableValue extends StObject {
  
  /**
    * Gets or sets as variable is secret or not.
    */
  var isSecret: Boolean
  
  /**
    * Gets or sets value of the configuration variable.
    */
  var value: String
}
object ConfigurationVariableValue {
  
  inline def apply(isSecret: Boolean, value: String): ConfigurationVariableValue = {
    val __obj = js.Dynamic.literal(isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationVariableValue]
  }
  
  extension [Self <: ConfigurationVariableValue](x: Self) {
    
    inline def setIsSecret(value: Boolean): Self = StObject.set(x, "isSecret", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
