package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialAppState extends js.Object

/** The state of the application on the remote device. */
@JSGlobal("Windows.Media.DialProtocol.DialAppState")
@js.native
object DialAppState extends js.Object {
  /** An error occurred while attempting to retrieve the state. */
  @js.native
  sealed trait networkFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppState
  
  /** The app is running on the remote device. */
  @js.native
  sealed trait running
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppState
  
  /** The app is stopped on the remote device. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppState
  
  /** The state cannot be determined. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppState
  
  /* 3 */ val networkFailure: networkFailure with scala.Double = js.native
  /* 2 */ val running: running with scala.Double = js.native
  /* 1 */ val stopped: stopped with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppState with scala.Double] = js.native
}

