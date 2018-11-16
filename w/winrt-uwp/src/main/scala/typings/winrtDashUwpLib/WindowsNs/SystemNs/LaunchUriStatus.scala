package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LaunchUriStatus extends js.Object

/** Specifies the result of activating an application. */
@JSGlobal("Windows.System.LaunchUriStatus")
@js.native
object LaunchUriStatus extends js.Object {
  /** The application cannot be activated which may be because it is being updated by the store, it was installed on a removable device that is not available, and so on. */
  @js.native
  sealed trait appUnavailable
    extends winrtDashUwpLib.WindowsNs.SystemNs.LaunchUriStatus
  
  /** The application you are trying to activate does not support this URI. */
  @js.native
  sealed trait protocolUnavailable
    extends winrtDashUwpLib.WindowsNs.SystemNs.LaunchUriStatus
  
  /** The application activated successfully. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.SystemNs.LaunchUriStatus
  
  /** An unknown error was encountered while activating the application. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.SystemNs.LaunchUriStatus
  
  val appUnavailable: appUnavailable with java.lang.String = js.native
  val protocolUnavailable: protocolUnavailable with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.LaunchUriStatus with java.lang.String] = js.native
}

