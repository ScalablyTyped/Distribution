package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CaptureNs {
  /** Represents the method that will handle the MediaCapture.Failed event. */
  type MediaCaptureFailedEventHandler = js.Function1[
    /* ev */ MediaCaptureFailedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaCapture], 
    scala.Unit
  ]
  /** Represents the method that will handle RecordLimitationExceeded and related events. */
  type RecordLimitationExceededEventHandler = js.Function1[/* ev */ winrtDashUwpLib.WindowsNs.WinRTEvent[MediaCapture], scala.Unit]
}
