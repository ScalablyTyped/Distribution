package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedMetadataTrack::CueEntered and TimedMetadataTrack::CueExited events. */
trait MediaCueEventArgs extends js.Object {
  /** Gets the cue that triggered the event. */
  var cue: IMediaCue
}

object MediaCueEventArgs {
  @scala.inline
  def apply(cue: IMediaCue): MediaCueEventArgs = {
    val __obj = js.Dynamic.literal(cue = cue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCueEventArgs]
  }
}

