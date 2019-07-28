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
    val __obj = js.Dynamic.literal(continueOnError = continueOnError, maxNumberOfAgents = maxNumberOfAgents, multipliers = multipliers, parallelExecutionType = parallelExecutionType)
  
    __obj.asInstanceOf[MultiConfigInput]
  }
}

