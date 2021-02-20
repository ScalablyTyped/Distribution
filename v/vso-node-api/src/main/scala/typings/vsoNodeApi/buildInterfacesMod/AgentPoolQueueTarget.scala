package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentPoolQueueTarget extends PhaseTarget {
  
  /**
    * Enables scripts and other processes launched while executing phase to access the OAuth token
    */
  var allowScriptsAuthAccessOption: Boolean = js.native
  
  var demands: js.Array[_] = js.native
  
  /**
    * The execution options.
    */
  var executionOptions: AgentTargetExecutionOptions = js.native
  
  /**
    * The queue.
    */
  var queue: AgentPoolQueue = js.native
}
object AgentPoolQueueTarget {
  
  @scala.inline
  def apply(
    allowScriptsAuthAccessOption: Boolean,
    demands: js.Array[_],
    executionOptions: AgentTargetExecutionOptions,
    queue: AgentPoolQueue,
    `type`: Double
  ): AgentPoolQueueTarget = {
    val __obj = js.Dynamic.literal(allowScriptsAuthAccessOption = allowScriptsAuthAccessOption.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], executionOptions = executionOptions.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPoolQueueTarget]
  }
  
  @scala.inline
  implicit class AgentPoolQueueTargetMutableBuilder[Self <: AgentPoolQueueTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowScriptsAuthAccessOption(value: Boolean): Self = StObject.set(x, "allowScriptsAuthAccessOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemands(value: js.Array[_]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemandsVarargs(value: js.Any*): Self = StObject.set(x, "demands", js.Array(value :_*))
    
    @scala.inline
    def setExecutionOptions(value: AgentTargetExecutionOptions): Self = StObject.set(x, "executionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: AgentPoolQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
  }
}
