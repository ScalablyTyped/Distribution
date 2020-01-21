package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaStreamSource.SwitchStreamsRequested event. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceSwitchStreamsRequestedEventArgs")
@js.native
abstract class MediaStreamSourceSwitchStreamsRequestedEventArgs () extends js.Object {
  /** Gets the object that represents the request to switch the streams. */
  var request: MediaStreamSourceSwitchStreamsRequest = js.native
}

