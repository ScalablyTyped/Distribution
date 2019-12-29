package typings.winrtDashUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
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
  sealed trait allowed extends MediaProcessingTriggerResult
  
  /** The media processing background task is currently running. */
  @js.native
  sealed trait currentlyRunning extends MediaProcessingTriggerResult
  
  /** The media processing trigger is disabled by policy on the device. */
  @js.native
  sealed trait disabledByPolicy extends MediaProcessingTriggerResult
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError extends MediaProcessingTriggerResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaProcessingTriggerResult with Double] = js.native
  /* 0 */ @js.native
  object allowed extends TopLevel[allowed with Double]
  
  /* 1 */ @js.native
  object currentlyRunning extends TopLevel[currentlyRunning with Double]
  
  /* 2 */ @js.native
  object disabledByPolicy extends TopLevel[disabledByPolicy with Double]
  
  /* 3 */ @js.native
  object unknownError extends TopLevel[unknownError with Double]
  
}

