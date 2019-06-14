package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppServiceResponseStatus extends js.Object

/** Describes the status when an app tries to send a message to an app service by calling the AppServiceConnection.SendMessageAsync method. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceResponseStatus")
@js.native
object AppServiceResponseStatus extends js.Object {
  /** The app service failed to receive and process the message. */
  @js.native
  sealed trait failure
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs.AppServiceResponseStatus
  
  /** The app service exited because not enough resources were available. */
  @js.native
  sealed trait resourceLimitsExceeded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs.AppServiceResponseStatus
  
  /** The app service successfully received and processed the message. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs.AppServiceResponseStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs.AppServiceResponseStatus
  
  /* 1 */ val failure: failure with scala.Double = js.native
  /* 2 */ val resourceLimitsExceeded: resourceLimitsExceeded with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 3 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs.AppServiceResponseStatus with scala.Double
  ] = js.native
}

