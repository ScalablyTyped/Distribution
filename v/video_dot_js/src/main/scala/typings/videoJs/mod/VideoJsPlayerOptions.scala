package typings.videoJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.videoJs.mod.videojs.ComponentOptions
import typings.videoJs.mod.videojs.ControlBarOptions
import typings.videoJs.mod.videojs.LanguageTranslations
import typings.videoJs.mod.videojs.Tech.SourceObject
import typings.videoJs.mod.videojs.TextTrackOptions
import typings.videoJs.mod.videojs.TextTrackSettingsOptions
import typings.videoJs.videoJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoJsPlayerOptions
  extends StObject
     with ComponentOptions {
  
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
  def apply(): VideoJsPlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoJsPlayerOptions]
  }
  
  @scala.inline
  implicit class VideoJsPlayerOptionsMutableBuilder[Self <: VideoJsPlayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean | String): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setControlBar(value: ControlBarOptions | `false`): Self = StObject.set(x, "controlBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlBarUndefined: Self = StObject.set(x, "controlBar", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setDefaultVolume(value: Double): Self = StObject.set(x, "defaultVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVolumeUndefined: Self = StObject.set(x, "defaultVolume", js.undefined)
    
    @scala.inline
    def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHtml5(value: js.Any): Self = StObject.set(x, "html5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml5Undefined: Self = StObject.set(x, "html5", js.undefined)
    
    @scala.inline
    def setInactivityTimeout(value: Double): Self = StObject.set(x, "inactivityTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactivityTimeoutUndefined: Self = StObject.set(x, "inactivityTimeout", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLanguages(value: StringDictionary[LanguageTranslations]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLiveui(value: Boolean): Self = StObject.set(x, "liveui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveuiUndefined: Self = StObject.set(x, "liveui", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setNativeControlsForTouch(value: Boolean): Self = StObject.set(x, "nativeControlsForTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeControlsForTouchUndefined: Self = StObject.set(x, "nativeControlsForTouch", js.undefined)
    
    @scala.inline
    def setNotSupportedMessage(value: String): Self = StObject.set(x, "notSupportedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSupportedMessageUndefined: Self = StObject.set(x, "notSupportedMessage", js.undefined)
    
    @scala.inline
    def setPlaybackRates(value: js.Array[Double]): Self = StObject.set(x, "playbackRates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRatesUndefined: Self = StObject.set(x, "playbackRates", js.undefined)
    
    @scala.inline
    def setPlaybackRatesVarargs(value: Double*): Self = StObject.set(x, "playbackRates", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Object): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    @scala.inline
    def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setSourceOrder(value: Boolean): Self = StObject.set(x, "sourceOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceOrderUndefined: Self = StObject.set(x, "sourceOrder", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[SourceObject]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: SourceObject*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setTechOrder(value: js.Array[String]): Self = StObject.set(x, "techOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechOrderUndefined: Self = StObject.set(x, "techOrder", js.undefined)
    
    @scala.inline
    def setTechOrderVarargs(value: String*): Self = StObject.set(x, "techOrder", js.Array(value :_*))
    
    @scala.inline
    def setTextTrackSettings(value: TextTrackSettingsOptions): Self = StObject.set(x, "textTrackSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTrackSettingsUndefined: Self = StObject.set(x, "textTrackSettings", js.undefined)
    
    @scala.inline
    def setTracks(value: js.Array[TextTrackOptions]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: TextTrackOptions*): Self = StObject.set(x, "tracks", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
