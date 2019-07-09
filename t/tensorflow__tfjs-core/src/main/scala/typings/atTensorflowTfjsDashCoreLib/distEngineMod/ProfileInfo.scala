package typings
package atTensorflowTfjsDashCoreLib.distEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileInfo extends js.Object {
  var kernels: js.Array[KernelProfile]
  var newBytes: scala.Double
  var newTensors: scala.Double
  var peakBytes: scala.Double
  var result: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer
}

object ProfileInfo {
  @scala.inline
  def apply(
    kernels: js.Array[KernelProfile],
    newBytes: scala.Double,
    newTensors: scala.Double,
    peakBytes: scala.Double,
    result: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer
  ): ProfileInfo = {
    val __obj = js.Dynamic.literal(kernels = kernels, newBytes = newBytes, newTensors = newTensors, peakBytes = peakBytes, result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProfileInfo]
  }
}

