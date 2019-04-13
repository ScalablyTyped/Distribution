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
  
  val Away: Away with java.lang.String = js.native
  val Chat: Chat with java.lang.String = js.native
  val DND: DND with java.lang.String = js.native
  val Offline: Offline with java.lang.String = js.native
  val Online: Online with java.lang.String = js.native
  val XA: XA with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses with java.lang.String
  ] = js.native
}

