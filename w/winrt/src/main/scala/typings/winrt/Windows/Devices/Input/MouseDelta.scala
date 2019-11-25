package typings.winrt.Windows.Devices.Input

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
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MouseDelta]
  }
}

