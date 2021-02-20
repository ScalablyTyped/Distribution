package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentVariableMutator extends StObject {
  
  /**
    * The type of mutation that will occur to the variable.
    */
  val `type`: EnvironmentVariableMutatorType = js.native
  
  /**
    * The value to use for the variable.
    */
  val value: String = js.native
}
object EnvironmentVariableMutator {
  
  @scala.inline
  def apply(`type`: EnvironmentVariableMutatorType, value: String): EnvironmentVariableMutator = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVariableMutator]
  }
  
  @scala.inline
  implicit class EnvironmentVariableMutatorMutableBuilder[Self <: EnvironmentVariableMutator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnvironmentVariableMutatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
