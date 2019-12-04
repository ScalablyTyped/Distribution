package typings.atTensorflowTfjsDashCore

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Imag extends js.Object {
  var imag: Float32Array
  var real: Float32Array
}

object Anon_Imag {
  @scala.inline
  def apply(imag: Float32Array, real: Float32Array): Anon_Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Imag]
  }
}

