package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs

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
  sealed trait failedToLaunch
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppLaunchResult
  
  /** The app successfully launched. */
  @js.native
  sealed trait launched
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppLaunchResult
  
  /** An error occurred while attempting to retrieve the state. */
  @js.native
  sealed trait networkFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppLaunchResult
  
  /** The app was not found. */
  @js.native
  sealed trait notFound
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppLaunchResult
  
  /* 1 */ val failedToLaunch: failedToLaunch with scala.Double = js.native
  /* 0 */ val launched: launched with scala.Double = js.native
  /* 3 */ val networkFailure: networkFailure with scala.Double = js.native
  /* 2 */ val notFound: notFound with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppLaunchResult with scala.Double
  ] = js.native
}

