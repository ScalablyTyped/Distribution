package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiConfigInput extends ParallelExecutionInputBase {
  var multipliers: String
}

object MultiConfigInput {
  @scala.inline
  def apply(
    continueOnError: Boolean,
    maxNumberOfAgents: Double,
    multipliers: String,
    parallelExecutionType: ParallelExecutionTypes
  ): MultiConfigInput = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxNumberOfAgents = maxNumberOfAgents.asInstanceOf[js.Any], multipliers = multipliers.asInstanceOf[js.Any], parallelExecutionType = parallelExecutionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiConfigInput]
  }
}

