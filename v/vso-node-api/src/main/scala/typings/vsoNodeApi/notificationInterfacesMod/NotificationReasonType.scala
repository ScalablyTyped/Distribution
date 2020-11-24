package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationReasonType extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationReasonType")
@js.native
object NotificationReasonType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationReasonType with Double] = js.native
  
  @js.native
  sealed trait AliasMemberGroupRole extends NotificationReasonType
  /* 11 */ @js.native
  object AliasMemberGroupRole extends TopLevel[AliasMemberGroupRole with Double]
  
  @js.native
  sealed trait DirectMember extends NotificationReasonType
  /* 4 */ @js.native
  object DirectMember extends TopLevel[DirectMember with Double]
  
  @js.native
  sealed trait DirectMemberGroupRole extends NotificationReasonType
  /* 9 */ @js.native
  object DirectMemberGroupRole extends TopLevel[DirectMemberGroupRole with Double]
  
  @js.native
  sealed trait Follows extends NotificationReasonType
  /* 1 */ @js.native
  object Follows extends TopLevel[Follows with Double]
  
  @js.native
  sealed trait GroupAlias extends NotificationReasonType
  /* 6 */ @js.native
  object GroupAlias extends TopLevel[GroupAlias with Double]
  
  @js.native
  sealed trait InDirectMemberGroupRole extends NotificationReasonType
  /* 10 */ @js.native
  object InDirectMemberGroupRole extends TopLevel[InDirectMemberGroupRole with Double]
  
  @js.native
  sealed trait IndirectMember extends NotificationReasonType
  /* 5 */ @js.native
  object IndirectMember extends TopLevel[IndirectMember with Double]
  
  @js.native
  sealed trait Personal extends NotificationReasonType
  /* 2 */ @js.native
  object Personal extends TopLevel[Personal with Double]
  
  @js.native
  sealed trait PersonalAlias extends NotificationReasonType
  /* 3 */ @js.native
  object PersonalAlias extends TopLevel[PersonalAlias with Double]
  
  @js.native
  sealed trait SingleRole extends NotificationReasonType
  /* 8 */ @js.native
  object SingleRole extends TopLevel[SingleRole with Double]
  
  @js.native
  sealed trait SubscriptionAlias extends NotificationReasonType
  /* 7 */ @js.native
  object SubscriptionAlias extends TopLevel[SubscriptionAlias with Double]
  
  @js.native
  sealed trait Unknown extends NotificationReasonType
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
