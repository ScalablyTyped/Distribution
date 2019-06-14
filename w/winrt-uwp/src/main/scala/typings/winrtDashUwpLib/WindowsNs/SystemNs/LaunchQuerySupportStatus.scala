package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LaunchQuerySupportStatus extends js.Object

/** Specifies whether an app is available that supports activation. */
@JSGlobal("Windows.System.LaunchQuerySupportStatus")
@js.native
object LaunchQuerySupportStatus extends js.Object {
  /** No app is installed to handle the activation. */
  @js.native
  sealed trait appNotInstalled
    extends winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportStatus
  
  /** An app that handles the activation is installed but not available because it is being updated by the store or it was installed on a removable device that is not available. */
  @js.native
  sealed trait appUnavailable
    extends winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportStatus
  
  /** An app that handles the activation is available and may be activated. */
  @js.native
  sealed trait available
    extends winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportStatus
  
  /** The app does not handle the activation. */
  @js.native
  sealed trait notSupported
    extends winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportStatus
  
  /** An unknown error was encountered while determining whether an app supports the activation. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportStatus
  
  /* 1 */ val appNotInstalled: appNotInstalled with scala.Double = js.native
  /* 2 */ val appUnavailable: appUnavailable with scala.Double = js.native
  /* 0 */ val available: available with scala.Double = js.native
  /* 3 */ val notSupported: notSupported with scala.Double = js.native
  /* 4 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportStatus with scala.Double] = js.native
}

