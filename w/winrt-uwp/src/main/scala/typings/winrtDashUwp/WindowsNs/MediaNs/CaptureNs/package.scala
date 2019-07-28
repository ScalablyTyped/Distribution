package typings.winrtDashUwp.WindowsNs.MediaNs

import typings.winrtDashUwp.WindowsNs.WinRTEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CaptureNs {
  /** Represents the method that will handle the MediaCapture.Failed event. */
  type MediaCaptureFailedEventHandler = js.Function1[/* ev */ MediaCaptureFailedEventArgs with WinRTEvent[MediaCapture], Unit]
  /** Represents the method that will handle RecordLimitationExceeded and related events. */
  type RecordLimitationExceededEventHandler = js.Function1[/* ev */ WinRTEvent[MediaCapture], Unit]
}
