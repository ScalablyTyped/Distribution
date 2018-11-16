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
  
  val allowed: allowed with java.lang.String = js.native
  val currentlyRunning: currentlyRunning with java.lang.String = js.native
  val disabledByPolicy: disabledByPolicy with java.lang.String = js.native
  val unknownError: unknownError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.MediaProcessingTriggerResult with java.lang.String
  ] = js.native
}

