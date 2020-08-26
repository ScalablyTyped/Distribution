package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.TextTrack.Kind
import typings.videoJs.mod.videojs.TextTrack.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackOptions extends TrackOptions {
  var default: js.UndefOr[Boolean] = js.native
  @JSName("kind")
  var kind_TextTrackOptions: js.UndefOr[Kind] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var src: js.UndefOr[String] = js.native
  var srclang: js.UndefOr[String] = js.native
  var tech: js.UndefOr[Tech] = js.native
}

object TextTrackOptions {
  @scala.inline
  def apply(): TextTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTrackOptions]
  }
  @scala.inline
  implicit class TextTrackOptionsOps[Self <: TextTrackOptions] (val x: Self) extends AnyVal {
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
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setKind(value: Kind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setSrclang(value: String): Self = this.set("srclang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrclang: Self = this.set("srclang", js.undefined)
    @scala.inline
    def setTech(value: Tech): Self = this.set("tech", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTech: Self = this.set("tech", js.undefined)
  }
  
}

