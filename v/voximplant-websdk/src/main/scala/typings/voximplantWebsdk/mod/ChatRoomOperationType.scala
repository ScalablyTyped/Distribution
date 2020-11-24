package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatRoomOperationType extends js.Object
@JSImport("voximplant-websdk", "ChatRoomOperationType")
@js.native
object ChatRoomOperationType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatRoomOperationType with Double] = js.native
  
  /**
    * Ban operation
    */
  @js.native
  sealed trait Ban extends ChatRoomOperationType
  /* 0 */ @js.native
  object Ban extends TopLevel[Ban with Double]
  
  /**
    * Unban operation
    */
  @js.native
  sealed trait Unban extends ChatRoomOperationType
  /* 1 */ @js.native
  object Unban extends TopLevel[Unban with Double]
}
