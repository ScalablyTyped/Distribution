package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationOperation with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object SuspendUnprocessed extends TopLevel[SuspendUnprocessed with Double]
  
}

