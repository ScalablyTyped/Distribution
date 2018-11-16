package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

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
  sealed trait allowed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.ApplicationTriggerResult
  
  /** The system denied triggering the background task because it is currently running. */
  @js.native
  sealed trait currentlyRunning
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.ApplicationTriggerResult
  
  /** A system policy doesn't allow this background task to be triggered. */
  @js.native
  sealed trait disabledByPolicy
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.ApplicationTriggerResult
  
  /** The background task cannot be triggered because of an unknown issue. */
  @js.native
  sealed trait unknownError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.ApplicationTriggerResult
  
  val allowed: allowed with java.lang.String = js.native
  val currentlyRunning: currentlyRunning with java.lang.String = js.native
  val disabledByPolicy: disabledByPolicy with java.lang.String = js.native
  val unknownError: unknownError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.ApplicationTriggerResult with java.lang.String
  ] = js.native
}

