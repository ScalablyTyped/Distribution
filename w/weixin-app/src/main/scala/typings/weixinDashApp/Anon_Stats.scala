package typings.weixinDashApp

import typings.weixinDashApp.wx.Stat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stats extends js.Object {
  var stats: Stat
}

object Anon_Stats {
  @scala.inline
  def apply(stats: Stat): Anon_Stats = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Stats]
  }
}

