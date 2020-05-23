package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rx extends js.Object {
  var rx: Double
  var wx: Double
}

object Rx {
  @scala.inline
  def apply(rx: Double, wx: Double): Rx = {
    val __obj = js.Dynamic.literal(rx = rx.asInstanceOf[js.Any], wx = wx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rx]
  }
}

