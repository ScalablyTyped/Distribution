package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OneHotAttrs extends js.Object {
  var depth: Double
  var offValue: Double
  var onValue: Double
}

object OneHotAttrs {
  @scala.inline
  def apply(depth: Double, offValue: Double, onValue: Double): OneHotAttrs = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], offValue = offValue.asInstanceOf[js.Any], onValue = onValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneHotAttrs]
  }
}

