package typings.winrtUwp.global.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video track. */
@JSGlobal("Windows.Media.Core.VideoTrack")
@js.native
abstract class VideoTrack ()
  extends typings.winrtUwp.Windows.Media.Core.VideoTrack {
  /** Gets or sets the identifier for the video track. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets or sets the label for the video track. */
  /* CompleteClass */
  override var label: String = js.native
  /** Gets or sets a string indicating the language of the video track. */
  /* CompleteClass */
  override var language: String = js.native
  /** Gets a value indicating the type of data the track contains. For VideoTrack objects, this value is always MediaTrackKind::Video . */
  /* CompleteClass */
  override var trackKind: typings.winrtUwp.Windows.Media.Core.MediaTrackKind = js.native
}

