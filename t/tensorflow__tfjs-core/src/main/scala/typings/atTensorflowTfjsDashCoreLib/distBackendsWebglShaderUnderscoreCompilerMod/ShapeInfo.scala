package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglShaderUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeInfo extends js.Object {
  var flatOffset: scala.Double
  var isPacked: scala.Boolean
  var isUniform: scala.Boolean
  var logicalShape: js.Array[scala.Double]
  var texShape: js.Tuple2[scala.Double, scala.Double]
}

object ShapeInfo {
  @scala.inline
  def apply(
    flatOffset: scala.Double,
    isPacked: scala.Boolean,
    isUniform: scala.Boolean,
    logicalShape: js.Array[scala.Double],
    texShape: js.Tuple2[scala.Double, scala.Double]
  ): ShapeInfo = {
    val __obj = js.Dynamic.literal(flatOffset = flatOffset, isPacked = isPacked, isUniform = isUniform, logicalShape = logicalShape, texShape = texShape)
  
    __obj.asInstanceOf[ShapeInfo]
  }
}

