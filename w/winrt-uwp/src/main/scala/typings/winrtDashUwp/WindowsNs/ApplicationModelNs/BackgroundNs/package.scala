package typings.winrtDashUwp.WindowsNs.ApplicationModelNs

import typings.winrtDashUwp.WindowsNs.WinRTEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BackgroundNs {
  /** Represents a method that handles the cancellation of a background task. */
  type BackgroundTaskCanceledEventHandler = js.Function1[
    /* ev */ BackgroundTaskCancellationReason with WinRTEvent[IBackgroundTaskInstance], 
    Unit
  ]
  /** Represents a method that handles completion events for a background task. */
  type BackgroundTaskCompletedEventHandler = js.Function1[
    /* ev */ BackgroundTaskCompletedEventArgs with WinRTEvent[BackgroundTaskRegistration], 
    Unit
  ]
  /** Represents a method that handles progress update events for a background task. */
  type BackgroundTaskProgressEventHandler = js.Function1[
    /* ev */ BackgroundTaskProgressEventArgs with WinRTEvent[BackgroundTaskRegistration], 
    Unit
  ]
}
