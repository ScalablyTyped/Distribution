package typings.winrtDashUwp.WindowsNs.MediaNs.DialProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialAppLaunchResult extends js.Object

/** The result of attempting to launch an app on a remote device. */
@JSGlobal("Windows.Media.DialProtocol.DialAppLaunchResult")
@js.native
object DialAppLaunchResult extends js.Object {
  /** The app failed to launch. */
  @js.native
  sealed trait failedToLaunch extends DialAppLaunchResult
  
  /** The app successfully launched. */
  @js.native
  sealed trait launched extends DialAppLaunchResult
  
  /** An error occurred while attempting to retrieve the state. */
  @js.native
  sealed trait networkFailure extends DialAppLaunchResult
  
  /** The app was not found. */
  @js.native
  sealed trait notFound extends DialAppLaunchResult
  
  /* 1 */ val failedToLaunch: typings.winrtDashUwp.WindowsNs.MediaNs.DialProtocolNs.DialAppLaunchResult.failedToLaunch with Double = js.native
  /* 0 */ val launched: typings.winrtDashUwp.WindowsNs.MediaNs.DialProtocolNs.DialAppLaunchResult.launched with Double = js.native
  /* 3 */ val networkFailure: typings.winrtDashUwp.WindowsNs.MediaNs.DialProtocolNs.DialAppLaunchResult.networkFailure with Double = js.native
  /* 2 */ val notFound: typings.winrtDashUwp.WindowsNs.MediaNs.DialProtocolNs.DialAppLaunchResult.notFound with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialAppLaunchResult with Double] = js.native
}

