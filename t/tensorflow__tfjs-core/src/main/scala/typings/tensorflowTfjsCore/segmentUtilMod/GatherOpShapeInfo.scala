package typings.tensorflowTfjsCore.segmentUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatherOpShapeInfo extends js.Object {
  var batchSize: Double
  var dimSize: Double
  var outputShape: js.Array[Double]
  var sliceSize: Double
}

object GatherOpShapeInfo {
  @scala.inline
  def apply(batchSize: Double, dimSize: Double, outputShape: js.Array[Double], sliceSize: Double): GatherOpShapeInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], dimSize = dimSize.asInstanceOf[js.Any], outputShape = outputShape.asInstanceOf[js.Any], sliceSize = sliceSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatherOpShapeInfo]
  }
}

