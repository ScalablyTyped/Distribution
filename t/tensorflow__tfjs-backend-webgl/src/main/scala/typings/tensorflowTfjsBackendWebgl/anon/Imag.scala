package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Imag extends js.Object {
  var imag: Tensor[Rank] = js.native
  var real: Tensor[Rank] = js.native
}

object Imag {
  @scala.inline
  def apply(imag: Tensor[Rank], real: Tensor[Rank]): Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imag]
  }
  @scala.inline
  implicit class ImagOps[Self <: Imag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImag(value: Tensor[Rank]): Self = this.set("imag", value.asInstanceOf[js.Any])
    @scala.inline
    def setReal(value: Tensor[Rank]): Self = this.set("real", value.asInstanceOf[js.Any])
  }
  
}

