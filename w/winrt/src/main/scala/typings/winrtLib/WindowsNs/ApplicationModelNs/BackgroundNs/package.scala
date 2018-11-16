package typings
package winrtLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BackgroundNs {
  type BackgroundTaskCanceledEventHandler = js.Function2[
    /* sender */ IBackgroundTaskInstance, 
    /* reason */ BackgroundTaskCancellationReason, 
    scala.Unit
  ]
  type BackgroundTaskCompletedEventHandler = js.Function2[
    /* sender */ BackgroundTaskRegistration, 
    /* args */ BackgroundTaskCompletedEventArgs, 
    scala.Unit
  ]
  type BackgroundTaskProgressEventHandler = js.Function2[
    /* sender */ BackgroundTaskRegistration, 
    /* args */ BackgroundTaskProgressEventArgs, 
    scala.Unit
  ]
  type INetworkOperatorHotspotAuthenticationTrigger = IBackgroundTrigger
}
