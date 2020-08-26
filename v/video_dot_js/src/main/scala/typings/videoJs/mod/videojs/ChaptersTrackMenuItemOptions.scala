package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaptersTrackMenuItemOptions extends MenuItemOptions {
  var cue: TextTrackCue = js.native
  var track: TextTrack = js.native
}

object ChaptersTrackMenuItemOptions {
  @scala.inline
  def apply(cue: TextTrackCue, track: TextTrack): ChaptersTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal(cue = cue.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChaptersTrackMenuItemOptions]
  }
  @scala.inline
  implicit class ChaptersTrackMenuItemOptionsOps[Self <: ChaptersTrackMenuItemOptions] (val x: Self) extends AnyVal {
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
    def setCue(value: TextTrackCue): Self = this.set("cue", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack(value: TextTrack): Self = this.set("track", value.asInstanceOf[js.Any])
  }
  
}

