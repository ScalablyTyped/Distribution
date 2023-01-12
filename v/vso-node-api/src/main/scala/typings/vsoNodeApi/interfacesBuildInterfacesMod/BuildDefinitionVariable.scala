package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildDefinitionVariable extends StObject {
  
  /**
    * Indicates whether the value can be set at queue time.
    */
  var allowOverride: Boolean
  
  /**
    * Indicates whether the variable's value is a secret.
    */
  var isSecret: Boolean
  
  /**
    * The value of the variable.
    */
  var value: String
}
object BuildDefinitionVariable {
  
  inline def apply(allowOverride: Boolean, isSecret: Boolean, value: String): BuildDefinitionVariable = {
    val __obj = js.Dynamic.literal(allowOverride = allowOverride.asInstanceOf[js.Any], isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionVariable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildDefinitionVariable] (val x: Self) extends AnyVal {
    
    inline def setAllowOverride(value: Boolean): Self = StObject.set(x, "allowOverride", value.asInstanceOf[js.Any])
    
    inline def setIsSecret(value: Boolean): Self = StObject.set(x, "isSecret", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
