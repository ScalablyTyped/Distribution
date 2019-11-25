package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelExecutionInputBase extends ExecutionInput {
  var continueOnError: Boolean
  var maxNumberOfAgents: Double
}

object ParallelExecutionInputBase {
  @scala.inline
  def apply(continueOnError: Boolean, maxNumberOfAgents: Double, parallelExecutionType: ParallelExecutionTypes): ParallelExecutionInputBase = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxNumberOfAgents = maxNumberOfAgents.asInstanceOf[js.Any], parallelExecutionType = parallelExecutionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParallelExecutionInputBase]
  }
}

