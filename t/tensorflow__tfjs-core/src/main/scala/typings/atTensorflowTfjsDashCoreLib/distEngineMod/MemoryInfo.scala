package typings
package atTensorflowTfjsDashCoreLib.distEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  var numBytes: scala.Double
  var numDataBuffers: scala.Double
  var numTensors: scala.Double
  var reasons: js.Array[java.lang.String]
  var unreliable: js.UndefOr[scala.Boolean] = js.undefined
}

object MemoryInfo {
  @scala.inline
  def apply(
    numBytes: scala.Double,
    numDataBuffers: scala.Double,
    numTensors: scala.Double,
    reasons: js.Array[java.lang.String],
    unreliable: js.UndefOr[scala.Boolean] = js.undefined
  ): MemoryInfo = {
    val __obj = js.Dynamic.literal(numBytes = numBytes, numDataBuffers = numDataBuffers, numTensors = numTensors, reasons = reasons)
    if (!js.isUndefined(unreliable)) __obj.updateDynamic("unreliable")(unreliable)
    __obj.asInstanceOf[MemoryInfo]
  }
}

