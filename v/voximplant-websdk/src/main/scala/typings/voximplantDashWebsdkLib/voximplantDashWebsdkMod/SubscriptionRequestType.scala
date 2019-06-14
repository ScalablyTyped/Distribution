package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

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
  sealed trait Subscribe
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.SubscriptionRequestType
  
  /**
  		*	User removed you from his roster
  		*/
  @js.native
  sealed trait Unsubscribe
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.SubscriptionRequestType
  
  /* 0 */ val Subscribe: Subscribe with scala.Double = js.native
  /* 1 */ val Unsubscribe: Unsubscribe with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.SubscriptionRequestType with scala.Double
  ] = js.native
}

