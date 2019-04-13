package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.EventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when packet loss data received from VoxImplant servers
		*/
trait NetStatsReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantEvent {
  /**
  			*	Network info object
  			*/
  var stats: voximplantDashWebsdkLib.voximplantDashWebsdkMod.NetworkInfo
}

object NetStatsReceived {
  @scala.inline
  def apply(stats: voximplantDashWebsdkLib.voximplantDashWebsdkMod.NetworkInfo): NetStatsReceived = {
    val __obj = js.Dynamic.literal(stats = stats)
  
    __obj.asInstanceOf[NetStatsReceived]
  }
}

