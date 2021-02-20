package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionVariable extends StObject {
  
  /**
    * Indicates whether the value can be set at queue time.
    */
  var allowOverride: Boolean = js.native
  
  /**
    * Indicates whether the variable's value is a secret.
    */
  var isSecret: Boolean = js.native
  
  /**
    * The value of the variable.
    */
  var value: String = js.native
}
object BuildDefinitionVariable {
  
  @scala.inline
  def apply(allowOverride: Boolean, isSecret: Boolean, value: String): BuildDefinitionVariable = {
    val __obj = js.Dynamic.literal(allowOverride = allowOverride.asInstanceOf[js.Any], isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionVariable]
  }
  
  @scala.inline
  implicit class BuildDefinitionVariableMutableBuilder[Self <: BuildDefinitionVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowOverride(value: Boolean): Self = StObject.set(x, "allowOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSecret(value: Boolean): Self = StObject.set(x, "isSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
