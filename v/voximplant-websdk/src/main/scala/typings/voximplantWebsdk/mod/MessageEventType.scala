package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageEventType extends StObject
@JSImport("voximplant-websdk", "MessageEventType")
@js.native
object MessageEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageEventType & Double] = js.native
  
  /**
    *    Cancels the 'Composing' event
    */
  @js.native
  sealed trait Cancel
    extends StObject
       with MessageEventType
  /* 0 */ val Cancel: typings.voximplantWebsdk.mod.MessageEventType.Cancel & Double = js.native
  
  /**
    *    Indicates that a reply is being composed
    */
  @js.native
  sealed trait Composing
    extends StObject
       with MessageEventType
  /* 1 */ val Composing: typings.voximplantWebsdk.mod.MessageEventType.Composing & Double = js.native
  
  /**
    *    Indicates that the message has been delivered to the recipient
    */
  @js.native
  sealed trait Delivered
    extends StObject
       with MessageEventType
  /* 2 */ val Delivered: typings.voximplantWebsdk.mod.MessageEventType.Delivered & Double = js.native
  
  /**
    *    Indicates that the message has been displayed
    */
  @js.native
  sealed trait Displayed
    extends StObject
       with MessageEventType
  /* 3 */ val Displayed: typings.voximplantWebsdk.mod.MessageEventType.Displayed & Double = js.native
  
  /**
    *    Invalid type
    */
  @js.native
  sealed trait Invalid
    extends StObject
       with MessageEventType
  /* 4 */ val Invalid: typings.voximplantWebsdk.mod.MessageEventType.Invalid & Double = js.native
  
  /**
    *    Indicates that the message has been stored offline by the intended recipient's server
    */
  @js.native
  sealed trait Offline
    extends StObject
       with MessageEventType
  /* 5 */ val Offline: typings.voximplantWebsdk.mod.MessageEventType.Offline & Double = js.native
}
