package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Media.Core.IMediaCue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedMetadataTrack::CueEntered and TimedMetadataTrack::CueExited events. */
@JSGlobal("Windows.Media.Core.MediaCueEventArgs")
@js.native
abstract class MediaCueEventArgs ()
  extends typings.winrtUwp.Windows.Media.Core.MediaCueEventArgs {
  /** Gets the cue that triggered the event. */
  /* CompleteClass */
  override var cue: IMediaCue = js.native
}

