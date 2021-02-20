package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationVariableValue extends StObject {
  
  /**
    * Gets or sets as variable is secret or not.
    */
  var isSecret: Boolean = js.native
  
  /**
    * Gets or sets value of the configuration variable.
    */
  var value: String = js.native
}
object ConfigurationVariableValue {
  
  @scala.inline
  def apply(isSecret: Boolean, value: String): ConfigurationVariableValue = {
    val __obj = js.Dynamic.literal(isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationVariableValue]
  }
  
  @scala.inline
  implicit class ConfigurationVariableValueMutableBuilder[Self <: ConfigurationVariableValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSecret(value: Boolean): Self = StObject.set(x, "isSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
