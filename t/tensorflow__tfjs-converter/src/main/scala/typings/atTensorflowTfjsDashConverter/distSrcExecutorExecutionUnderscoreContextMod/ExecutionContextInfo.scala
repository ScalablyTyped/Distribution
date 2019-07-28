package typings.atTensorflowTfjsDashConverter.distSrcExecutorExecutionUnderscoreContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionContextInfo extends js.Object {
  var frameName: String
  var id: Double
  var iterationId: Double
}

object ExecutionContextInfo {
  @scala.inline
  def apply(frameName: String, id: Double, iterationId: Double): ExecutionContextInfo = {
    val __obj = js.Dynamic.literal(frameName = frameName, id = id, iterationId = iterationId)
  
    __obj.asInstanceOf[ExecutionContextInfo]
  }
}

