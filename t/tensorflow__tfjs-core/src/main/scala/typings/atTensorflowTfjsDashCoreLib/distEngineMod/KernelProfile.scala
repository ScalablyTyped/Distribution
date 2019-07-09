package typings
package atTensorflowTfjsDashCoreLib.distEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelProfile extends js.Object {
  var bytesAdded: scala.Double
  var inputShapes: js.Array[js.Array[scala.Double]]
  var name: java.lang.String
  var outputShape: js.Array[js.Array[scala.Double] | scala.Double]
  var tensorsAdded: scala.Double
  var totalBytesSnapshot: scala.Double
  var totalTensorsSnapshot: scala.Double
}

object KernelProfile {
  @scala.inline
  def apply(
    bytesAdded: scala.Double,
    inputShapes: js.Array[js.Array[scala.Double]],
    name: java.lang.String,
    outputShape: js.Array[js.Array[scala.Double] | scala.Double],
    tensorsAdded: scala.Double,
    totalBytesSnapshot: scala.Double,
    totalTensorsSnapshot: scala.Double
  ): KernelProfile = {
    val __obj = js.Dynamic.literal(bytesAdded = bytesAdded, inputShapes = inputShapes, name = name, outputShape = outputShape, tensorsAdded = tensorsAdded, totalBytesSnapshot = totalBytesSnapshot, totalTensorsSnapshot = totalTensorsSnapshot)
  
    __obj.asInstanceOf[KernelProfile]
  }
}

