package typings.winrtDashUwp.WindowsNs.MediaNs.DialProtocolNs

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
  sealed trait networkFailure extends DialAppStopResult
  
  /** The app cannot be stopped because the operation isn't supported. */
  @js.native
  sealed trait operationNotSupported extends DialAppStopResult
  
  /** The app failed to stop. */
  @js.native
  sealed trait stopFailed extends DialAppStopResult
  
  /** The app is successfully stopped. */
  @js.native
  sealed trait stopped extends DialAppStopResult
  
  /* 3 */ val networkFailure: typings.winrtDashUwp.WindowsNs.MediaNs.DialProtocolNs.DialAppStopResult.networkFailure with Double = js.native
  /* 2 */ val operationNotSupported: typings.winrtDashUwp.WindowsNs.MediaNs.DialProtocolNs.DialAppStopResult.operationNotSupported with Double = js.native
  /* 1 */ val stopFailed: typings.winrtDashUwp.WindowsNs.MediaNs.DialProtocolNs.DialAppStopResult.stopFailed with Double = js.native
  /* 0 */ val stopped: typings.winrtDashUwp.WindowsNs.MediaNs.DialProtocolNs.DialAppStopResult.stopped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialAppStopResult with Double] = js.native
}

