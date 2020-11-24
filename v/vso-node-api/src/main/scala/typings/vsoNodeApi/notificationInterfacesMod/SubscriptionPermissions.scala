package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionPermissions extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionPermissions")
@js.native
object SubscriptionPermissions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionPermissions with Double] = js.native
  
  /**
    * delete subscription
    */
  @js.native
  sealed trait Delete extends SubscriptionPermissions
  /* 4 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /**
    * update subscription
    */
  @js.native
  sealed trait Edit extends SubscriptionPermissions
  /* 2 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /**
    * None
    */
  @js.native
  sealed trait None extends SubscriptionPermissions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * full view of description, filters, etc. Not limited.
    */
  @js.native
  sealed trait View extends SubscriptionPermissions
  /* 1 */ @js.native
  object View extends TopLevel[View with Double]
}
