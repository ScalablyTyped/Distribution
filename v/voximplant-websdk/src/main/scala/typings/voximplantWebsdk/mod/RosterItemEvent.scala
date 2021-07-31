package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RosterItemEvent extends StObject
@JSImport("voximplant-websdk", "RosterItemEvent")
@js.native
object RosterItemEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RosterItemEvent & Double] = js.native
  
  /**
    *    Roster item added
    */
  @js.native
  sealed trait Added
    extends StObject
       with RosterItemEvent
  /* 0 */ val Added: typings.voximplantWebsdk.mod.RosterItemEvent.Added & Double = js.native
  
  /**
    *    Roster item removed
    */
  @js.native
  sealed trait Removed
    extends StObject
       with RosterItemEvent
  /* 1 */ val Removed: typings.voximplantWebsdk.mod.RosterItemEvent.Removed & Double = js.native
  
  /**
    *    User subscribed on your status updates (authorized the request)
    */
  @js.native
  sealed trait Subscribed
    extends StObject
       with RosterItemEvent
  /* 2 */ val Subscribed: typings.voximplantWebsdk.mod.RosterItemEvent.Subscribed & Double = js.native
  
  /**
    *    User unsubscribed from your status updates (didn't authorize the request)
    */
  @js.native
  sealed trait Unsubscribed
    extends StObject
       with RosterItemEvent
  /* 3 */ val Unsubscribed: typings.voximplantWebsdk.mod.RosterItemEvent.Unsubscribed & Double = js.native
  
  /**
    *    Roster item updated
    */
  @js.native
  sealed trait Updated
    extends StObject
       with RosterItemEvent
  /* 4 */ val Updated: typings.voximplantWebsdk.mod.RosterItemEvent.Updated & Double = js.native
}
