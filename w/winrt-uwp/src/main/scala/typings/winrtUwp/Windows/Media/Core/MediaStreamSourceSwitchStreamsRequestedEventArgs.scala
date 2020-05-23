package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaStreamSource.SwitchStreamsRequested event. */
trait MediaStreamSourceSwitchStreamsRequestedEventArgs extends js.Object {
  /** Gets the object that represents the request to switch the streams. */
  var request: MediaStreamSourceSwitchStreamsRequest
}

object MediaStreamSourceSwitchStreamsRequestedEventArgs {
  @scala.inline
  def apply(request: MediaStreamSourceSwitchStreamsRequest): MediaStreamSourceSwitchStreamsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequestedEventArgs]
  }
}

