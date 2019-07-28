package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationSubscriberDeliveryPreference extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationSubscriberDeliveryPreference")
@js.native
object NotificationSubscriberDeliveryPreference extends js.Object {
  @js.native
  sealed trait EachMember extends NotificationSubscriberDeliveryPreference
  
  @js.native
  sealed trait NoDelivery extends NotificationSubscriberDeliveryPreference
  
  @js.native
  sealed trait None extends NotificationSubscriberDeliveryPreference
  
  @js.native
  sealed trait NotSet extends NotificationSubscriberDeliveryPreference
  
  /**
    * Deliver notifications to the subscriber's preferred email address.
    */
  @js.native
  sealed trait PreferredEmailAddress extends NotificationSubscriberDeliveryPreference
  
  /* 2 */ val EachMember: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference.EachMember with Double = js.native
  /* -1 */ val NoDelivery: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference.NoDelivery with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference.None with Double = js.native
  /* -2147483648 */ val NotSet: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference.NotSet with Double = js.native
  /* 1 */ val PreferredEmailAddress: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference.PreferredEmailAddress with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationSubscriberDeliveryPreference with Double] = js.native
}

