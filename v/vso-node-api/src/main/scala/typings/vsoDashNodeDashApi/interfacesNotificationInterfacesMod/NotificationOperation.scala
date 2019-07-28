package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationOperation extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationOperation")
@js.native
object NotificationOperation extends js.Object {
  @js.native
  sealed trait None extends NotificationOperation
  
  @js.native
  sealed trait SuspendUnprocessed extends NotificationOperation
  
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationOperation.None with Double = js.native
  /* 1 */ val SuspendUnprocessed: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationOperation.SuspendUnprocessed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationOperation with Double] = js.native
}

