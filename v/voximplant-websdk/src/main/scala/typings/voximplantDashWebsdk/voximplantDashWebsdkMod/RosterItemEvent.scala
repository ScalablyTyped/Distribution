package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

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
  sealed trait Added extends RosterItemEvent
  
  /**
  		*	Roster item removed
  		*/
  @js.native
  sealed trait Removed extends RosterItemEvent
  
  /**
  		*	User subscribed on your status updates (authorized the request)
  		*/
  @js.native
  sealed trait Subscribed extends RosterItemEvent
  
  /**
  		*	User unsubscribed from your status updates (didn't authorize the request)
  		*/
  @js.native
  sealed trait Unsubscribed extends RosterItemEvent
  
  /**
  		*	Roster item updated
  		*/
  @js.native
  sealed trait Updated extends RosterItemEvent
  
  /* 0 */ val Added: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.RosterItemEvent.Added with Double = js.native
  /* 1 */ val Removed: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.RosterItemEvent.Removed with Double = js.native
  /* 2 */ val Subscribed: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.RosterItemEvent.Subscribed with Double = js.native
  /* 3 */ val Unsubscribed: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.RosterItemEvent.Unsubscribed with Double = js.native
  /* 4 */ val Updated: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.RosterItemEvent.Updated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RosterItemEvent with Double] = js.native
}

