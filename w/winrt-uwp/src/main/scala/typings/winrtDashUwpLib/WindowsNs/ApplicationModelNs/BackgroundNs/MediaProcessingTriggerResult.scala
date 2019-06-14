package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaProcessingTriggerResult extends js.Object

/** Specifies the result of a call to MediaProcessingTrigger::RequestAsync . */
@JSGlobal("Windows.ApplicationModel.Background.MediaProcessingTriggerResult")
@js.native
object MediaProcessingTriggerResult extends js.Object {
  /** The media processing trigger request was successful. */
  @js.native
  sealed trait allowed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.MediaProcessingTriggerResult
  
  /** The media processing background task is currently running. */
  @js.native
  sealed trait currentlyRunning
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.MediaProcessingTriggerResult
  
  /** The media processing trigger is disabled by policy on the device. */
  @js.native
  sealed trait disabledByPolicy
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.MediaProcessingTriggerResult
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.MediaProcessingTriggerResult
  
  /* 0 */ val allowed: allowed with scala.Double = js.native
  /* 1 */ val currentlyRunning: currentlyRunning with scala.Double = js.native
  /* 2 */ val disabledByPolicy: disabledByPolicy with scala.Double = js.native
  /* 3 */ val unknownError: unknownError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.MediaProcessingTriggerResult with scala.Double
  ] = js.native
}

