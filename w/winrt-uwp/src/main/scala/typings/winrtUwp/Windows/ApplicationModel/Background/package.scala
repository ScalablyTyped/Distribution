package typings.winrtUwp.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Background {
  
  /** Represents a method that handles the cancellation of a background task. */
  type BackgroundTaskCanceledEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason with typings.winrtUwp.Windows.WinRTEvent[typings.winrtUwp.Windows.ApplicationModel.Background.IBackgroundTaskInstance], 
    scala.Unit
  ]
  
  /** Represents a method that handles completion events for a background task. */
  type BackgroundTaskCompletedEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs with typings.winrtUwp.Windows.WinRTEvent[typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskRegistration], 
    scala.Unit
  ]
  
  /** Represents a method that handles progress update events for a background task. */
  type BackgroundTaskProgressEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs with typings.winrtUwp.Windows.WinRTEvent[typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskRegistration], 
    scala.Unit
  ]
}
