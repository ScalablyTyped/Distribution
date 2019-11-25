package typings.atTensorflowTfjsDashCore.distEngineMod

import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileInfo extends js.Object {
  var kernels: js.Array[KernelProfile]
  var newBytes: Double
  var newTensors: Double
  var peakBytes: Double
  var result: TensorContainer
}

object ProfileInfo {
  @scala.inline
  def apply(
    kernels: js.Array[KernelProfile],
    newBytes: Double,
    newTensors: Double,
    peakBytes: Double,
    result: TensorContainer
  ): ProfileInfo = {
    val __obj = js.Dynamic.literal(kernels = kernels.asInstanceOf[js.Any], newBytes = newBytes.asInstanceOf[js.Any], newTensors = newTensors.asInstanceOf[js.Any], peakBytes = peakBytes.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProfileInfo]
  }
}

