package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationReasonType extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationReasonType")
@js.native
object NotificationReasonType extends js.Object {
  @js.native
  sealed trait AliasMemberGroupRole
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  @js.native
  sealed trait DirectMember
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  @js.native
  sealed trait DirectMemberGroupRole
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  @js.native
  sealed trait Follows
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  @js.native
  sealed trait GroupAlias
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  @js.native
  sealed trait InDirectMemberGroupRole
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  @js.native
  sealed trait IndirectMember
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  @js.native
  sealed trait Personal
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  @js.native
  sealed trait PersonalAlias
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  @js.native
  sealed trait SingleRole
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  @js.native
  sealed trait SubscriptionAlias
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType
  
  /* 11 */ val AliasMemberGroupRole: AliasMemberGroupRole with scala.Double = js.native
  /* 4 */ val DirectMember: DirectMember with scala.Double = js.native
  /* 9 */ val DirectMemberGroupRole: DirectMemberGroupRole with scala.Double = js.native
  /* 1 */ val Follows: Follows with scala.Double = js.native
  /* 6 */ val GroupAlias: GroupAlias with scala.Double = js.native
  /* 10 */ val InDirectMemberGroupRole: InDirectMemberGroupRole with scala.Double = js.native
  /* 5 */ val IndirectMember: IndirectMember with scala.Double = js.native
  /* 2 */ val Personal: Personal with scala.Double = js.native
  /* 3 */ val PersonalAlias: PersonalAlias with scala.Double = js.native
  /* 8 */ val SingleRole: SingleRole with scala.Double = js.native
  /* 7 */ val SubscriptionAlias: SubscriptionAlias with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReasonType with scala.Double
  ] = js.native
}

