package typings.systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRx extends js.Object {
  var rx: Double
  var wx: Double
}

object AnonRx {
  @scala.inline
  def apply(rx: Double, wx: Double): AnonRx = {
    val __obj = js.Dynamic.literal(rx = rx.asInstanceOf[js.Any], wx = wx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRx]
  }
}

