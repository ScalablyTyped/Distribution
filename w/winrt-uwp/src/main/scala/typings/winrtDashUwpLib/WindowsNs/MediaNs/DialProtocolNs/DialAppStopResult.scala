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
  
  val networkFailure: networkFailure with java.lang.String = js.native
  val operationNotSupported: operationNotSupported with java.lang.String = js.native
  val stopFailed: stopFailed with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppStopResult with java.lang.String
  ] = js.native
}

