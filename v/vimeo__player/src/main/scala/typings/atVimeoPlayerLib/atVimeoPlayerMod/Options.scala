package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autopause: js.UndefOr[scala.Boolean] = js.undefined
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var background: js.UndefOr[scala.Boolean] = js.undefined
  var byline: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var dnt: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[scala.Double] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var maxheight: js.UndefOr[scala.Double] = js.undefined
  var maxwidth: js.UndefOr[scala.Double] = js.undefined
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  var playsinline: js.UndefOr[scala.Boolean] = js.undefined
  var portrait: js.UndefOr[scala.Boolean] = js.undefined
  var quality: js.UndefOr[VimeoVideoQuality] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var speed: js.UndefOr[scala.Boolean] = js.undefined
  var texttrack: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[scala.Boolean] = js.undefined
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autopause: js.UndefOr[scala.Boolean] = js.undefined,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    background: js.UndefOr[scala.Boolean] = js.undefined,
    byline: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    dnt: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    id: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    maxheight: scala.Int | scala.Double = null,
    maxwidth: scala.Int | scala.Double = null,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    playsinline: js.UndefOr[scala.Boolean] = js.undefined,
    portrait: js.UndefOr[scala.Boolean] = js.undefined,
    quality: VimeoVideoQuality = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    speed: js.UndefOr[scala.Boolean] = js.undefined,
    texttrack: java.lang.String = null,
    title: js.UndefOr[scala.Boolean] = js.undefined,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autopause)) __obj.updateDynamic("autopause")(autopause)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (!js.isUndefined(byline)) __obj.updateDynamic("byline")(byline)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (!js.isUndefined(dnt)) __obj.updateDynamic("dnt")(dnt)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (maxheight != null) __obj.updateDynamic("maxheight")(maxheight.asInstanceOf[js.Any])
    if (maxwidth != null) __obj.updateDynamic("maxwidth")(maxwidth.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (!js.isUndefined(playsinline)) __obj.updateDynamic("playsinline")(playsinline)
    if (!js.isUndefined(portrait)) __obj.updateDynamic("portrait")(portrait)
    if (quality != null) __obj.updateDynamic("quality")(quality)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed)
    if (texttrack != null) __obj.updateDynamic("texttrack")(texttrack)
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

