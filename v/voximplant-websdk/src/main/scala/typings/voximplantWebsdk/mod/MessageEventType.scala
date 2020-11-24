package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageEventType extends js.Object
@JSImport("voximplant-websdk", "MessageEventType")
@js.native
object MessageEventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageEventType with Double] = js.native
  
  /**
    *    Cancels the 'Composing' event
    */
  @js.native
  sealed trait Cancel extends MessageEventType
  /* 0 */ @js.native
  object Cancel extends TopLevel[Cancel with Double]
  
  /**
    *    Indicates that a reply is being composed
    */
  @js.native
  sealed trait Composing extends MessageEventType
  /* 1 */ @js.native
  object Composing extends TopLevel[Composing with Double]
  
  /**
    *    Indicates that the message has been delivered to the recipient
    */
  @js.native
  sealed trait Delivered extends MessageEventType
  /* 2 */ @js.native
  object Delivered extends TopLevel[Delivered with Double]
  
  /**
    *    Indicates that the message has been displayed
    */
  @js.native
  sealed trait Displayed extends MessageEventType
  /* 3 */ @js.native
  object Displayed extends TopLevel[Displayed with Double]
  
  /**
    *    Invalid type
    */
  @js.native
  sealed trait Invalid extends MessageEventType
  /* 4 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /**
    *    Indicates that the message has been stored offline by the intended recipient's server
    */
  @js.native
  sealed trait Offline extends MessageEventType
  /* 5 */ @js.native
  object Offline extends TopLevel[Offline with Double]
}
