package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelExecutionInputBase extends ExecutionInput {
  var continueOnError: scala.Boolean
  var maxNumberOfAgents: scala.Double
}

object ParallelExecutionInputBase {
  @scala.inline
  def apply(
    continueOnError: scala.Boolean,
    maxNumberOfAgents: scala.Double,
    parallelExecutionType: ParallelExecutionTypes
  ): ParallelExecutionInputBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("continueOnError")(continueOnError)
    __obj.updateDynamic("maxNumberOfAgents")(maxNumberOfAgents)
    __obj.updateDynamic("parallelExecutionType")(parallelExecutionType)
    __obj.asInstanceOf[ParallelExecutionInputBase]
  }
}

