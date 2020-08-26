package typings.videoJs.mod

import org.scalablytyped.runtime.StringDictionary
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

@js.native
trait VideoJsPlayerOptions extends ComponentOptions {
  var aspectRatio: js.UndefOr[String] = js.native
  var autoplay: js.UndefOr[Boolean | String] = js.native
  var controlBar: js.UndefOr[ControlBarOptions | `false`] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var defaultVolume: js.UndefOr[Double] = js.native
  var fluid: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var html5: js.UndefOr[js.Any] = js.native
  var inactivityTimeout: js.UndefOr[Double] = js.native
  var language: js.UndefOr[String] = js.native
  var languages: js.UndefOr[StringDictionary[LanguageTranslations]] = js.native
  var liveui: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var nativeControlsForTouch: js.UndefOr[Boolean] = js.native
  var notSupportedMessage: js.UndefOr[String] = js.native
  var playbackRates: js.UndefOr[js.Array[Double]] = js.native
  var plugins: js.UndefOr[js.Object] = js.native
  var poster: js.UndefOr[String] = js.native
  var preload: js.UndefOr[String] = js.native
  var sourceOrder: js.UndefOr[Boolean] = js.native
  var sources: js.UndefOr[js.Array[SourceObject]] = js.native
  var src: js.UndefOr[String] = js.native
  var techOrder: js.UndefOr[js.Array[String]] = js.native
  var textTrackSettings: js.UndefOr[TextTrackSettingsOptions] = js.native
  var tracks: js.UndefOr[js.Array[TextTrackOptions]] = js.native
  var width: js.UndefOr[Double] = js.native
}

object VideoJsPlayerOptions {
  @scala.inline
  def apply(): VideoJsPlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoJsPlayerOptions]
  }
  @scala.inline
  implicit class VideoJsPlayerOptionsOps[Self <: VideoJsPlayerOptions] (val x: Self) extends AnyVal {
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
    def setAspectRatio(value: String): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setAutoplay(value: Boolean | String): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setControlBar(value: ControlBarOptions | `false`): Self = this.set("controlBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlBar: Self = this.set("controlBar", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setDefaultVolume(value: Double): Self = this.set("defaultVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVolume: Self = this.set("defaultVolume", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHtml5(value: js.Any): Self = this.set("html5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml5: Self = this.set("html5", js.undefined)
    @scala.inline
    def setInactivityTimeout(value: Double): Self = this.set("inactivityTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactivityTimeout: Self = this.set("inactivityTimeout", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLanguages(value: StringDictionary[LanguageTranslations]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    @scala.inline
    def setLiveui(value: Boolean): Self = this.set("liveui", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveui: Self = this.set("liveui", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setNativeControlsForTouch(value: Boolean): Self = this.set("nativeControlsForTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeControlsForTouch: Self = this.set("nativeControlsForTouch", js.undefined)
    @scala.inline
    def setNotSupportedMessage(value: String): Self = this.set("notSupportedMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotSupportedMessage: Self = this.set("notSupportedMessage", js.undefined)
    @scala.inline
    def setPlaybackRatesVarargs(value: Double*): Self = this.set("playbackRates", js.Array(value :_*))
    @scala.inline
    def setPlaybackRates(value: js.Array[Double]): Self = this.set("playbackRates", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaybackRates: Self = this.set("playbackRates", js.undefined)
    @scala.inline
    def setPlugins(value: js.Object): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setSourceOrder(value: Boolean): Self = this.set("sourceOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceOrder: Self = this.set("sourceOrder", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: SourceObject*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[SourceObject]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setTechOrderVarargs(value: String*): Self = this.set("techOrder", js.Array(value :_*))
    @scala.inline
    def setTechOrder(value: js.Array[String]): Self = this.set("techOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTechOrder: Self = this.set("techOrder", js.undefined)
    @scala.inline
    def setTextTrackSettings(value: TextTrackSettingsOptions): Self = this.set("textTrackSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTrackSettings: Self = this.set("textTrackSettings", js.undefined)
    @scala.inline
    def setTracksVarargs(value: TextTrackOptions*): Self = this.set("tracks", js.Array(value :_*))
    @scala.inline
    def setTracks(value: js.Array[TextTrackOptions]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

