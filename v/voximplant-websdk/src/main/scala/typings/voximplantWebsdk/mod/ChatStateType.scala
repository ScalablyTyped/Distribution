package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatStateType extends StObject
@JSImport("voximplant-websdk", "ChatStateType")
@js.native
object ChatStateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatStateType with Double] = js.native
  
  /**
    *    User is actively participating in the chat session
    */
  @js.native
  sealed trait Active extends ChatStateType
  /* 0 */ val Active: typings.voximplantWebsdk.mod.ChatStateType.Active with Double = js.native
  
  /**
    *    User is composing a message
    */
  @js.native
  sealed trait Composing extends ChatStateType
  /* 1 */ val Composing: typings.voximplantWebsdk.mod.ChatStateType.Composing with Double = js.native
  
  /**
    *    User has effectively ended their participation in the chat session
    */
  @js.native
  sealed trait Gone extends ChatStateType
  /* 2 */ val Gone: typings.voximplantWebsdk.mod.ChatStateType.Gone with Double = js.native
  
  /**
    *    User has not been actively participating in the chat session
    */
  @js.native
  sealed trait Inactive extends ChatStateType
  /* 3 */ val Inactive: typings.voximplantWebsdk.mod.ChatStateType.Inactive with Double = js.native
  
  /**
    *    Invalid type
    */
  @js.native
  sealed trait Invalid extends ChatStateType
  /* 4 */ val Invalid: typings.voximplantWebsdk.mod.ChatStateType.Invalid with Double = js.native
  
  /**
    *    User had been composing but now has stopped
    */
  @js.native
  sealed trait Paused extends ChatStateType
  /* 5 */ val Paused: typings.voximplantWebsdk.mod.ChatStateType.Paused with Double = js.native
}
