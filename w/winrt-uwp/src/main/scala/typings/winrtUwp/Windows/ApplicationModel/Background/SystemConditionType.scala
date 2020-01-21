package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemConditionType extends js.Object

/** Specifies a system condition that must be in effect for a background task to run. If a background task with a system condition is triggered, the task will not run until the condition is met. */
@JSGlobal("Windows.ApplicationModel.Background.SystemConditionType")
@js.native
object SystemConditionType extends js.Object {
  /** Specifies that the background task can only run when the cost to do background work is low. */
  @js.native
  sealed trait backgroundWorkCostNotHigh extends SystemConditionType
  
  /** Specifies that the background task can only run when a free (non-metered) network connection is available. */
  @js.native
  sealed trait freeNetworkAvailable extends SystemConditionType
  
  /** Specifies that the background task can only run when the Internet is available. If a background task with the InternetAvailable condition is triggered, and the Internet is not available, the task will not run until the Internet is available again. */
  @js.native
  sealed trait internetAvailable extends SystemConditionType
  
  /** Specifies that the background task can only run when the Internet is not available. If a background task with the InternetNotAvailable condition is triggered, and the Internet is available, the task will not run until the Internet is unavailable. */
  @js.native
  sealed trait internetNotAvailable extends SystemConditionType
  
  /** Not a valid condition type. */
  @js.native
  sealed trait invalid extends SystemConditionType
  
  /** Specifies that the background task can only run when the user's session is connected. If a background task with the SessionConnected condition is triggered, and the user session is not logged in, the task will run when the user logs in. */
  @js.native
  sealed trait sessionConnected extends SystemConditionType
  
  /** Specifies that the background task can only run when the user's session is disconnected. If a background task with the SessionDisconnected condition is triggered, and the user is logged in, the task will run when the user logs out. */
  @js.native
  sealed trait sessionDisconnected extends SystemConditionType
  
  /** Specifies that background task can only run when the user is not present. If a background task with the UserNotPresent condition is triggered, and the user is present, the task will not run until the user becomes inactive. */
  @js.native
  sealed trait userNotPresent extends SystemConditionType
  
  /** Specifies that the background task can only run when the user is present. If a background task with the UserPresent condition is triggered, and the user is away, the task will not run until the user is present. */
  @js.native
  sealed trait userPresent extends SystemConditionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SystemConditionType with Double] = js.native
  /* 8 */ @js.native
  object backgroundWorkCostNotHigh extends TopLevel[backgroundWorkCostNotHigh with Double]
  
  /* 7 */ @js.native
  object freeNetworkAvailable extends TopLevel[freeNetworkAvailable with Double]
  
  /* 3 */ @js.native
  object internetAvailable extends TopLevel[internetAvailable with Double]
  
  /* 4 */ @js.native
  object internetNotAvailable extends TopLevel[internetNotAvailable with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 5 */ @js.native
  object sessionConnected extends TopLevel[sessionConnected with Double]
  
  /* 6 */ @js.native
  object sessionDisconnected extends TopLevel[sessionDisconnected with Double]
  
  /* 2 */ @js.native
  object userNotPresent extends TopLevel[userNotPresent with Double]
  
  /* 1 */ @js.native
  object userPresent extends TopLevel[userPresent with Double]
  
}

