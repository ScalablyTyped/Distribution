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
    val __obj = js.Dynamic.literal(kernels = kernels, newBytes = newBytes, newTensors = newTensors, peakBytes = peakBytes, result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProfileInfo]
  }
}

