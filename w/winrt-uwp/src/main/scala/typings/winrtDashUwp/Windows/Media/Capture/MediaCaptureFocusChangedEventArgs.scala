package typings.winrtDashUwp.Windows.Media.Capture

import typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureFocusState
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

