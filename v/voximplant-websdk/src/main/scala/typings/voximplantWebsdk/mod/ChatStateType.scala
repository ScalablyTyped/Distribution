package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatStateType extends js.Object

@JSImport("voximplant-websdk", "ChatStateType")
@js.native
object ChatStateType extends js.Object {
  /**
    *    User is actively participating in the chat session
    */
  @js.native
  sealed trait Active extends ChatStateType
  
  /**
    *    User is composing a message
    */
  @js.native
  sealed trait Composing extends ChatStateType
  
  /**
    *    User has effectively ended their participation in the chat session
    */
  @js.native
  sealed trait Gone extends ChatStateType
  
  /**
    *    User has not been actively participating in the chat session
    */
  @js.native
  sealed trait Inactive extends ChatStateType
  
  /**
    *    Invalid type
    */
  @js.native
  sealed trait Invalid extends ChatStateType
  
  /**
    *    User had been composing but now has stopped
    */
  @js.native
  sealed trait Paused extends ChatStateType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatStateType with Double] = js.native
  /* 0 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* 1 */ @js.native
  object Composing extends TopLevel[Composing with Double]
  
  /* 2 */ @js.native
  object Gone extends TopLevel[Gone with Double]
  
  /* 3 */ @js.native
  object Inactive extends TopLevel[Inactive with Double]
  
  /* 4 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 5 */ @js.native
  object Paused extends TopLevel[Paused with Double]
  
}

