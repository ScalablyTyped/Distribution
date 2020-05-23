package typings.tensorflowTfjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeptDims extends js.Object {
  var keptDims: js.Array[Double]
  var newShape: js.Array[Double]
}

object KeptDims {
  @scala.inline
  def apply(keptDims: js.Array[Double], newShape: js.Array[Double]): KeptDims = {
    val __obj = js.Dynamic.literal(keptDims = keptDims.asInstanceOf[js.Any], newShape = newShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeptDims]
  }
}

