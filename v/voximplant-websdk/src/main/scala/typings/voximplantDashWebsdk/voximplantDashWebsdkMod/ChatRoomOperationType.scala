package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import org.scalablytyped.runtime.TopLevel
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatRoomOperationType.Ban
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatRoomOperationType.Unban
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatRoomOperationType with Double] = js.native
  /* 0 */ @js.native
  object Ban extends TopLevel[Ban with Double]
  
  /* 1 */ @js.native
  object Unban extends TopLevel[Unban with Double]
  
}

