package typings.winrt.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Capture {
  type MediaCaptureFailedEventHandler = js.Function2[
    /* sender */ typings.winrt.Windows.Media.Capture.MediaCapture, 
    /* errorEventArgs */ typings.winrt.Windows.Media.Capture.MediaCaptureFailedEventArgs, 
    scala.Unit
  ]
  type RecordLimitationExceededEventHandler = js.Function1[/* sender */ typings.winrt.Windows.Media.Capture.MediaCapture, scala.Unit]
}
