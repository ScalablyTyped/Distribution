package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RosterItemEvent extends js.Object

@JSImport("voximplant-websdk", "RosterItemEvent")
@js.native
object RosterItemEvent extends js.Object {
  /**
    *    Roster item added
    */
  @js.native
  sealed trait Added extends RosterItemEvent
  
  /**
    *    Roster item removed
    */
  @js.native
  sealed trait Removed extends RosterItemEvent
  
  /**
    *    User subscribed on your status updates (authorized the request)
    */
  @js.native
  sealed trait Subscribed extends RosterItemEvent
  
  /**
    *    User unsubscribed from your status updates (didn't authorize the request)
    */
  @js.native
  sealed trait Unsubscribed extends RosterItemEvent
  
  /**
    *    Roster item updated
    */
  @js.native
  sealed trait Updated extends RosterItemEvent
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RosterItemEvent with Double] = js.native
  /* 0 */ @js.native
  object Added extends TopLevel[Added with Double]
  
  /* 1 */ @js.native
  object Removed extends TopLevel[Removed with Double]
  
  /* 2 */ @js.native
  object Subscribed extends TopLevel[Subscribed with Double]
  
  /* 3 */ @js.native
  object Unsubscribed extends TopLevel[Unsubscribed with Double]
  
  /* 4 */ @js.native
  object Updated extends TopLevel[Updated with Double]
  
}

