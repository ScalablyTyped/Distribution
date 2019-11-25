package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableMultipliersServerExecutionOptions extends ServerTargetExecutionOptions {
  /**
    * Indicates whether failure of one job should prevent the phase from running in other jobs.
    */
  var continueOnError: Boolean
  /**
    * The maximum number of server jobs to run in parallel.
    */
  var maxConcurrency: Double
  var multipliers: js.Array[String]
}

object VariableMultipliersServerExecutionOptions {
  @scala.inline
  def apply(continueOnError: Boolean, maxConcurrency: Double, multipliers: js.Array[String], `type`: Double): VariableMultipliersServerExecutionOptions = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], multipliers = multipliers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableMultipliersServerExecutionOptions]
  }
}

