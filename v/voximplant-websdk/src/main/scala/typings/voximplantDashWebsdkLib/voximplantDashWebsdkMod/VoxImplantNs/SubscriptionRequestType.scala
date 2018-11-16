package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionRequestType extends js.Object

@JSImport("voximplant-websdk/VoxImplant", "SubscriptionRequestType")
@js.native
object SubscriptionRequestType extends js.Object {
  /**
  		*	User is asking for permission to add you into his roster
  		*/
  @js.native
  sealed trait Subscribe
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.SubscriptionRequestType
  
  /**
  		*	User removed you from his roster
  		*/
  @js.native
  sealed trait Unsubscribe
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.SubscriptionRequestType
  
}

