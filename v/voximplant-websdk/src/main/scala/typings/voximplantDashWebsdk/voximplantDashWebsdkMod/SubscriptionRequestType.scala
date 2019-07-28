package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionRequestType extends js.Object

@JSImport("voximplant-websdk", "SubscriptionRequestType")
@js.native
object SubscriptionRequestType extends js.Object {
  /**
  		*	User is asking for permission to add you into his roster
  		*/
  @js.native
  sealed trait Subscribe extends SubscriptionRequestType
  
  /**
  		*	User removed you from his roster
  		*/
  @js.native
  sealed trait Unsubscribe extends SubscriptionRequestType
  
  /* 0 */ val Subscribe: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.SubscriptionRequestType.Subscribe with Double = js.native
  /* 1 */ val Unsubscribe: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.SubscriptionRequestType.Unsubscribe with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionRequestType with Double] = js.native
}

