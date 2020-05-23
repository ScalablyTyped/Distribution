package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object to be used by the MediaStreamSource.SwitchStreamsRequest event to provide information to the application. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceSwitchStreamsRequest")
@js.native
abstract class MediaStreamSourceSwitchStreamsRequest ()
  extends typings.winrtUwp.Windows.Media.Core.MediaStreamSourceSwitchStreamsRequest {
  /** Gets the stream descriptor for the stream that is now selected by the MediaStreamSource . */
  /* CompleteClass */
  override var newStreamDescriptor: IMediaStreamDescriptor = js.native
  /** Gets the stream descriptor for the stream which is no longer selected by the MediaStreamSource . */
  /* CompleteClass */
  override var oldStreamDescriptor: IMediaStreamDescriptor = js.native
  /**
    * Defers completing the MediaStreamSource.SwitchStreamsRequested event.
    * @return The deferral.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.Media.Core.MediaStreamSourceSwitchStreamsRequestDeferral = js.native
}

