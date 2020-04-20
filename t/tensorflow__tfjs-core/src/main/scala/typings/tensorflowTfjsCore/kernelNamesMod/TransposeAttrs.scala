package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransposeAttrs extends js.Object {
  var perm: js.Array[Double]
}

object TransposeAttrs {
  @scala.inline
  def apply(perm: js.Array[Double]): TransposeAttrs = {
    val __obj = js.Dynamic.literal(perm = perm.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransposeAttrs]
  }
}

