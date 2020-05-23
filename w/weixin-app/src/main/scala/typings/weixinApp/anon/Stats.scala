package typings.weixinApp.anon

import typings.weixinApp.wx.Stat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var stats: Stat
}

object Stats {
  @scala.inline
  def apply(stats: Stat): Stats = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

