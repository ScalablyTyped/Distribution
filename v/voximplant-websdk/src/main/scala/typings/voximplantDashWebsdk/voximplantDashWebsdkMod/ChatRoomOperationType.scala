package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatRoomOperationType extends js.Object

@JSImport("voximplant-websdk", "ChatRoomOperationType")
@js.native
object ChatRoomOperationType extends js.Object {
  /**
  		* Ban operation
  		*/
  @js.native
  sealed trait Ban extends ChatRoomOperationType
  
  /**
  		* Unban operation
  		*/
  @js.native
  sealed trait Unban extends ChatRoomOperationType
  
  /* 0 */ val Ban: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatRoomOperationType.Ban with Double = js.native
  /* 1 */ val Unban: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatRoomOperationType.Unban with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatRoomOperationType with Double] = js.native
}

