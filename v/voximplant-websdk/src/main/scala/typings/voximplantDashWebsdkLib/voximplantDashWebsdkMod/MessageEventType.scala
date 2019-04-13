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
  
  val Cancel: Cancel with java.lang.String = js.native
  val Composing: Composing with java.lang.String = js.native
  val Delivered: Delivered with java.lang.String = js.native
  val Displayed: Displayed with java.lang.String = js.native
  val Invalid: Invalid with java.lang.String = js.native
  val Offline: Offline with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.MessageEventType with java.lang.String
  ] = js.native
}

