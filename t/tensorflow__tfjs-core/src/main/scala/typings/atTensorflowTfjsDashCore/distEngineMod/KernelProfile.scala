package typings.atTensorflowTfjsDashCore.distEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelProfile extends js.Object {
  var bytesAdded: Double
  var inputShapes: js.Array[js.Array[Double]]
  var name: String
  var outputShapes: js.Array[js.Array[Double]]
  var tensorsAdded: Double
  var totalBytesSnapshot: Double
  var totalTensorsSnapshot: Double
}

object KernelProfile {
  @scala.inline
  def apply(
    bytesAdded: Double,
    inputShapes: js.Array[js.Array[Double]],
    name: String,
    outputShapes: js.Array[js.Array[Double]],
    tensorsAdded: Double,
    totalBytesSnapshot: Double,
    totalTensorsSnapshot: Double
  ): KernelProfile = {
    val __obj = js.Dynamic.literal(bytesAdded = bytesAdded, inputShapes = inputShapes, name = name, outputShapes = outputShapes, tensorsAdded = tensorsAdded, totalBytesSnapshot = totalBytesSnapshot, totalTensorsSnapshot = totalTensorsSnapshot)
  
    __obj.asInstanceOf[KernelProfile]
  }
}

