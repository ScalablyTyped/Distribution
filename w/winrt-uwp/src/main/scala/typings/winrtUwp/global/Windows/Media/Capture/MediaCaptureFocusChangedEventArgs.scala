package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Devices.MediaCaptureFocusState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the FocusChanged event. */
@JSGlobal("Windows.Media.Capture.MediaCaptureFocusChangedEventArgs")
@js.native
abstract class MediaCaptureFocusChangedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Capture.MediaCaptureFocusChangedEventArgs {
  /** Gets the current focus state of the capture device. */
  /* CompleteClass */
  override var focusState: MediaCaptureFocusState = js.native
}

