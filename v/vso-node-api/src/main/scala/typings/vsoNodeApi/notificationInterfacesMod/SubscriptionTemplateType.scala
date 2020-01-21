package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionTemplateType extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateType")
@js.native
object SubscriptionTemplateType extends js.Object {
  @js.native
  sealed trait Both extends SubscriptionTemplateType
  
  @js.native
  sealed trait None extends SubscriptionTemplateType
  
  @js.native
  sealed trait Team extends SubscriptionTemplateType
  
  @js.native
  sealed trait User extends SubscriptionTemplateType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionTemplateType with Double] = js.native
  /* 2 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Team extends TopLevel[Team with Double]
  
  /* 0 */ @js.native
  object User extends TopLevel[User with Double]
  
}

