package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionPermissions extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionPermissions")
@js.native
object SubscriptionPermissions extends js.Object {
  /**
    * delete subscription
    */
  @js.native
  sealed trait Delete extends SubscriptionPermissions
  
  /**
    * update subscription
    */
  @js.native
  sealed trait Edit extends SubscriptionPermissions
  
  /**
    * None
    */
  @js.native
  sealed trait None extends SubscriptionPermissions
  
  /**
    * full view of description, filters, etc. Not limited.
    */
  @js.native
  sealed trait View extends SubscriptionPermissions
  
  /* 4 */ val Delete: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionPermissions.Delete with Double = js.native
  /* 2 */ val Edit: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionPermissions.Edit with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionPermissions.None with Double = js.native
  /* 1 */ val View: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionPermissions.View with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionPermissions with Double] = js.native
}

