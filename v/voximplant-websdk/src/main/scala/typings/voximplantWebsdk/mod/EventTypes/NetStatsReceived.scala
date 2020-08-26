package typings.voximplantWebsdk.mod.EventTypes

import typings.voximplantWebsdk.mod.NetworkInfo
import typings.voximplantWebsdk.mod.VoxImplantEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when packet loss data received from VoxImplant servers
  */
@js.native
trait NetStatsReceived extends VoxImplantEvent {
  /**
    *    Network info object
    */
  var stats: NetworkInfo = js.native
}

object NetStatsReceived {
  @scala.inline
  def apply(stats: NetworkInfo): NetStatsReceived = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetStatsReceived]
  }
  @scala.inline
  implicit class NetStatsReceivedOps[Self <: NetStatsReceived] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStats(value: NetworkInfo): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
  
}

