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
  
  val failedToLaunch: failedToLaunch with java.lang.String = js.native
  val launched: launched with java.lang.String = js.native
  val networkFailure: networkFailure with java.lang.String = js.native
  val notFound: notFound with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialAppLaunchResult with java.lang.String
  ] = js.native
}

