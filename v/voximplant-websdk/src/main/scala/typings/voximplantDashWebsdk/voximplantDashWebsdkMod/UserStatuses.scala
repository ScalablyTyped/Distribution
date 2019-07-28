package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

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
  sealed trait Away extends UserStatuses
  
  /**
  		*	User is available for chat
  		*/
  @js.native
  sealed trait Chat extends UserStatuses
  
  /**
  		*	User is in DND state (Do Not Disturbed)
  		*/
  @js.native
  sealed trait DND extends UserStatuses
  
  /**
  		*	User is offline
  		*/
  @js.native
  sealed trait Offline extends UserStatuses
  
  /**
  		*	User is online
  		*/
  @js.native
  sealed trait Online extends UserStatuses
  
  /**
  		*	User is in XA state (eXtended Away)
  		*/
  @js.native
  sealed trait XA extends UserStatuses
  
  /* 0 */ val Away: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.UserStatuses.Away with Double = js.native
  /* 1 */ val Chat: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.UserStatuses.Chat with Double = js.native
  /* 2 */ val DND: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.UserStatuses.DND with Double = js.native
  /* 3 */ val Offline: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.UserStatuses.Offline with Double = js.native
  /* 4 */ val Online: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.UserStatuses.Online with Double = js.native
  /* 5 */ val XA: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.UserStatuses.XA with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserStatuses with Double] = js.native
}

