package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImagReal extends js.Object {
  var imag: Tensor[Rank]
  var real: Tensor[Rank]
}

object AnonImagReal {
  @scala.inline
  def apply(imag: Tensor[Rank], real: Tensor[Rank]): AnonImagReal = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonImagReal]
  }
}

