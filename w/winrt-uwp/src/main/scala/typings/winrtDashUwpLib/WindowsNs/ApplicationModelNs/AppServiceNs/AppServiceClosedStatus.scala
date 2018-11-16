package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs

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
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs.AppServiceClosedStatus
  
  /** The endpoint for the app service closed gracefully. */
  @js.native
  sealed trait completed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs.AppServiceClosedStatus
  
  /** The endpoint for the app service was closed because the endpoint ran out of resources. */
  @js.native
  sealed trait resourceLimitsExceeded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs.AppServiceClosedStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs.AppServiceClosedStatus
  
  val canceled: canceled with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val resourceLimitsExceeded: resourceLimitsExceeded with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs.AppServiceClosedStatus with java.lang.String
  ] = js.native
}

