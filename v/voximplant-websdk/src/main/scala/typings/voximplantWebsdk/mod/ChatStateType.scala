package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatStateType extends StObject
@JSImport("voximplant-websdk", "ChatStateType")
@js.native
object ChatStateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatStateType & Double] = js.native
  
  /**
    *    User is actively participating in the chat session
    */
  @js.native
  sealed trait Active
    extends StObject
       with ChatStateType
  /* 0 */ val Active: typings.voximplantWebsdk.mod.ChatStateType.Active & Double = js.native
  
  /**
    *    User is composing a message
    */
  @js.native
  sealed trait Composing
    extends StObject
       with ChatStateType
  /* 1 */ val Composing: typings.voximplantWebsdk.mod.ChatStateType.Composing & Double = js.native
  
  /**
    *    User has effectively ended their participation in the chat session
    */
  @js.native
  sealed trait Gone
    extends StObject
       with ChatStateType
  /* 2 */ val Gone: typings.voximplantWebsdk.mod.ChatStateType.Gone & Double = js.native
  
  /**
    *    User has not been actively participating in the chat session
    */
  @js.native
  sealed trait Inactive
    extends StObject
       with ChatStateType
  /* 3 */ val Inactive: typings.voximplantWebsdk.mod.ChatStateType.Inactive & Double = js.native
  
  /**
    *    Invalid type
    */
  @js.native
  sealed trait Invalid
    extends StObject
       with ChatStateType
  /* 4 */ val Invalid: typings.voximplantWebsdk.mod.ChatStateType.Invalid & Double = js.native
  
  /**
    *    User had been composing but now has stopped
    */
  @js.native
  sealed trait Paused
    extends StObject
       with ChatStateType
  /* 5 */ val Paused: typings.voximplantWebsdk.mod.ChatStateType.Paused & Double = js.native
}
