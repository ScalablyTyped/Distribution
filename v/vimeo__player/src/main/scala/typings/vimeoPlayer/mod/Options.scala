package typings.vimeoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var autopause: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[Boolean] = js.native
  var background: js.UndefOr[Boolean] = js.native
  var byline: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var dnt: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var id: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var maxheight: js.UndefOr[Double] = js.native
  var maxwidth: js.UndefOr[Double] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var playsinline: js.UndefOr[Boolean] = js.native
  var portrait: js.UndefOr[Boolean] = js.native
  var quality: js.UndefOr[VimeoVideoQuality] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var speed: js.UndefOr[Boolean] = js.native
  var texttrack: js.UndefOr[String] = js.native
  var title: js.UndefOr[Boolean] = js.native
  var transparent: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAutopause(value: Boolean): Self = this.set("autopause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutopause: Self = this.set("autopause", js.undefined)
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setByline(value: Boolean): Self = this.set("byline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByline: Self = this.set("byline", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setDnt(value: Boolean): Self = this.set("dnt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnt: Self = this.set("dnt", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMaxheight(value: Double): Self = this.set("maxheight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxheight: Self = this.set("maxheight", js.undefined)
    @scala.inline
    def setMaxwidth(value: Double): Self = this.set("maxwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxwidth: Self = this.set("maxwidth", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setPlaysinline(value: Boolean): Self = this.set("playsinline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaysinline: Self = this.set("playsinline", js.undefined)
    @scala.inline
    def setPortrait(value: Boolean): Self = this.set("portrait", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortrait: Self = this.set("portrait", js.undefined)
    @scala.inline
    def setQuality(value: VimeoVideoQuality): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setSpeed(value: Boolean): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setTexttrack(value: String): Self = this.set("texttrack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTexttrack: Self = this.set("texttrack", js.undefined)
    @scala.inline
    def setTitle(value: Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

