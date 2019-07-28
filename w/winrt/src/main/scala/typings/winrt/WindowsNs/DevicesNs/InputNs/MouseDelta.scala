package typings.winrt.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseDelta extends js.Object {
  var x: Double
  var y: Double
}

object MouseDelta {
  @scala.inline
  def apply(x: Double, y: Double): MouseDelta = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[MouseDelta]
  }
}

