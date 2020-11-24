package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RosterItemEvent extends js.Object
@JSImport("voximplant-websdk", "RosterItemEvent")
@js.native
object RosterItemEvent extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RosterItemEvent with Double] = js.native
  
  /**
    *    Roster item added
    */
  @js.native
  sealed trait Added extends RosterItemEvent
  /* 0 */ @js.native
  object Added extends TopLevel[Added with Double]
  
  /**
    *    Roster item removed
    */
  @js.native
  sealed trait Removed extends RosterItemEvent
  /* 1 */ @js.native
  object Removed extends TopLevel[Removed with Double]
  
  /**
    *    User subscribed on your status updates (authorized the request)
    */
  @js.native
  sealed trait Subscribed extends RosterItemEvent
  /* 2 */ @js.native
  object Subscribed extends TopLevel[Subscribed with Double]
  
  /**
    *    User unsubscribed from your status updates (didn't authorize the request)
    */
  @js.native
  sealed trait Unsubscribed extends RosterItemEvent
  /* 3 */ @js.native
  object Unsubscribed extends TopLevel[Unsubscribed with Double]
  
  /**
    *    Roster item updated
    */
  @js.native
  sealed trait Updated extends RosterItemEvent
  /* 4 */ @js.native
  object Updated extends TopLevel[Updated with Double]
}
