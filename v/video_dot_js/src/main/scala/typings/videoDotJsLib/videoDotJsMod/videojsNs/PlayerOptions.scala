package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerOptions extends ComponentOptions {
  var aspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var autoplay: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var controlBar: js.UndefOr[ControlBarOptions | videoDotJsLib.videoDotJsLibNumbers.`false`] = js.undefined
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var defaultVolume: js.UndefOr[scala.Double] = js.undefined
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var html5: js.UndefOr[js.Any] = js.undefined
  var inactivityTimeout: js.UndefOr[scala.Double] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var languages: js.UndefOr[org.scalablytyped.runtime.StringDictionary[LanguageTranslations]] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  var nativeControlsForTouch: js.UndefOr[scala.Boolean] = js.undefined
  var notSupportedMessage: js.UndefOr[java.lang.String] = js.undefined
  var playbackRates: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var plugins: js.UndefOr[js.Any] = js.undefined
  var poster: js.UndefOr[java.lang.String] = js.undefined
  var preload: js.UndefOr[java.lang.String] = js.undefined
  var sourceOrder: js.UndefOr[scala.Boolean] = js.undefined
  var sources: js.UndefOr[js.Array[videoDotJsLib.videoDotJsMod.videojsNs.TechNs.SourceObject]] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var techOrder: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var textTrackSettings: js.UndefOr[TextTrackSettingsOptions] = js.undefined
  var tracks: js.UndefOr[js.Array[TextTrackOptions]] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PlayerOptions {
  @scala.inline
  def apply(
    aspectRatio: java.lang.String = null,
    autoplay: scala.Boolean | java.lang.String = null,
    children: js.Array[Child] = null,
    controlBar: ControlBarOptions | videoDotJsLib.videoDotJsLibNumbers.`false` = null,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    defaultVolume: scala.Int | scala.Double = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    html5: js.Any = null,
    inactivityTimeout: scala.Int | scala.Double = null,
    language: java.lang.String = null,
    languages: org.scalablytyped.runtime.StringDictionary[LanguageTranslations] = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    nativeControlsForTouch: js.UndefOr[scala.Boolean] = js.undefined,
    notSupportedMessage: java.lang.String = null,
    playbackRates: js.Array[scala.Double] = null,
    plugins: js.Any = null,
    poster: java.lang.String = null,
    preload: java.lang.String = null,
    sourceOrder: js.UndefOr[scala.Boolean] = js.undefined,
    sources: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.TechNs.SourceObject] = null,
    src: java.lang.String = null,
    techOrder: js.Array[java.lang.String] = null,
    textTrackSettings: TextTrackSettingsOptions = null,
    tracks: js.Array[TextTrackOptions] = null,
    width: scala.Int | scala.Double = null
  ): PlayerOptions = {
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
    __obj.asInstanceOf[PlayerOptions]
  }
}

