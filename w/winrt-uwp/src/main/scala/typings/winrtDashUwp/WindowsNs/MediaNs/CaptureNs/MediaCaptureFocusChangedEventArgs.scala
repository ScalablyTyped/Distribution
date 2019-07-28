package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

import typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the FocusChanged event. */
@JSGlobal("Windows.Media.Capture.MediaCaptureFocusChangedEventArgs")
@js.native
abstract class MediaCaptureFocusChangedEventArgs () extends js.Object {
  /** Gets the current focus state of the capture device. */
  var focusState: MediaCaptureFocusState = js.native
}

