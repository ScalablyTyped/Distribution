package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserStatuses extends StObject
@JSImport("voximplant-websdk", "UserStatuses")
@js.native
object UserStatuses extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserStatuses with Double] = js.native
  
  /**
    *    User is away
    */
  @js.native
  sealed trait Away extends UserStatuses
  /* 0 */ val Away: typings.voximplantWebsdk.mod.UserStatuses.Away with Double = js.native
  
  /**
    *    User is available for chat
    */
  @js.native
  sealed trait Chat extends UserStatuses
  /* 1 */ val Chat: typings.voximplantWebsdk.mod.UserStatuses.Chat with Double = js.native
  
  /**
    *    User is in DND state (Do Not Disturbed)
    */
  @js.native
  sealed trait DND extends UserStatuses
  /* 2 */ val DND: typings.voximplantWebsdk.mod.UserStatuses.DND with Double = js.native
  
  /**
    *    User is offline
    */
  @js.native
  sealed trait Offline extends UserStatuses
  /* 3 */ val Offline: typings.voximplantWebsdk.mod.UserStatuses.Offline with Double = js.native
  
  /**
    *    User is online
    */
  @js.native
  sealed trait Online extends UserStatuses
  /* 4 */ val Online: typings.voximplantWebsdk.mod.UserStatuses.Online with Double = js.native
  
  /**
    *    User is in XA state (eXtended Away)
    */
  @js.native
  sealed trait XA extends UserStatuses
  /* 5 */ val XA: typings.voximplantWebsdk.mod.UserStatuses.XA with Double = js.native
}
