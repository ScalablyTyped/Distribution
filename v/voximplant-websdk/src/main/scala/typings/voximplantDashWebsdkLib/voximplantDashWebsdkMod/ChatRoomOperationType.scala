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
  
  val Ban: Ban with java.lang.String = js.native
  val Unban: Unban with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatRoomOperationType with java.lang.String
  ] = js.native
}

