package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationReasonType extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationReasonType")
@js.native
object NotificationReasonType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationReasonType with Double] = js.native
  
  @js.native
  sealed trait AliasMemberGroupRole extends NotificationReasonType
  /* 11 */ val AliasMemberGroupRole: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.AliasMemberGroupRole with Double = js.native
  
  @js.native
  sealed trait DirectMember extends NotificationReasonType
  /* 4 */ val DirectMember: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.DirectMember with Double = js.native
  
  @js.native
  sealed trait DirectMemberGroupRole extends NotificationReasonType
  /* 9 */ val DirectMemberGroupRole: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.DirectMemberGroupRole with Double = js.native
  
  @js.native
  sealed trait Follows extends NotificationReasonType
  /* 1 */ val Follows: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.Follows with Double = js.native
  
  @js.native
  sealed trait GroupAlias extends NotificationReasonType
  /* 6 */ val GroupAlias: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.GroupAlias with Double = js.native
  
  @js.native
  sealed trait InDirectMemberGroupRole extends NotificationReasonType
  /* 10 */ val InDirectMemberGroupRole: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.InDirectMemberGroupRole with Double = js.native
  
  @js.native
  sealed trait IndirectMember extends NotificationReasonType
  /* 5 */ val IndirectMember: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.IndirectMember with Double = js.native
  
  @js.native
  sealed trait Personal extends NotificationReasonType
  /* 2 */ val Personal: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.Personal with Double = js.native
  
  @js.native
  sealed trait PersonalAlias extends NotificationReasonType
  /* 3 */ val PersonalAlias: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.PersonalAlias with Double = js.native
  
  @js.native
  sealed trait SingleRole extends NotificationReasonType
  /* 8 */ val SingleRole: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.SingleRole with Double = js.native
  
  @js.native
  sealed trait SubscriptionAlias extends NotificationReasonType
  /* 7 */ val SubscriptionAlias: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.SubscriptionAlias with Double = js.native
  
  @js.native
  sealed trait Unknown extends NotificationReasonType
  /* 0 */ val Unknown: typings.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.Unknown with Double = js.native
}
