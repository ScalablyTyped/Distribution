package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReal extends js.Object {
  var imag: Double
  var real: Double
}

object AnonReal {
  @scala.inline
  def apply(imag: Double, real: Double): AnonReal = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReal]
  }
}

