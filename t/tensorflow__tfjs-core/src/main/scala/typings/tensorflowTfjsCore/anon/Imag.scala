package typings.tensorflowTfjsCore.anon

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Imag extends js.Object {
  var imag: Float32Array = js.native
  var real: Float32Array = js.native
}

object Imag {
  @scala.inline
  def apply(imag: Float32Array, real: Float32Array): Imag = {
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
    def setImag(value: Float32Array): Self = this.set("imag", value.asInstanceOf[js.Any])
    @scala.inline
    def setReal(value: Float32Array): Self = this.set("real", value.asInstanceOf[js.Any])
  }
  
}

