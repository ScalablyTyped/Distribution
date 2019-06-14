package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatStateType extends js.Object

@JSImport("voximplant-websdk", "ChatStateType")
@js.native
object ChatStateType extends js.Object {
  /**
  		*	User is actively participating in the chat session
  		*/
  @js.native
  sealed trait Active
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatStateType
  
  /**
  		*	User is composing a message
  		*/
  @js.native
  sealed trait Composing
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatStateType
  
  /**
  		*	User has effectively ended their participation in the chat session
  		*/
  @js.native
  sealed trait Gone
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatStateType
  
  /**
  		*	User has not been actively participating in the chat session
  		*/
  @js.native
  sealed trait Inactive
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatStateType
  
  /**
  		*	Invalid type
  		*/
  @js.native
  sealed trait Invalid
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatStateType
  
  /**
  		*	User had been composing but now has stopped
  		*/
  @js.native
  sealed trait Paused
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatStateType
  
  /* 0 */ val Active: Active with scala.Double = js.native
  /* 1 */ val Composing: Composing with scala.Double = js.native
  /* 2 */ val Gone: Gone with scala.Double = js.native
  /* 3 */ val Inactive: Inactive with scala.Double = js.native
  /* 4 */ val Invalid: Invalid with scala.Double = js.native
  /* 5 */ val Paused: Paused with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatStateType with scala.Double] = js.native
}

