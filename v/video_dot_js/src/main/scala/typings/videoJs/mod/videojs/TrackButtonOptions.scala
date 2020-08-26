package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackButtonOptions extends MenuButtonOptions {
  var track: js.Array[Track] = js.native
}

object TrackButtonOptions {
  @scala.inline
  def apply(track: js.Array[Track]): TrackButtonOptions = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackButtonOptions]
  }
  @scala.inline
  implicit class TrackButtonOptionsOps[Self <: TrackButtonOptions] (val x: Self) extends AnyVal {
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
    def setTrackVarargs(value: Track*): Self = this.set("track", js.Array(value :_*))
    @scala.inline
    def setTrack(value: js.Array[Track]): Self = this.set("track", value.asInstanceOf[js.Any])
  }
  
}

