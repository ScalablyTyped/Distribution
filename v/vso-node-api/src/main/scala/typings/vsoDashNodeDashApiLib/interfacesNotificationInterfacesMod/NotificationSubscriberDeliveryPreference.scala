package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationSubscriberDeliveryPreference extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationSubscriberDeliveryPreference")
@js.native
object NotificationSubscriberDeliveryPreference extends js.Object {
  @js.native
  sealed trait EachMember
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference
  
  @js.native
  sealed trait NoDelivery
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference
  
  @js.native
  sealed trait NotSet
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference
  
  /**
       * Deliver notifications to the subscriber's preferred email address.
       */
  @js.native
  sealed trait PreferredEmailAddress
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference
  
  /* 2 */ val EachMember: EachMember with scala.Double = js.native
  /* -1 */ val NoDelivery: NoDelivery with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* -2147483648 */ val NotSet: NotSet with scala.Double = js.native
  /* 1 */ val PreferredEmailAddress: PreferredEmailAddress with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference with scala.Double
  ] = js.native
}

