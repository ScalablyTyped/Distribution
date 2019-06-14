package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserStatuses extends js.Object

@JSImport("voximplant-websdk", "UserStatuses")
@js.native
object UserStatuses extends js.Object {
  /**
  		*	User is away
  		*/
  @js.native
  sealed trait Away
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses
  
  /**
  		*	User is available for chat
  		*/
  @js.native
  sealed trait Chat
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses
  
  /**
  		*	User is in DND state (Do Not Disturbed)
  		*/
  @js.native
  sealed trait DND
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses
  
  /**
  		*	User is offline
  		*/
  @js.native
  sealed trait Offline
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses
  
  /**
  		*	User is online
  		*/
  @js.native
  sealed trait Online
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses
  
  /**
  		*	User is in XA state (eXtended Away)
  		*/
  @js.native
  sealed trait XA
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses
  
  /* 0 */ val Away: Away with scala.Double = js.native
  /* 1 */ val Chat: Chat with scala.Double = js.native
  /* 2 */ val DND: DND with scala.Double = js.native
  /* 3 */ val Offline: Offline with scala.Double = js.native
  /* 4 */ val Online: Online with scala.Double = js.native
  /* 5 */ val XA: XA with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses with scala.Double] = js.native
}

