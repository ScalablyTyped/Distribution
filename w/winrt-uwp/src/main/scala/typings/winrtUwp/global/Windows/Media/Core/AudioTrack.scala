package typings.winrtUwp.global.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio track. */
@JSGlobal("Windows.Media.Core.AudioTrack")
@js.native
abstract class AudioTrack ()
  extends typings.winrtUwp.Windows.Media.Core.AudioTrack {
  /** Gets or sets the identifier for the audio track. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets or sets the label for the audio track. */
  /* CompleteClass */
  override var label: String = js.native
  /** Gets or sets a string indicating the language of the audio track. */
  /* CompleteClass */
  override var language: String = js.native
  /** Gets a value indicating the type of data the track contains. For AudioTrack objects, this value is always MediaTrackKind::Audio . */
  /* CompleteClass */
  override var trackKind: typings.winrtUwp.Windows.Media.Core.MediaTrackKind = js.native
}

