package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentPoolQueueTarget extends PhaseTarget {
  /**
    * Enables scripts and other processes launched while executing phase to access the OAuth token
    */
  var allowScriptsAuthAccessOption: Boolean
  var demands: js.Array[_]
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
}

