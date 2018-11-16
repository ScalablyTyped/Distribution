package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RosterItemEvent extends js.Object

@JSImport("voximplant-websdk/VoxImplant", "RosterItemEvent")
@js.native
object RosterItemEvent extends js.Object {
  /**
  		*	Roster item added
  		*/
  @js.native
  sealed trait Added
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.RosterItemEvent
  
  /**
  		*	Roster item removed
  		*/
  @js.native
  sealed trait Removed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.RosterItemEvent
  
  /**
  		*	User subscribed on your status updates (authorized the request)
  		*/
  @js.native
  sealed trait Subscribed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.RosterItemEvent
  
  /**
  		*	User unsubscribed from your status updates (didn't authorize the request)
  		*/
  @js.native
  sealed trait Unsubscribed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.RosterItemEvent
  
  /**
  		*	Roster item updated
  		*/
  @js.native
  sealed trait Updated
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.RosterItemEvent
  
}

