package typings.tensorflowTfjsCore.engineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  var numBytes: Double
  var numDataBuffers: Double
  var numTensors: Double
  var reasons: js.Array[String]
  var unreliable: js.UndefOr[Boolean] = js.undefined
}

object MemoryInfo {
  @scala.inline
  def apply(
    numBytes: Double,
    numDataBuffers: Double,
    numTensors: Double,
    reasons: js.Array[String],
    unreliable: js.UndefOr[Boolean] = js.undefined
  ): MemoryInfo = {
    val __obj = js.Dynamic.literal(numBytes = numBytes.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any])
    if (!js.isUndefined(unreliable)) __obj.updateDynamic("unreliable")(unreliable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
}

