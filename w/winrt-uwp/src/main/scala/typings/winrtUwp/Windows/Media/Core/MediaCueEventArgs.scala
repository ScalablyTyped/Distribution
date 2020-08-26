package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedMetadataTrack::CueEntered and TimedMetadataTrack::CueExited events. */
@js.native
trait MediaCueEventArgs extends js.Object {
  /** Gets the cue that triggered the event. */
  var cue: IMediaCue = js.native
}

object MediaCueEventArgs {
  @scala.inline
  def apply(cue: IMediaCue): MediaCueEventArgs = {
    val __obj = js.Dynamic.literal(cue = cue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCueEventArgs]
  }
  @scala.inline
  implicit class MediaCueEventArgsOps[Self <: MediaCueEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCue(value: IMediaCue): Self = this.set("cue", value.asInstanceOf[js.Any])
  }
  
}

