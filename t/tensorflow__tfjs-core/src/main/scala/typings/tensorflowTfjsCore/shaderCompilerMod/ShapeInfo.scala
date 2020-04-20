package typings.tensorflowTfjsCore.shaderCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeInfo extends js.Object {
  var flatOffset: Double
  var isPacked: Boolean
  var isUniform: Boolean
  var logicalShape: js.Array[Double]
  var texShape: js.Tuple2[Double, Double]
}

object ShapeInfo {
  @scala.inline
  def apply(
    flatOffset: Double,
    isPacked: Boolean,
    isUniform: Boolean,
    logicalShape: js.Array[Double],
    texShape: js.Tuple2[Double, Double]
  ): ShapeInfo = {
    val __obj = js.Dynamic.literal(flatOffset = flatOffset.asInstanceOf[js.Any], isPacked = isPacked.asInstanceOf[js.Any], isUniform = isUniform.asInstanceOf[js.Any], logicalShape = logicalShape.asInstanceOf[js.Any], texShape = texShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeInfo]
  }
}

