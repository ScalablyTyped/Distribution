package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatStateType extends js.Object
@JSImport("voximplant-websdk", "ChatStateType")
@js.native
object ChatStateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatStateType with Double] = js.native
  
  /**
    *    User is actively participating in the chat session
    */
  @js.native
  sealed trait Active extends ChatStateType
  /* 0 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /**
    *    User is composing a message
    */
  @js.native
  sealed trait Composing extends ChatStateType
  /* 1 */ @js.native
  object Composing extends TopLevel[Composing with Double]
  
  /**
    *    User has effectively ended their participation in the chat session
    */
  @js.native
  sealed trait Gone extends ChatStateType
  /* 2 */ @js.native
  object Gone extends TopLevel[Gone with Double]
  
  /**
    *    User has not been actively participating in the chat session
    */
  @js.native
  sealed trait Inactive extends ChatStateType
  /* 3 */ @js.native
  object Inactive extends TopLevel[Inactive with Double]
  
  /**
    *    Invalid type
    */
  @js.native
  sealed trait Invalid extends ChatStateType
  /* 4 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /**
    *    User had been composing but now has stopped
    */
  @js.native
  sealed trait Paused extends ChatStateType
  /* 5 */ @js.native
  object Paused extends TopLevel[Paused with Double]
}
