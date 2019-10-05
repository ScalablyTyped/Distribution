package typings.winrt.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Capture {
  type MediaCaptureFailedEventHandler = js.Function2[/* sender */ MediaCapture, /* errorEventArgs */ MediaCaptureFailedEventArgs, Unit]
  type RecordLimitationExceededEventHandler = js.Function1[/* sender */ MediaCapture, Unit]
}
