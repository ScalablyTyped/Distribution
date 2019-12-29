package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionTemplateQueryFlags extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateQueryFlags")
@js.native
object SubscriptionTemplateQueryFlags extends js.Object {
  /**
    * Include the event type details like the fields and operators
    */
  @js.native
  sealed trait IncludeEventTypeInformation extends SubscriptionTemplateQueryFlags
  
  /**
    * Include group templates
    */
  @js.native
  sealed trait IncludeGroup extends SubscriptionTemplateQueryFlags
  
  /**
    * Include user templates
    */
  @js.native
  sealed trait IncludeUser extends SubscriptionTemplateQueryFlags
  
  /**
    * Include user and group templates
    */
  @js.native
  sealed trait IncludeUserAndGroup extends SubscriptionTemplateQueryFlags
  
  @js.native
  sealed trait None extends SubscriptionTemplateQueryFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionTemplateQueryFlags with Double] = js.native
  /* 22 */ @js.native
  object IncludeEventTypeInformation extends TopLevel[IncludeEventTypeInformation with Double]
  
  /* 2 */ @js.native
  object IncludeGroup extends TopLevel[IncludeGroup with Double]
  
  /* 1 */ @js.native
  object IncludeUser extends TopLevel[IncludeUser with Double]
  
  /* 4 */ @js.native
  object IncludeUserAndGroup extends TopLevel[IncludeUserAndGroup with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

