package typings.tensorflowTfjsCore.anon

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Imag extends js.Object {
  var imag: Float32Array
  var real: Float32Array
}

object Imag {
  @scala.inline
  def apply(imag: Float32Array, real: Float32Array): Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imag]
  }
}

