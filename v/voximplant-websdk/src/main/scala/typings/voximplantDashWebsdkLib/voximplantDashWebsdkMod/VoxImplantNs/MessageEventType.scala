package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageEventType extends js.Object

@JSImport("voximplant-websdk/VoxImplant", "MessageEventType")
@js.native
object MessageEventType extends js.Object {
  /**
  		*	Cancels the 'Composing' event
  		*/
  @js.native
  sealed trait Cancel
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.MessageEventType
  
  /**
  		*	Indicates that a reply is being composed
  		*/
  @js.native
  sealed trait Composing
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.MessageEventType
  
  /**
  		*	Indicates that the message has been delivered to the recipient
  		*/
  @js.native
  sealed trait Delivered
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.MessageEventType
  
  /**
  		*	Indicates that the message has been displayed
  		*/
  @js.native
  sealed trait Displayed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.MessageEventType
  
  /**
  		*	Invalid type
  		*/
  @js.native
  sealed trait Invalid
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.MessageEventType
  
  /**
  		*	Indicates that the message has been stored offline by the intended recipient's server
  		*/
  @js.native
  sealed trait Offline
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.MessageEventType
  
}

