package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

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
  sealed trait Delete
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionPermissions
  
  /**
       * update subscription
       */
  @js.native
  sealed trait Edit
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionPermissions
  
  /**
       * None
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionPermissions
  
  /**
       * full view of description, filters, etc. Not limited.
       */
  @js.native
  sealed trait View
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionPermissions
  
  /* 4 */ val Delete: Delete with scala.Double = js.native
  /* 2 */ val Edit: Edit with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val View: View with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionPermissions with scala.Double
  ] = js.native
}

