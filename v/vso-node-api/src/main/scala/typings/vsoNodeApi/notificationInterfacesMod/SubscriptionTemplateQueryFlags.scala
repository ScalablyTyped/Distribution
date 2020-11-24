package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionTemplateQueryFlags extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateQueryFlags")
@js.native
object SubscriptionTemplateQueryFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionTemplateQueryFlags with Double] = js.native
  
  /**
    * Include the event type details like the fields and operators
    */
  @js.native
  sealed trait IncludeEventTypeInformation extends SubscriptionTemplateQueryFlags
  /* 22 */ @js.native
  object IncludeEventTypeInformation extends TopLevel[IncludeEventTypeInformation with Double]
  
  /**
    * Include group templates
    */
  @js.native
  sealed trait IncludeGroup extends SubscriptionTemplateQueryFlags
  /* 2 */ @js.native
  object IncludeGroup extends TopLevel[IncludeGroup with Double]
  
  /**
    * Include user templates
    */
  @js.native
  sealed trait IncludeUser extends SubscriptionTemplateQueryFlags
  /* 1 */ @js.native
  object IncludeUser extends TopLevel[IncludeUser with Double]
  
  /**
    * Include user and group templates
    */
  @js.native
  sealed trait IncludeUserAndGroup extends SubscriptionTemplateQueryFlags
  /* 4 */ @js.native
  object IncludeUserAndGroup extends TopLevel[IncludeUserAndGroup with Double]
  
  @js.native
  sealed trait None extends SubscriptionTemplateQueryFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
