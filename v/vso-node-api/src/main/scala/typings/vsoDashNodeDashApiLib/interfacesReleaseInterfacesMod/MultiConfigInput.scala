package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiConfigInput extends ParallelExecutionInputBase {
  var multipliers: java.lang.String
}

object MultiConfigInput {
  @scala.inline
  def apply(
    continueOnError: scala.Boolean,
    maxNumberOfAgents: scala.Double,
    multipliers: java.lang.String,
    parallelExecutionType: ParallelExecutionTypes
  ): MultiConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("continueOnError")(continueOnError)
    __obj.updateDynamic("maxNumberOfAgents")(maxNumberOfAgents)
    __obj.updateDynamic("multipliers")(multipliers)
    __obj.updateDynamic("parallelExecutionType")(parallelExecutionType)
    __obj.asInstanceOf[MultiConfigInput]
  }
}

