package typings.tensorflowTfjsCore

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImag extends js.Object {
  var imag: Float32Array
  var real: Float32Array
}

object AnonImag {
  @scala.inline
  def apply(imag: Float32Array, real: Float32Array): AnonImag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImag]
  }
}

