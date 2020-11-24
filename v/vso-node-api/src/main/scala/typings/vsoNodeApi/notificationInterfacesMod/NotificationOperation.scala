package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationOperation extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationOperation")
@js.native
object NotificationOperation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationOperation with Double] = js.native
  
  @js.native
  sealed trait None extends NotificationOperation
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait SuspendUnprocessed extends NotificationOperation
  /* 1 */ @js.native
  object SuspendUnprocessed extends TopLevel[SuspendUnprocessed with Double]
}
