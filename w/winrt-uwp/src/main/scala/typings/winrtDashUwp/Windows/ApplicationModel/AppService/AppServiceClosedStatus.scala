package typings.winrtDashUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppServiceClosedStatus extends js.Object

/** Describes the status that was set when the endpoint for the app service was closed. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceClosedStatus")
@js.native
object AppServiceClosedStatus extends js.Object {
  /** The endpoint for the app service was closed by the client or the system */
  @js.native
  sealed trait canceled extends AppServiceClosedStatus
  
  /** The endpoint for the app service closed gracefully. */
  @js.native
  sealed trait completed extends AppServiceClosedStatus
  
  /** The endpoint for the app service was closed because the endpoint ran out of resources. */
  @js.native
  sealed trait resourceLimitsExceeded extends AppServiceClosedStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknown extends AppServiceClosedStatus
  
  /* 1 */ val canceled: typings.winrtDashUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.canceled with Double = js.native
  /* 0 */ val completed: typings.winrtDashUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.completed with Double = js.native
  /* 2 */ val resourceLimitsExceeded: typings.winrtDashUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.resourceLimitsExceeded with Double = js.native
  /* 3 */ val unknown: typings.winrtDashUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppServiceClosedStatus with Double] = js.native
}

