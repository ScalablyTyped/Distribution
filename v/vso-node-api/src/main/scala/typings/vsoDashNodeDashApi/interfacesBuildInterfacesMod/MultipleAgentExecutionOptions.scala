package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleAgentExecutionOptions extends AgentTargetExecutionOptions {
  /**
    * Indicates whether failure on one agent should prevent the phase from running on other agents.
    */
  var continueOnError: Boolean
  /**
    * The maximum number of agents to use simultaneously.
    */
  var maxConcurrency: Double
}

object MultipleAgentExecutionOptions {
  @scala.inline
  def apply(continueOnError: Boolean, maxConcurrency: Double, `type`: Double): MultipleAgentExecutionOptions = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError, maxConcurrency = maxConcurrency)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MultipleAgentExecutionOptions]
  }
}

