package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationSubscriberDeliveryPreference extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationSubscriberDeliveryPreference")
@js.native
object NotificationSubscriberDeliveryPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationSubscriberDeliveryPreference & Double] = js.native
  
  @js.native
  sealed trait EachMember
    extends StObject
       with NotificationSubscriberDeliveryPreference
  /* 2 */ val EachMember: typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference.EachMember & Double = js.native
  
  @js.native
  sealed trait NoDelivery
    extends StObject
       with NotificationSubscriberDeliveryPreference
  /* -1 */ val NoDelivery: typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference.NoDelivery & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with NotificationSubscriberDeliveryPreference
  /* 0 */ val None: typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference.None & Double = js.native
  
  @js.native
  sealed trait NotSet
    extends StObject
       with NotificationSubscriberDeliveryPreference
  /* -2147483648 */ val NotSet: typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference.NotSet & Double = js.native
  
  /**
    * Deliver notifications to the subscriber's preferred email address.
    */
  @js.native
  sealed trait PreferredEmailAddress
    extends StObject
       with NotificationSubscriberDeliveryPreference
  /* 1 */ val PreferredEmailAddress: typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriberDeliveryPreference.PreferredEmailAddress & Double = js.native
}
