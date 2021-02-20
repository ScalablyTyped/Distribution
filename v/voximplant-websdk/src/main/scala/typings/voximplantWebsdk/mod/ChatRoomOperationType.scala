package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatRoomOperationType extends StObject
@JSImport("voximplant-websdk", "ChatRoomOperationType")
@js.native
object ChatRoomOperationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatRoomOperationType with Double] = js.native
  
  /**
    * Ban operation
    */
  @js.native
  sealed trait Ban extends ChatRoomOperationType
  /* 0 */ val Ban: typings.voximplantWebsdk.mod.ChatRoomOperationType.Ban with Double = js.native
  
  /**
    * Unban operation
    */
  @js.native
  sealed trait Unban extends ChatRoomOperationType
  /* 1 */ val Unban: typings.voximplantWebsdk.mod.ChatRoomOperationType.Unban with Double = js.native
}
