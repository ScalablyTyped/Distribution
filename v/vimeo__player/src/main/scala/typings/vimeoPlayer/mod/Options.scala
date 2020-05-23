package typings.vimeoPlayer.mod

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
    height: js.UndefOr[Double] = js.undefined,
    id: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    maxheight: js.UndefOr[Double] = js.undefined,
    maxwidth: js.UndefOr[Double] = js.undefined,
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
    width: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autopause)) __obj.updateDynamic("autopause")(autopause.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.get.asInstanceOf[js.Any])
    if (!js.isUndefined(byline)) __obj.updateDynamic("byline")(byline.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dnt)) __obj.updateDynamic("dnt")(dnt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxheight)) __obj.updateDynamic("maxheight")(maxheight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxwidth)) __obj.updateDynamic("maxwidth")(maxwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playsinline)) __obj.updateDynamic("playsinline")(playsinline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(portrait)) __obj.updateDynamic("portrait")(portrait.get.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (texttrack != null) __obj.updateDynamic("texttrack")(texttrack.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

