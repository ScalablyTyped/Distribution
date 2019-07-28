package typings.atTensorflowTfjsDashCore.distBackendsWebglShaderUnderscoreCompilerMod

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
    val __obj = js.Dynamic.literal(flatOffset = flatOffset, isPacked = isPacked, isUniform = isUniform, logicalShape = logicalShape, texShape = texShape)
  
    __obj.asInstanceOf[ShapeInfo]
  }
}

