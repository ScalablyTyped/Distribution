package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Devices.MediaCaptureFocusState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the FocusChanged event. */
trait MediaCaptureFocusChangedEventArgs extends js.Object {
  /** Gets the current focus state of the capture device. */
  var focusState: MediaCaptureFocusState
}

object MediaCaptureFocusChangedEventArgs {
  @scala.inline
  def apply(focusState: MediaCaptureFocusState): MediaCaptureFocusChangedEventArgs = {
    val __obj = js.Dynamic.literal(focusState = focusState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureFocusChangedEventArgs]
  }
}

