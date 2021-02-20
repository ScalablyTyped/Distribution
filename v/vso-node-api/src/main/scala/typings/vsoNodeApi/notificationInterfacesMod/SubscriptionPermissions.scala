package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionPermissions extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionPermissions")
@js.native
object SubscriptionPermissions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionPermissions with Double] = js.native
  
  /**
    * delete subscription
    */
  @js.native
  sealed trait Delete extends SubscriptionPermissions
  /* 4 */ val Delete: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionPermissions.Delete with Double = js.native
  
  /**
    * update subscription
    */
  @js.native
  sealed trait Edit extends SubscriptionPermissions
  /* 2 */ val Edit: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionPermissions.Edit with Double = js.native
  
  /**
    * None
    */
  @js.native
  sealed trait None extends SubscriptionPermissions
  /* 0 */ val None: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionPermissions.None with Double = js.native
  
  /**
    * full view of description, filters, etc. Not limited.
    */
  @js.native
  sealed trait View extends SubscriptionPermissions
  /* 1 */ val View: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionPermissions.View with Double = js.native
}
