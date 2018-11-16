package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatRoomOperationType extends js.Object

@JSImport("voximplant-websdk/VoxImplant", "ChatRoomOperationType")
@js.native
object ChatRoomOperationType extends js.Object {
  /**
  		* Ban operation
  		*/
  @js.native
  sealed trait Ban
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatRoomOperationType
  
  /**
  		* Unban operation
  		*/
  @js.native
  sealed trait Unban
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatRoomOperationType
  
}

