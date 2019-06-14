package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialAppStopResult extends js.Object

/** The result of attempting to stop an app from running on a remote device. */
@JSGlobal("Windows.Media.DialProtocol.DialAppStopResult")
@js.native
object DialAppStopResult extends js.Object {
  /** An error occurred while attempting to retrieve the state. */
  @js.native
  sealed trait networkFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppStopResult
  
  /** The app cannot be stopped because the operation isn't supported. */
  @js.native
  sealed trait operationNotSupported
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppStopResult
  
  /** The app failed to stop. */
  @js.native
  sealed trait stopFailed
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppStopResult
  
  /** The app is successfully stopped. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppStopResult
  
  /* 3 */ val networkFailure: networkFailure with scala.Double = js.native
  /* 2 */ val operationNotSupported: operationNotSupported with scala.Double = js.native
  /* 1 */ val stopFailed: stopFailed with scala.Double = js.native
  /* 0 */ val stopped: stopped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppStopResult with scala.Double
  ] = js.native
}

