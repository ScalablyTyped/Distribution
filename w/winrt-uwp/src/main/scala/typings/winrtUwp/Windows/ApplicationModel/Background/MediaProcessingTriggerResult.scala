package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaProcessingTriggerResult extends StObject
/** Specifies the result of a call to MediaProcessingTrigger::RequestAsync . */
@JSGlobal("Windows.ApplicationModel.Background.MediaProcessingTriggerResult")
@js.native
object MediaProcessingTriggerResult extends StObject {
  
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
}
