package typings.winrtDashUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialAppLaunchResult with Double] = js.native
  /* 1 */ @js.native
  object failedToLaunch extends TopLevel[failedToLaunch with Double]
  
  /* 0 */ @js.native
  object launched extends TopLevel[launched with Double]
  
  /* 3 */ @js.native
  object networkFailure extends TopLevel[networkFailure with Double]
  
  /* 2 */ @js.native
  object notFound extends TopLevel[notFound with Double]
  
}

