package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

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
  sealed trait Active extends ChatStateType
  
  /**
  		*	User is composing a message
  		*/
  @js.native
  sealed trait Composing extends ChatStateType
  
  /**
  		*	User has effectively ended their participation in the chat session
  		*/
  @js.native
  sealed trait Gone extends ChatStateType
  
  /**
  		*	User has not been actively participating in the chat session
  		*/
  @js.native
  sealed trait Inactive extends ChatStateType
  
  /**
  		*	Invalid type
  		*/
  @js.native
  sealed trait Invalid extends ChatStateType
  
  /**
  		*	User had been composing but now has stopped
  		*/
  @js.native
  sealed trait Paused extends ChatStateType
  
  /* 0 */ val Active: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatStateType.Active with Double = js.native
  /* 1 */ val Composing: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatStateType.Composing with Double = js.native
  /* 2 */ val Gone: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatStateType.Gone with Double = js.native
  /* 3 */ val Inactive: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatStateType.Inactive with Double = js.native
  /* 4 */ val Invalid: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatStateType.Invalid with Double = js.native
  /* 5 */ val Paused: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatStateType.Paused with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatStateType with Double] = js.native
}

