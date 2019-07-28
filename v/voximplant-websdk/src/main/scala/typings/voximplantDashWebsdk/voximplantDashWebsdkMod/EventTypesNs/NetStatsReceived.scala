package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.EventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.NetworkInfo
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when packet loss data received from VoxImplant servers
		*/
trait NetStatsReceived extends VoxImplantEvent {
  /**
  			*	Network info object
  			*/
  var stats: NetworkInfo
}

object NetStatsReceived {
  @scala.inline
  def apply(stats: NetworkInfo): NetStatsReceived = {
    val __obj = js.Dynamic.literal(stats = stats)
  
    __obj.asInstanceOf[NetStatsReceived]
  }
}

