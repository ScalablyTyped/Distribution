package typings.videoDotJs.videoDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.videoDotJs.videoDotJsMod.videojs.Child
import typings.videoDotJs.videoDotJsMod.videojs.ComponentOptions
import typings.videoDotJs.videoDotJsMod.videojs.ControlBarOptions
import typings.videoDotJs.videoDotJsMod.videojs.LanguageTranslations
import typings.videoDotJs.videoDotJsMod.videojs.Tech.SourceObject
import typings.videoDotJs.videoDotJsMod.videojs.TextTrackOptions
import typings.videoDotJs.videoDotJsMod.videojs.TextTrackSettingsOptions
import typings.videoDotJs.videoDotJsNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoJsPlayerOptions extends ComponentOptions {
  var aspectRatio: js.UndefOr[String] = js.undefined
  var autoplay: js.UndefOr[Boolean | String] = js.undefined
  var controlBar: js.UndefOr[ControlBarOptions | `false`] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var defaultVolume: js.UndefOr[Double] = js.undefined
  var fluid: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var html5: js.UndefOr[js.Any] = js.undefined
  var inactivityTimeout: js.UndefOr[Double] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var languages: js.UndefOr[StringDictionary[LanguageTranslations]] = js.undefined
  var liveui: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var nativeControlsForTouch: js.UndefOr[Boolean] = js.undefined
  var notSupportedMessage: js.UndefOr[String] = js.undefined
  var playbackRates: js.UndefOr[js.Array[Double]] = js.undefined
  var plugins: js.UndefOr[Partial[VideoJsPlayerPluginOptions]] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var sourceOrder: js.UndefOr[Boolean] = js.undefined
  var sources: js.UndefOr[js.Array[SourceObject]] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var techOrder: js.UndefOr[js.Array[String]] = js.undefined
  var textTrackSettings: js.UndefOr[TextTrackSettingsOptions] = js.undefined
  var tracks: js.UndefOr[js.Array[TextTrackOptions]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object VideoJsPlayerOptions {
  @scala.inline
  def apply(
    aspectRatio: String = null,
    autoplay: Boolean | String = null,
    children: js.Array[Child] = null,
    controlBar: ControlBarOptions | `false` = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    defaultVolume: Int | Double = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    html5: js.Any = null,
    inactivityTimeout: Int | Double = null,
    language: String = null,
    languages: StringDictionary[LanguageTranslations] = null,
    liveui: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    nativeControlsForTouch: js.UndefOr[Boolean] = js.undefined,
    notSupportedMessage: String = null,
    playbackRates: js.Array[Double] = null,
    plugins: Partial[VideoJsPlayerPluginOptions] = null,
    poster: String = null,
    preload: String = null,
    sourceOrder: js.UndefOr[Boolean] = js.undefined,
    sources: js.Array[SourceObject] = null,
    src: String = null,
    techOrder: js.Array[String] = null,
    textTrackSettings: TextTrackSettingsOptions = null,
    tracks: js.Array[TextTrackOptions] = null,
    width: Int | Double = null
  ): VideoJsPlayerOptions = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (controlBar != null) __obj.updateDynamic("controlBar")(controlBar.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (defaultVolume != null) __obj.updateDynamic("defaultVolume")(defaultVolume.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (html5 != null) __obj.updateDynamic("html5")(html5)
    if (inactivityTimeout != null) __obj.updateDynamic("inactivityTimeout")(inactivityTimeout.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (!js.isUndefined(liveui)) __obj.updateDynamic("liveui")(liveui)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (!js.isUndefined(nativeControlsForTouch)) __obj.updateDynamic("nativeControlsForTouch")(nativeControlsForTouch)
    if (notSupportedMessage != null) __obj.updateDynamic("notSupportedMessage")(notSupportedMessage)
    if (playbackRates != null) __obj.updateDynamic("playbackRates")(playbackRates)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (!js.isUndefined(sourceOrder)) __obj.updateDynamic("sourceOrder")(sourceOrder)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (src != null) __obj.updateDynamic("src")(src)
    if (techOrder != null) __obj.updateDynamic("techOrder")(techOrder)
    if (textTrackSettings != null) __obj.updateDynamic("textTrackSettings")(textTrackSettings)
    if (tracks != null) __obj.updateDynamic("tracks")(tracks)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoJsPlayerOptions]
  }
}

