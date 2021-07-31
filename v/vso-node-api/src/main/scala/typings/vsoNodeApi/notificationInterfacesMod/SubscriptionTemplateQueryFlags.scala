package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionTemplateQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateQueryFlags")
@js.native
object SubscriptionTemplateQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionTemplateQueryFlags & Double] = js.native
  
  /**
    * Include the event type details like the fields and operators
    */
  @js.native
  sealed trait IncludeEventTypeInformation
    extends StObject
       with SubscriptionTemplateQueryFlags
  /* 22 */ val IncludeEventTypeInformation: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeEventTypeInformation & Double = js.native
  
  /**
    * Include group templates
    */
  @js.native
  sealed trait IncludeGroup
    extends StObject
       with SubscriptionTemplateQueryFlags
  /* 2 */ val IncludeGroup: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeGroup & Double = js.native
  
  /**
    * Include user templates
    */
  @js.native
  sealed trait IncludeUser
    extends StObject
       with SubscriptionTemplateQueryFlags
  /* 1 */ val IncludeUser: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeUser & Double = js.native
  
  /**
    * Include user and group templates
    */
  @js.native
  sealed trait IncludeUserAndGroup
    extends StObject
       with SubscriptionTemplateQueryFlags
  /* 4 */ val IncludeUserAndGroup: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeUserAndGroup & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with SubscriptionTemplateQueryFlags
  /* 0 */ val None: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateQueryFlags.None & Double = js.native
}
