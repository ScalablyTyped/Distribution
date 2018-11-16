package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaCapture.Failed event. */
@JSGlobal("Windows.Media.Capture.MediaCaptureFailedEventArgs")
@js.native
abstract class MediaCaptureFailedEventArgs () extends js.Object {
  /** The error code of the error that caused the event. */
  var code: scala.Double = js.native
  /** A message string for the error. */
  var message: java.lang.String = js.native
}

