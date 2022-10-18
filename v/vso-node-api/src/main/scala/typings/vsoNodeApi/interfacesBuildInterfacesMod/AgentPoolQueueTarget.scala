package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentPoolQueueTarget
  extends StObject
     with PhaseTarget {
  
  /**
    * Enables scripts and other processes launched while executing phase to access the OAuth token
    */
  var allowScriptsAuthAccessOption: Boolean
  
  var demands: js.Array[Any]
  
  /**
    * The execution options.
    */
  var executionOptions: AgentTargetExecutionOptions
  
  /**
    * The queue.
    */
  var queue: AgentPoolQueue
}
object AgentPoolQueueTarget {
  
  inline def apply(
    allowScriptsAuthAccessOption: Boolean,
    demands: js.Array[Any],
    executionOptions: AgentTargetExecutionOptions,
    queue: AgentPoolQueue,
    `type`: Double
  ): AgentPoolQueueTarget = {
    val __obj = js.Dynamic.literal(allowScriptsAuthAccessOption = allowScriptsAuthAccessOption.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], executionOptions = executionOptions.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPoolQueueTarget]
  }
  
  extension [Self <: AgentPoolQueueTarget](x: Self) {
    
    inline def setAllowScriptsAuthAccessOption(value: Boolean): Self = StObject.set(x, "allowScriptsAuthAccessOption", value.asInstanceOf[js.Any])
    
    inline def setDemands(value: js.Array[Any]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    inline def setDemandsVarargs(value: Any*): Self = StObject.set(x, "demands", js.Array(value*))
    
    inline def setExecutionOptions(value: AgentTargetExecutionOptions): Self = StObject.set(x, "executionOptions", value.asInstanceOf[js.Any])
    
    inline def setQueue(value: AgentPoolQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
  }
}
