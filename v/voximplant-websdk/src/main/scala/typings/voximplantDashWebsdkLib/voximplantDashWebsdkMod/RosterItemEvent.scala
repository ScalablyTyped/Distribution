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
  
  val Added: Added with java.lang.String = js.native
  val Removed: Removed with java.lang.String = js.native
  val Subscribed: Subscribed with java.lang.String = js.native
  val Unsubscribed: Unsubscribed with java.lang.String = js.native
  val Updated: Updated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.RosterItemEvent with java.lang.String
  ] = js.native
}

