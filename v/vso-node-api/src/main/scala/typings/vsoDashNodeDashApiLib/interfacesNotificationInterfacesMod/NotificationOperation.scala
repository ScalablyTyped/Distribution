package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationOperation extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationOperation")
@js.native
object NotificationOperation extends js.Object {
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationOperation
  
  @js.native
  sealed trait SuspendUnprocessed
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationOperation
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val SuspendUnprocessed: SuspendUnprocessed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationOperation with scala.Double
  ] = js.native
}

