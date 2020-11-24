package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionTemplateType extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateType")
@js.native
object SubscriptionTemplateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionTemplateType with Double] = js.native
  
  @js.native
  sealed trait Both extends SubscriptionTemplateType
  /* 2 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  @js.native
  sealed trait None extends SubscriptionTemplateType
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Team extends SubscriptionTemplateType
  /* 1 */ @js.native
  object Team extends TopLevel[Team with Double]
  
  @js.native
  sealed trait User extends SubscriptionTemplateType
  /* 0 */ @js.native
  object User extends TopLevel[User with Double]
}
