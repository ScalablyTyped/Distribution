package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationTriggerResult extends js.Object

/** The result of the request to trigger a background task. The RequestAsync method returns a value of this enumeration type. */
@JSGlobal("Windows.ApplicationModel.Background.ApplicationTriggerResult")
@js.native
object ApplicationTriggerResult extends js.Object {
  /** The trigger has been set. The task will run, unless an exception is thrown in the background infrastructure. */
  @js.native
  sealed trait allowed extends ApplicationTriggerResult
  
  /** The system denied triggering the background task because it is currently running. */
  @js.native
  sealed trait currentlyRunning extends ApplicationTriggerResult
  
  /** A system policy doesn't allow this background task to be triggered. */
  @js.native
  sealed trait disabledByPolicy extends ApplicationTriggerResult
  
  /** The background task cannot be triggered because of an unknown issue. */
  @js.native
  sealed trait unknownError extends ApplicationTriggerResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationTriggerResult with Double] = js.native
  /* 0 */ @js.native
  object allowed extends TopLevel[allowed with Double]
  
  /* 1 */ @js.native
  object currentlyRunning extends TopLevel[currentlyRunning with Double]
  
  /* 2 */ @js.native
  object disabledByPolicy extends TopLevel[disabledByPolicy with Double]
  
  /* 3 */ @js.native
  object unknownError extends TopLevel[unknownError with Double]
  
}

