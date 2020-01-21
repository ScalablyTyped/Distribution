package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeptDims extends js.Object {
  var keptDims: js.Array[Double]
  var newShape: js.Array[Double]
}

object AnonKeptDims {
  @scala.inline
  def apply(keptDims: js.Array[Double], newShape: js.Array[Double]): AnonKeptDims = {
    val __obj = js.Dynamic.literal(keptDims = keptDims.asInstanceOf[js.Any], newShape = newShape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeptDims]
  }
}

