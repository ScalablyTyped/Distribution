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
  
  val networkFailure: networkFailure with java.lang.String = js.native
  val running: running with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppState with java.lang.String
  ] = js.native
}

