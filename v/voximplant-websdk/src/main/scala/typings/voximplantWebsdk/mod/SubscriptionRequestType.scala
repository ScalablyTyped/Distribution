package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionRequestType extends js.Object
@JSImport("voximplant-websdk", "SubscriptionRequestType")
@js.native
object SubscriptionRequestType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionRequestType with Double] = js.native
  
  /**
    *    User is asking for permission to add you into their roster
    */
  @js.native
  sealed trait Subscribe extends SubscriptionRequestType
  /* 0 */ @js.native
  object Subscribe extends TopLevel[Subscribe with Double]
  
  /**
    *    User removed you from their roster
    */
  @js.native
  sealed trait Unsubscribe extends SubscriptionRequestType
  /* 1 */ @js.native
  object Unsubscribe extends TopLevel[Unsubscribe with Double]
}
