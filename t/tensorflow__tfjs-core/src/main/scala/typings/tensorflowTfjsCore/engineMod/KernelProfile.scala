package typings.tensorflowTfjsCore.engineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KernelProfile extends js.Object {
  var bytesAdded: Double = js.native
  var inputShapes: js.Array[js.Array[Double]] = js.native
  var name: String = js.native
  var outputShapes: js.Array[js.Array[Double]] = js.native
  var tensorsAdded: Double = js.native
  var totalBytesSnapshot: Double = js.native
  var totalTensorsSnapshot: Double = js.native
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
    val __obj = js.Dynamic.literal(bytesAdded = bytesAdded.asInstanceOf[js.Any], inputShapes = inputShapes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputShapes = outputShapes.asInstanceOf[js.Any], tensorsAdded = tensorsAdded.asInstanceOf[js.Any], totalBytesSnapshot = totalBytesSnapshot.asInstanceOf[js.Any], totalTensorsSnapshot = totalTensorsSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelProfile]
  }
  @scala.inline
  implicit class KernelProfileOps[Self <: KernelProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBytesAdded(value: Double): Self = this.set("bytesAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputShapesVarargs(value: js.Array[Double]*): Self = this.set("inputShapes", js.Array(value :_*))
    @scala.inline
    def setInputShapes(value: js.Array[js.Array[Double]]): Self = this.set("inputShapes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputShapesVarargs(value: js.Array[Double]*): Self = this.set("outputShapes", js.Array(value :_*))
    @scala.inline
    def setOutputShapes(value: js.Array[js.Array[Double]]): Self = this.set("outputShapes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTensorsAdded(value: Double): Self = this.set("tensorsAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytesSnapshot(value: Double): Self = this.set("totalBytesSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalTensorsSnapshot(value: Double): Self = this.set("totalTensorsSnapshot", value.asInstanceOf[js.Any])
  }
  
}

