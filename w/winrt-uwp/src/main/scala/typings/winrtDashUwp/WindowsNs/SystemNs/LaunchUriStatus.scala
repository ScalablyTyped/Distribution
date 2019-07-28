package typings.winrtDashUwp.WindowsNs.SystemNs

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
  sealed trait appUnavailable extends LaunchUriStatus
  
  /** The application you are trying to activate does not support this URI. */
  @js.native
  sealed trait protocolUnavailable extends LaunchUriStatus
  
  /** The application activated successfully. */
  @js.native
  sealed trait success extends LaunchUriStatus
  
  /** An unknown error was encountered while activating the application. */
  @js.native
  sealed trait unknown extends LaunchUriStatus
  
  /* 1 */ val appUnavailable: typings.winrtDashUwp.WindowsNs.SystemNs.LaunchUriStatus.appUnavailable with Double = js.native
  /* 2 */ val protocolUnavailable: typings.winrtDashUwp.WindowsNs.SystemNs.LaunchUriStatus.protocolUnavailable with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.SystemNs.LaunchUriStatus.success with Double = js.native
  /* 3 */ val unknown: typings.winrtDashUwp.WindowsNs.SystemNs.LaunchUriStatus.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LaunchUriStatus with Double] = js.native
}

