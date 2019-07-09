package typings
package atTensorflowTfjsDashConverterLib.distSrcExecutorExecutionUnderscoreContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionContextInfo extends js.Object {
  var frameName: java.lang.String
  var id: scala.Double
  var iterationId: scala.Double
}

object ExecutionContextInfo {
  @scala.inline
  def apply(frameName: java.lang.String, id: scala.Double, iterationId: scala.Double): ExecutionContextInfo = {
    val __obj = js.Dynamic.literal(frameName = frameName, id = id, iterationId = iterationId)
  
    __obj.asInstanceOf[ExecutionContextInfo]
  }
}

