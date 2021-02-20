package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableValue extends StObject {
  
  var isSecret: Boolean = js.native
  
  var value: String = js.native
}
object VariableValue {
  
  @scala.inline
  def apply(isSecret: Boolean, value: String): VariableValue = {
    val __obj = js.Dynamic.literal(isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValue]
  }
  
  @scala.inline
  implicit class VariableValueMutableBuilder[Self <: VariableValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSecret(value: Boolean): Self = StObject.set(x, "isSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
