package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatStateType extends js.Object

@JSImport("voximplant-websdk/VoxImplant", "ChatStateType")
@js.native
object ChatStateType extends js.Object {
  /**
  		*	User is actively participating in the chat session
  		*/
  @js.native
  sealed trait Active
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatStateType
  
  /**
  		*	User is composing a message
  		*/
  @js.native
  sealed trait Composing
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatStateType
  
  /**
  		*	User has effectively ended their participation in the chat session
  		*/
  @js.native
  sealed trait Gone
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatStateType
  
  /**
  		*	User has not been actively participating in the chat session
  		*/
  @js.native
  sealed trait Inactive
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatStateType
  
  /**
  		*	Invalid type
  		*/
  @js.native
  sealed trait Invalid
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatStateType
  
  /**
  		*	User had been composing but now has stopped
  		*/
  @js.native
  sealed trait Paused
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatStateType
  
}

