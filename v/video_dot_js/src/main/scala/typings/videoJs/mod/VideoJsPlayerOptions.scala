package typings.videoJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.videoJs.mod.videojs.Child
import typings.videoJs.mod.videojs.ComponentOptions
import typings.videoJs.mod.videojs.ControlBarOptions
import typings.videoJs.mod.videojs.LanguageTranslations
import typings.videoJs.mod.videojs.Tech.SourceObject
import typings.videoJs.mod.videojs.TextTrackOptions
import typings.videoJs.mod.videojs.TextTrackSettingsOptions
import typings.videoJs.videoJsBooleans.`false`
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
  var plugins: js.UndefOr[js.Object] = js.undefined
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
    defaultVolume: js.UndefOr[Double] = js.undefined,
    fluid: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    html5: js.Any = null,
    inactivityTimeout: js.UndefOr[Double] = js.undefined,
    language: String = null,
    languages: StringDictionary[LanguageTranslations] = null,
    liveui: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    nativeControlsForTouch: js.UndefOr[Boolean] = js.undefined,
    notSupportedMessage: String = null,
    playbackRates: js.Array[Double] = null,
    plugins: js.Object = null,
    poster: String = null,
    preload: String = null,
    sourceOrder: js.UndefOr[Boolean] = js.undefined,
    sources: js.Array[SourceObject] = null,
    src: String = null,
    techOrder: js.Array[String] = null,
    textTrackSettings: TextTrackSettingsOptions = null,
    tracks: js.Array[TextTrackOptions] = null,
    width: js.UndefOr[Double] = js.undefined
  ): VideoJsPlayerOptions = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (controlBar != null) __obj.updateDynamic("controlBar")(controlBar.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVolume)) __obj.updateDynamic("defaultVolume")(defaultVolume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (html5 != null) __obj.updateDynamic("html5")(html5.asInstanceOf[js.Any])
    if (!js.isUndefined(inactivityTimeout)) __obj.updateDynamic("inactivityTimeout")(inactivityTimeout.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (!js.isUndefined(liveui)) __obj.updateDynamic("liveui")(liveui.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeControlsForTouch)) __obj.updateDynamic("nativeControlsForTouch")(nativeControlsForTouch.get.asInstanceOf[js.Any])
    if (notSupportedMessage != null) __obj.updateDynamic("notSupportedMessage")(notSupportedMessage.asInstanceOf[js.Any])
    if (playbackRates != null) __obj.updateDynamic("playbackRates")(playbackRates.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceOrder)) __obj.updateDynamic("sourceOrder")(sourceOrder.get.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (techOrder != null) __obj.updateDynamic("techOrder")(techOrder.asInstanceOf[js.Any])
    if (textTrackSettings != null) __obj.updateDynamic("textTrackSettings")(textTrackSettings.asInstanceOf[js.Any])
    if (tracks != null) __obj.updateDynamic("tracks")(tracks.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoJsPlayerOptions]
  }
}

