package typings.tensorflowTfjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Real extends js.Object {
  var imag: Double
  var real: Double
}

object Real {
  @scala.inline
  def apply(imag: Double, real: Double): Real = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Real]
  }
}

