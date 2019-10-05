package typings.winrtDashUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object to be used by the MediaStreamSource.SwitchStreamsRequest event to provide information to the application. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceSwitchStreamsRequest")
@js.native
abstract class MediaStreamSourceSwitchStreamsRequest () extends js.Object {
  /** Gets the stream descriptor for the stream that is now selected by the MediaStreamSource . */
  var newStreamDescriptor: IMediaStreamDescriptor = js.native
  /** Gets the stream descriptor for the stream which is no longer selected by the MediaStreamSource . */
  var oldStreamDescriptor: IMediaStreamDescriptor = js.native
  /**
    * Defers completing the MediaStreamSource.SwitchStreamsRequested event.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceSwitchStreamsRequestDeferral = js.native
}

