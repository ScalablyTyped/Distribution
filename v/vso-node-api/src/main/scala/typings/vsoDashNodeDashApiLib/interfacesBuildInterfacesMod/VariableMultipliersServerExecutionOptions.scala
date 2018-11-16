package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VariableMultipliersServerExecutionOptions extends ServerTargetExecutionOptions {
  /**
       * Indicates whether failure of one job should prevent the phase from running in other jobs.
       */
  var continueOnError: scala.Boolean
  /**
       * The maximum number of server jobs to run in parallel.
       */
  var maxConcurrency: scala.Double
  var multipliers: js.Array[java.lang.String]
}

