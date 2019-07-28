package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageEventType extends js.Object

@JSImport("voximplant-websdk", "MessageEventType")
@js.native
object MessageEventType extends js.Object {
  /**
  		*	Cancels the 'Composing' event
  		*/
  @js.native
  sealed trait Cancel extends MessageEventType
  
  /**
  		*	Indicates that a reply is being composed
  		*/
  @js.native
  sealed trait Composing extends MessageEventType
  
  /**
  		*	Indicates that the message has been delivered to the recipient
  		*/
  @js.native
  sealed trait Delivered extends MessageEventType
  
  /**
  		*	Indicates that the message has been displayed
  		*/
  @js.native
  sealed trait Displayed extends MessageEventType
  
  /**
  		*	Invalid type
  		*/
  @js.native
  sealed trait Invalid extends MessageEventType
  
  /**
  		*	Indicates that the message has been stored offline by the intended recipient's server
  		*/
  @js.native
  sealed trait Offline extends MessageEventType
  
  /* 0 */ val Cancel: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.MessageEventType.Cancel with Double = js.native
  /* 1 */ val Composing: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.MessageEventType.Composing with Double = js.native
  /* 2 */ val Delivered: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.MessageEventType.Delivered with Double = js.native
  /* 3 */ val Displayed: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.MessageEventType.Displayed with Double = js.native
  /* 4 */ val Invalid: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.MessageEventType.Invalid with Double = js.native
  /* 5 */ val Offline: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.MessageEventType.Offline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageEventType with Double] = js.native
}

