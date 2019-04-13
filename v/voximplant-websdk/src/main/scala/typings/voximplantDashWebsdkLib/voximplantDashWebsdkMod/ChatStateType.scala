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
  
  val Active: Active with java.lang.String = js.native
  val Composing: Composing with java.lang.String = js.native
  val Gone: Gone with java.lang.String = js.native
  val Inactive: Inactive with java.lang.String = js.native
  val Invalid: Invalid with java.lang.String = js.native
  val Paused: Paused with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatStateType with java.lang.String
  ] = js.native
}

