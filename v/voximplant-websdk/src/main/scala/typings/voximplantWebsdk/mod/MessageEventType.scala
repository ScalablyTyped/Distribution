package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageEventType extends js.Object

@JSImport("voximplant-websdk", "MessageEventType")
@js.native
object MessageEventType extends js.Object {
  /**
    *    Cancels the 'Composing' event
    */
  @js.native
  sealed trait Cancel extends MessageEventType
  
  /**
    *    Indicates that a reply is being composed
    */
  @js.native
  sealed trait Composing extends MessageEventType
  
  /**
    *    Indicates that the message has been delivered to the recipient
    */
  @js.native
  sealed trait Delivered extends MessageEventType
  
  /**
    *    Indicates that the message has been displayed
    */
  @js.native
  sealed trait Displayed extends MessageEventType
  
  /**
    *    Invalid type
    */
  @js.native
  sealed trait Invalid extends MessageEventType
  
  /**
    *    Indicates that the message has been stored offline by the intended recipient's server
    */
  @js.native
  sealed trait Offline extends MessageEventType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageEventType with Double] = js.native
  /* 0 */ @js.native
  object Cancel extends TopLevel[Cancel with Double]
  
  /* 1 */ @js.native
  object Composing extends TopLevel[Composing with Double]
  
  /* 2 */ @js.native
  object Delivered extends TopLevel[Delivered with Double]
  
  /* 3 */ @js.native
  object Displayed extends TopLevel[Displayed with Double]
  
  /* 4 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 5 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
}

