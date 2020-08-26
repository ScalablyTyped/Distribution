package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.TextTrack.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSettingsMenuItemOptions extends TextTrackMenuItemOptions {
  var kind: Kind = js.native
}

object CaptionSettingsMenuItemOptions {
  @scala.inline
  def apply(kind: Kind, track: TextTrack): CaptionSettingsMenuItemOptions = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsMenuItemOptions]
  }
  @scala.inline
  implicit class CaptionSettingsMenuItemOptionsOps[Self <: CaptionSettingsMenuItemOptions] (val x: Self) extends AnyVal {
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
    def setKind(value: Kind): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

