package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationReasonType extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationReasonType")
@js.native
object NotificationReasonType extends js.Object {
  @js.native
  sealed trait AliasMemberGroupRole extends NotificationReasonType
  
  @js.native
  sealed trait DirectMember extends NotificationReasonType
  
  @js.native
  sealed trait DirectMemberGroupRole extends NotificationReasonType
  
  @js.native
  sealed trait Follows extends NotificationReasonType
  
  @js.native
  sealed trait GroupAlias extends NotificationReasonType
  
  @js.native
  sealed trait InDirectMemberGroupRole extends NotificationReasonType
  
  @js.native
  sealed trait IndirectMember extends NotificationReasonType
  
  @js.native
  sealed trait Personal extends NotificationReasonType
  
  @js.native
  sealed trait PersonalAlias extends NotificationReasonType
  
  @js.native
  sealed trait SingleRole extends NotificationReasonType
  
  @js.native
  sealed trait SubscriptionAlias extends NotificationReasonType
  
  @js.native
  sealed trait Unknown extends NotificationReasonType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationReasonType with Double] = js.native
  /* 11 */ @js.native
  object AliasMemberGroupRole extends TopLevel[AliasMemberGroupRole with Double]
  
  /* 4 */ @js.native
  object DirectMember extends TopLevel[DirectMember with Double]
  
  /* 9 */ @js.native
  object DirectMemberGroupRole extends TopLevel[DirectMemberGroupRole with Double]
  
  /* 1 */ @js.native
  object Follows extends TopLevel[Follows with Double]
  
  /* 6 */ @js.native
  object GroupAlias extends TopLevel[GroupAlias with Double]
  
  /* 10 */ @js.native
  object InDirectMemberGroupRole extends TopLevel[InDirectMemberGroupRole with Double]
  
  /* 5 */ @js.native
  object IndirectMember extends TopLevel[IndirectMember with Double]
  
  /* 2 */ @js.native
  object Personal extends TopLevel[Personal with Double]
  
  /* 3 */ @js.native
  object PersonalAlias extends TopLevel[PersonalAlias with Double]
  
  /* 8 */ @js.native
  object SingleRole extends TopLevel[SingleRole with Double]
  
  /* 7 */ @js.native
  object SubscriptionAlias extends TopLevel[SubscriptionAlias with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

