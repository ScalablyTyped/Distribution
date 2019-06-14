package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

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
  sealed trait Cancel
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.MessageEventType
  
  /**
  		*	Indicates that a reply is being composed
  		*/
  @js.native
  sealed trait Composing
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.MessageEventType
  
  /**
  		*	Indicates that the message has been delivered to the recipient
  		*/
  @js.native
  sealed trait Delivered
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.MessageEventType
  
  /**
  		*	Indicates that the message has been displayed
  		*/
  @js.native
  sealed trait Displayed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.MessageEventType
  
  /**
  		*	Invalid type
  		*/
  @js.native
  sealed trait Invalid
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.MessageEventType
  
  /**
  		*	Indicates that the message has been stored offline by the intended recipient's server
  		*/
  @js.native
  sealed trait Offline
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.MessageEventType
  
  /* 0 */ val Cancel: Cancel with scala.Double = js.native
  /* 1 */ val Composing: Composing with scala.Double = js.native
  /* 2 */ val Delivered: Delivered with scala.Double = js.native
  /* 3 */ val Displayed: Displayed with scala.Double = js.native
  /* 4 */ val Invalid: Invalid with scala.Double = js.native
  /* 5 */ val Offline: Offline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.MessageEventType with scala.Double
  ] = js.native
}

