package typings.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autopause: js.UndefOr[Boolean] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var background: js.UndefOr[Boolean] = js.undefined
  var byline: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var dnt: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var maxheight: js.UndefOr[Double] = js.undefined
  var maxwidth: js.UndefOr[Double] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var playsinline: js.UndefOr[Boolean] = js.undefined
  var portrait: js.UndefOr[Boolean] = js.undefined
  var quality: js.UndefOr[VimeoVideoQuality] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Boolean] = js.undefined
  var texttrack: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[Boolean] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autopause: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    background: js.UndefOr[Boolean] = js.undefined,
    byline: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    dnt: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    id: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    maxheight: Int | Double = null,
    maxwidth: Int | Double = null,
    muted: js.UndefOr[Boolean] = js.undefined,
    playsinline: js.UndefOr[Boolean] = js.undefined,
    portrait: js.UndefOr[Boolean] = js.undefined,
    quality: VimeoVideoQuality = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    speed: js.UndefOr[Boolean] = js.undefined,
    texttrack: String = null,
    title: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autopause)) __obj.updateDynamic("autopause")(autopause.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(byline)) __obj.updateDynamic("byline")(byline.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(dnt)) __obj.updateDynamic("dnt")(dnt.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (maxheight != null) __obj.updateDynamic("maxheight")(maxheight.asInstanceOf[js.Any])
    if (maxwidth != null) __obj.updateDynamic("maxwidth")(maxwidth.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (!js.isUndefined(playsinline)) __obj.updateDynamic("playsinline")(playsinline.asInstanceOf[js.Any])
    if (!js.isUndefined(portrait)) __obj.updateDynamic("portrait")(portrait.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (texttrack != null) __obj.updateDynamic("texttrack")(texttrack.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

