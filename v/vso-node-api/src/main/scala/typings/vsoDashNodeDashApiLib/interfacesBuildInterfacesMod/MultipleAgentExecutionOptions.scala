package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleAgentExecutionOptions extends AgentTargetExecutionOptions {
  /**
    * Indicates whether failure on one agent should prevent the phase from running on other agents.
    */
  var continueOnError: scala.Boolean
  /**
    * The maximum number of agents to use simultaneously.
    */
  var maxConcurrency: scala.Double
}

object MultipleAgentExecutionOptions {
  @scala.inline
  def apply(continueOnError: scala.Boolean, maxConcurrency: scala.Double, `type`: scala.Double): MultipleAgentExecutionOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("continueOnError")(continueOnError)
    __obj.updateDynamic("maxConcurrency")(maxConcurrency)
    __obj.asInstanceOf[MultipleAgentExecutionOptions]
  }
}

