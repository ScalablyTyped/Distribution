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
  
  val Subscribe: Subscribe with java.lang.String = js.native
  val Unsubscribe: Unsubscribe with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.SubscriptionRequestType with java.lang.String
  ] = js.native
}

