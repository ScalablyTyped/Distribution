package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionRequestType extends StObject
@JSImport("voximplant-websdk", "SubscriptionRequestType")
@js.native
object SubscriptionRequestType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionRequestType & Double] = js.native
  
  /**
    *    User is asking for permission to add you into their roster
    */
  @js.native
  sealed trait Subscribe
    extends StObject
       with SubscriptionRequestType
  /* 0 */ val Subscribe: typings.voximplantWebsdk.mod.SubscriptionRequestType.Subscribe & Double = js.native
  
  /**
    *    User removed you from their roster
    */
  @js.native
  sealed trait Unsubscribe
    extends StObject
       with SubscriptionRequestType
  /* 1 */ val Unsubscribe: typings.voximplantWebsdk.mod.SubscriptionRequestType.Unsubscribe & Double = js.native
}
