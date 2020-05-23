package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AutoRepeatModeChangeRequested event. */
trait AutoRepeatModeChangeRequestedEventArgs extends js.Object {
  /** Gets a value indicating the requested auto-repeat mode. */
  var requestedAutoRepeatMode: MediaPlaybackAutoRepeatMode
}

object AutoRepeatModeChangeRequestedEventArgs {
  @scala.inline
  def apply(requestedAutoRepeatMode: MediaPlaybackAutoRepeatMode): AutoRepeatModeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedAutoRepeatMode = requestedAutoRepeatMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRepeatModeChangeRequestedEventArgs]
  }
}

