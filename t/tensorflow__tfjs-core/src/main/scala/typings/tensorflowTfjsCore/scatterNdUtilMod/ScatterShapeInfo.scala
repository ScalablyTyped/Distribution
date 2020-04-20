package typings.tensorflowTfjsCore.scatterNdUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterShapeInfo extends js.Object {
  var numUpdates: Double
  var outputSize: Double
  var sliceRank: Double
  var sliceSize: Double
  var strides: js.Array[Double]
}

object ScatterShapeInfo {
  @scala.inline
  def apply(
    numUpdates: Double,
    outputSize: Double,
    sliceRank: Double,
    sliceSize: Double,
    strides: js.Array[Double]
  ): ScatterShapeInfo = {
    val __obj = js.Dynamic.literal(numUpdates = numUpdates.asInstanceOf[js.Any], outputSize = outputSize.asInstanceOf[js.Any], sliceRank = sliceRank.asInstanceOf[js.Any], sliceSize = sliceSize.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterShapeInfo]
  }
}

