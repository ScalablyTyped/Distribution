package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RosterItemEvent extends js.Object

@JSImport("voximplant-websdk", "RosterItemEvent")
@js.native
object RosterItemEvent extends js.Object {
  /**
  		*	Roster item added
  		*/
  @js.native
  sealed trait Added
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.RosterItemEvent
  
  /**
  		*	Roster item removed
  		*/
  @js.native
  sealed trait Removed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.RosterItemEvent
  
  /**
  		*	User subscribed on your status updates (authorized the request)
  		*/
  @js.native
  sealed trait Subscribed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.RosterItemEvent
  
  /**
  		*	User unsubscribed from your status updates (didn't authorize the request)
  		*/
  @js.native
  sealed trait Unsubscribed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.RosterItemEvent
  
  /**
  		*	Roster item updated
  		*/
  @js.native
  sealed trait Updated
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.RosterItemEvent
  
  /* 0 */ val Added: Added with scala.Double = js.native
  /* 1 */ val Removed: Removed with scala.Double = js.native
  /* 2 */ val Subscribed: Subscribed with scala.Double = js.native
  /* 3 */ val Unsubscribed: Unsubscribed with scala.Double = js.native
  /* 4 */ val Updated: Updated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.RosterItemEvent with scala.Double
  ] = js.native
}

