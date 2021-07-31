package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentTargetExecutionOptions extends StObject {
  
  /**
    * Indicates the type of execution options.
    */
  var `type`: Double
}
object AgentTargetExecutionOptions {
  
  @scala.inline
  def apply(`type`: Double): AgentTargetExecutionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentTargetExecutionOptions]
  }
  
  @scala.inline
  implicit class AgentTargetExecutionOptionsMutableBuilder[Self <: AgentTargetExecutionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
