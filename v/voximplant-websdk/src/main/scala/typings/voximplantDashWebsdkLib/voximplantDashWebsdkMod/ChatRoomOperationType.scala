package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

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
  sealed trait Ban
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatRoomOperationType
  
  /**
  		* Unban operation
  		*/
  @js.native
  sealed trait Unban
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatRoomOperationType
  
  /* 0 */ val Ban: Ban with scala.Double = js.native
  /* 1 */ val Unban: Unban with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatRoomOperationType with scala.Double
  ] = js.native
}

