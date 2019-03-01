package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableMultipliersAgentExecutionOptions extends AgentTargetExecutionOptions {
  /**
    * Indicates whether failure on one agent should prevent the phase from running on other agents.
    */
  var continueOnError: scala.Boolean
  /**
    * The maximum number of agents to use in parallel.
    */
  var maxConcurrency: scala.Double
  var multipliers: js.Array[java.lang.String]
}

object VariableMultipliersAgentExecutionOptions {
  @scala.inline
  def apply(
    continueOnError: scala.Boolean,
    maxConcurrency: scala.Double,
    multipliers: js.Array[java.lang.String],
    `type`: scala.Double
  ): VariableMultipliersAgentExecutionOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("continueOnError")(continueOnError)
    __obj.updateDynamic("maxConcurrency")(maxConcurrency)
    __obj.updateDynamic("multipliers")(multipliers)
    __obj.asInstanceOf[VariableMultipliersAgentExecutionOptions]
  }
}

