package typings.winrt.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BackgroundNs {
  type BackgroundTaskCanceledEventHandler = js.Function2[
    /* sender */ IBackgroundTaskInstance, 
    /* reason */ BackgroundTaskCancellationReason, 
    Unit
  ]
  type BackgroundTaskCompletedEventHandler = js.Function2[
    /* sender */ BackgroundTaskRegistration, 
    /* args */ BackgroundTaskCompletedEventArgs, 
    Unit
  ]
  type BackgroundTaskProgressEventHandler = js.Function2[
    /* sender */ BackgroundTaskRegistration, 
    /* args */ BackgroundTaskProgressEventArgs, 
    Unit
  ]
  type INetworkOperatorHotspotAuthenticationTrigger = IBackgroundTrigger
}
