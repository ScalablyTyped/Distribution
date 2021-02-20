package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionTemplateQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateQueryFlags")
@js.native
object SubscriptionTemplateQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionTemplateQueryFlags with Double] = js.native
  
  /**
    * Include the event type details like the fields and operators
    */
  @js.native
  sealed trait IncludeEventTypeInformation extends SubscriptionTemplateQueryFlags
  /* 22 */ val IncludeEventTypeInformation: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeEventTypeInformation with Double = js.native
  
  /**
    * Include group templates
    */
  @js.native
  sealed trait IncludeGroup extends SubscriptionTemplateQueryFlags
  /* 2 */ val IncludeGroup: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeGroup with Double = js.native
  
  /**
    * Include user templates
    */
  @js.native
  sealed trait IncludeUser extends SubscriptionTemplateQueryFlags
  /* 1 */ val IncludeUser: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeUser with Double = js.native
  
  /**
    * Include user and group templates
    */
  @js.native
  sealed trait IncludeUserAndGroup extends SubscriptionTemplateQueryFlags
  /* 4 */ val IncludeUserAndGroup: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeUserAndGroup with Double = js.native
  
  @js.native
  sealed trait None extends SubscriptionTemplateQueryFlags
  /* 0 */ val None: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateQueryFlags.None with Double = js.native
}
