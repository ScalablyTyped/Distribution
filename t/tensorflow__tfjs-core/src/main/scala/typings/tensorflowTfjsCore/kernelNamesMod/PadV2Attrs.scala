package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PadV2Attrs extends js.Object {
  var constantValue: Double
  var paddings: js.Array[js.Tuple2[Double, Double]]
}

object PadV2Attrs {
  @scala.inline
  def apply(constantValue: Double, paddings: js.Array[js.Tuple2[Double, Double]]): PadV2Attrs = {
    val __obj = js.Dynamic.literal(constantValue = constantValue.asInstanceOf[js.Any], paddings = paddings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PadV2Attrs]
  }
}

