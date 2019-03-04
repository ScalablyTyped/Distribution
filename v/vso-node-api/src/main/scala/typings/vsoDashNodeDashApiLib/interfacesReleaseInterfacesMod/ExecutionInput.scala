package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionInput extends js.Object {
  var parallelExecutionType: ParallelExecutionTypes
}

object ExecutionInput {
  @scala.inline
  def apply(parallelExecutionType: ParallelExecutionTypes): ExecutionInput = {
    val __obj = js.Dynamic.literal(parallelExecutionType = parallelExecutionType)
  
    __obj.asInstanceOf[ExecutionInput]
  }
}

