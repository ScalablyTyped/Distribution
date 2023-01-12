package typings.videoJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.videoJs.anon.LiveTolerance
import typings.videoJs.anon.Options
import typings.videoJs.anon.PartialBreakpoint
import typings.videoJs.mod.videojs.Autoplay
import typings.videoJs.mod.videojs.ComponentOptions
import typings.videoJs.mod.videojs.ControlBarOptions
import typings.videoJs.mod.videojs.LanguageTranslations
import typings.videoJs.mod.videojs.Preload
import typings.videoJs.mod.videojs.Tech.SourceObject
import typings.videoJs.mod.videojs.TextTrackOptions
import typings.videoJs.mod.videojs.TextTrackSettingsOptions
import typings.videoJs.mod.videojs.UserActions
import typings.videoJs.videoJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoJsPlayerOptions
  extends StObject
     with ComponentOptions {
  
  var aspectRatio: js.UndefOr[String] = js.undefined
  
  var audioOnlyMode: js.UndefOr[Boolean] = js.undefined
  
  var audioPosterMode: js.UndefOr[Boolean] = js.undefined
  
  var autoSetup: js.UndefOr[Boolean] = js.undefined
  
  var autoplay: js.UndefOr[Autoplay] = js.undefined
  
  var bigPlayButton: js.UndefOr[Boolean] = js.undefined
  
  var breakpoints: js.UndefOr[PartialBreakpoint] = js.undefined
  
  var controlBar: js.UndefOr[ControlBarOptions | `false`] = js.undefined
  
  var controls: js.UndefOr[Boolean] = js.undefined
  
  var defaultVolume: js.UndefOr[Double] = js.undefined
  
  var disablePictureInPicture: js.UndefOr[Boolean] = js.undefined
  
  var enableSourceset: js.UndefOr[Boolean] = js.undefined
  
  var fill: js.UndefOr[Boolean] = js.undefined
  
  var fluid: js.UndefOr[Boolean] = js.undefined
  
  var fullscreen: js.UndefOr[Options] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var html5: js.UndefOr[Any] = js.undefined
  
  var inactivityTimeout: js.UndefOr[Double] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var languages: js.UndefOr[StringDictionary[LanguageTranslations]] = js.undefined
  
  var liveTracker: js.UndefOr[LiveTolerance] = js.undefined
  
  var liveui: js.UndefOr[Boolean] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var muted: js.UndefOr[Boolean] = js.undefined
  
  var nativeControlsForTouch: js.UndefOr[Boolean] = js.undefined
  
  var noUITitleAttributes: js.UndefOr[Boolean] = js.undefined
  
  var normalizeAutoplay: js.UndefOr[Boolean] = js.undefined
  
  var notSupportedMessage: js.UndefOr[String] = js.undefined
  
  var playbackRates: js.UndefOr[js.Array[Double]] = js.undefined
  
  var playsinline: js.UndefOr[Boolean] = js.undefined
  
  var plugins: js.UndefOr[js.Object] = js.undefined
  
  var poster: js.UndefOr[String] = js.undefined
  
  var preferFullWindow: js.UndefOr[Boolean] = js.undefined
  
  var preload: js.UndefOr[Preload] = js.undefined
  
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  var restoreEl: js.UndefOr[Boolean | Element] = js.undefined
  
  var retryOnError: js.UndefOr[Boolean] = js.undefined
  
  var sourceOrder: js.UndefOr[Boolean] = js.undefined
  
  var sources: js.UndefOr[js.Array[SourceObject]] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var suppressNotSupportedError: js.UndefOr[Boolean] = js.undefined
  
  var techCanOverridePoster: js.UndefOr[Boolean] = js.undefined
  
  var techOrder: js.UndefOr[js.Array[String]] = js.undefined
  
  var textTrackSettings: js.UndefOr[TextTrackSettingsOptions] = js.undefined
  
  var tracks: js.UndefOr[js.Array[TextTrackOptions]] = js.undefined
  
  var userActions: js.UndefOr[UserActions] = js.undefined
  
  @JSName("vtt.js")
  var vttDotjs: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object VideoJsPlayerOptions {
  
  inline def apply(): VideoJsPlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoJsPlayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoJsPlayerOptions] (val x: Self) extends AnyVal {
    
    inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setAudioOnlyMode(value: Boolean): Self = StObject.set(x, "audioOnlyMode", value.asInstanceOf[js.Any])
    
    inline def setAudioOnlyModeUndefined: Self = StObject.set(x, "audioOnlyMode", js.undefined)
    
    inline def setAudioPosterMode(value: Boolean): Self = StObject.set(x, "audioPosterMode", value.asInstanceOf[js.Any])
    
    inline def setAudioPosterModeUndefined: Self = StObject.set(x, "audioPosterMode", js.undefined)
    
    inline def setAutoSetup(value: Boolean): Self = StObject.set(x, "autoSetup", value.asInstanceOf[js.Any])
    
    inline def setAutoSetupUndefined: Self = StObject.set(x, "autoSetup", js.undefined)
    
    inline def setAutoplay(value: Autoplay): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setBigPlayButton(value: Boolean): Self = StObject.set(x, "bigPlayButton", value.asInstanceOf[js.Any])
    
    inline def setBigPlayButtonUndefined: Self = StObject.set(x, "bigPlayButton", js.undefined)
    
    inline def setBreakpoints(value: PartialBreakpoint): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setControlBar(value: ControlBarOptions | `false`): Self = StObject.set(x, "controlBar", value.asInstanceOf[js.Any])
    
    inline def setControlBarUndefined: Self = StObject.set(x, "controlBar", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setDefaultVolume(value: Double): Self = StObject.set(x, "defaultVolume", value.asInstanceOf[js.Any])
    
    inline def setDefaultVolumeUndefined: Self = StObject.set(x, "defaultVolume", js.undefined)
    
    inline def setDisablePictureInPicture(value: Boolean): Self = StObject.set(x, "disablePictureInPicture", value.asInstanceOf[js.Any])
    
    inline def setDisablePictureInPictureUndefined: Self = StObject.set(x, "disablePictureInPicture", js.undefined)
    
    inline def setEnableSourceset(value: Boolean): Self = StObject.set(x, "enableSourceset", value.asInstanceOf[js.Any])
    
    inline def setEnableSourcesetUndefined: Self = StObject.set(x, "enableSourceset", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
    
    inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
    
    inline def setFullscreen(value: Options): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHtml5(value: Any): Self = StObject.set(x, "html5", value.asInstanceOf[js.Any])
    
    inline def setHtml5Undefined: Self = StObject.set(x, "html5", js.undefined)
    
    inline def setInactivityTimeout(value: Double): Self = StObject.set(x, "inactivityTimeout", value.asInstanceOf[js.Any])
    
    inline def setInactivityTimeoutUndefined: Self = StObject.set(x, "inactivityTimeout", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLanguages(value: StringDictionary[LanguageTranslations]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLiveTracker(value: LiveTolerance): Self = StObject.set(x, "liveTracker", value.asInstanceOf[js.Any])
    
    inline def setLiveTrackerUndefined: Self = StObject.set(x, "liveTracker", js.undefined)
    
    inline def setLiveui(value: Boolean): Self = StObject.set(x, "liveui", value.asInstanceOf[js.Any])
    
    inline def setLiveuiUndefined: Self = StObject.set(x, "liveui", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setNativeControlsForTouch(value: Boolean): Self = StObject.set(x, "nativeControlsForTouch", value.asInstanceOf[js.Any])
    
    inline def setNativeControlsForTouchUndefined: Self = StObject.set(x, "nativeControlsForTouch", js.undefined)
    
    inline def setNoUITitleAttributes(value: Boolean): Self = StObject.set(x, "noUITitleAttributes", value.asInstanceOf[js.Any])
    
    inline def setNoUITitleAttributesUndefined: Self = StObject.set(x, "noUITitleAttributes", js.undefined)
    
    inline def setNormalizeAutoplay(value: Boolean): Self = StObject.set(x, "normalizeAutoplay", value.asInstanceOf[js.Any])
    
    inline def setNormalizeAutoplayUndefined: Self = StObject.set(x, "normalizeAutoplay", js.undefined)
    
    inline def setNotSupportedMessage(value: String): Self = StObject.set(x, "notSupportedMessage", value.asInstanceOf[js.Any])
    
    inline def setNotSupportedMessageUndefined: Self = StObject.set(x, "notSupportedMessage", js.undefined)
    
    inline def setPlaybackRates(value: js.Array[Double]): Self = StObject.set(x, "playbackRates", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRatesUndefined: Self = StObject.set(x, "playbackRates", js.undefined)
    
    inline def setPlaybackRatesVarargs(value: Double*): Self = StObject.set(x, "playbackRates", js.Array(value*))
    
    inline def setPlaysinline(value: Boolean): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
    
    inline def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
    
    inline def setPlugins(value: js.Object): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setPreferFullWindow(value: Boolean): Self = StObject.set(x, "preferFullWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferFullWindowUndefined: Self = StObject.set(x, "preferFullWindow", js.undefined)
    
    inline def setPreload(value: Preload): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setRestoreEl(value: Boolean | Element): Self = StObject.set(x, "restoreEl", value.asInstanceOf[js.Any])
    
    inline def setRestoreElUndefined: Self = StObject.set(x, "restoreEl", js.undefined)
    
    inline def setRetryOnError(value: Boolean): Self = StObject.set(x, "retryOnError", value.asInstanceOf[js.Any])
    
    inline def setRetryOnErrorUndefined: Self = StObject.set(x, "retryOnError", js.undefined)
    
    inline def setSourceOrder(value: Boolean): Self = StObject.set(x, "sourceOrder", value.asInstanceOf[js.Any])
    
    inline def setSourceOrderUndefined: Self = StObject.set(x, "sourceOrder", js.undefined)
    
    inline def setSources(value: js.Array[SourceObject]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SourceObject*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSuppressNotSupportedError(value: Boolean): Self = StObject.set(x, "suppressNotSupportedError", value.asInstanceOf[js.Any])
    
    inline def setSuppressNotSupportedErrorUndefined: Self = StObject.set(x, "suppressNotSupportedError", js.undefined)
    
    inline def setTechCanOverridePoster(value: Boolean): Self = StObject.set(x, "techCanOverridePoster", value.asInstanceOf[js.Any])
    
    inline def setTechCanOverridePosterUndefined: Self = StObject.set(x, "techCanOverridePoster", js.undefined)
    
    inline def setTechOrder(value: js.Array[String]): Self = StObject.set(x, "techOrder", value.asInstanceOf[js.Any])
    
    inline def setTechOrderUndefined: Self = StObject.set(x, "techOrder", js.undefined)
    
    inline def setTechOrderVarargs(value: String*): Self = StObject.set(x, "techOrder", js.Array(value*))
    
    inline def setTextTrackSettings(value: TextTrackSettingsOptions): Self = StObject.set(x, "textTrackSettings", value.asInstanceOf[js.Any])
    
    inline def setTextTrackSettingsUndefined: Self = StObject.set(x, "textTrackSettings", js.undefined)
    
    inline def setTracks(value: js.Array[TextTrackOptions]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: TextTrackOptions*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setUserActions(value: UserActions): Self = StObject.set(x, "userActions", value.asInstanceOf[js.Any])
    
    inline def setUserActionsUndefined: Self = StObject.set(x, "userActions", js.undefined)
    
    inline def setVttDotjs(value: String): Self = StObject.set(x, "vtt.js", value.asInstanceOf[js.Any])
    
    inline def setVttDotjsUndefined: Self = StObject.set(x, "vtt.js", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
