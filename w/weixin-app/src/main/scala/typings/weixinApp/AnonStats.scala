package typings.weixinApp

import typings.weixinApp.wx.Stat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStats extends js.Object {
  var stats: Stat
}

object AnonStats {
  @scala.inline
  def apply(stats: Stat): AnonStats = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStats]
  }
}

