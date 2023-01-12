package typings.wavesurferJs

import org.scalablytyped.runtime.NumberDictionary
import typings.std.AudioContext
import typings.std.CanvasGradient
import typings.std.HTMLElement
import typings.std.ScriptProcessorNode
import typings.wavesurferJs.srcDrawerDotmulticanvasMod.default
import typings.wavesurferJs.typesPluginMod.PluginDefinition
import typings.wavesurferJs.typesUtilMod.DrawingContextAttributes
import typings.wavesurferJs.typesXhrMod.XHROptions
import typings.wavesurferJs.wavesurferJsStrings.MediaElement
import typings.wavesurferJs.wavesurferJsStrings.MediaElementWebAudio
import typings.wavesurferJs.wavesurferJsStrings.WebAudio
import typings.wavesurferJs.wavesurferJsStrings.audio
import typings.wavesurferJs.wavesurferJsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesParamsMod {
  
  trait ChannelColor extends StObject {
    
    var progressColor: String
    
    var waveColor: String
  }
  object ChannelColor {
    
    inline def apply(progressColor: String, waveColor: String): ChannelColor = {
      val __obj = js.Dynamic.literal(progressColor = progressColor.asInstanceOf[js.Any], waveColor = waveColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelColor] (val x: Self) extends AnyVal {
      
      inline def setProgressColor(value: String): Self = StObject.set(x, "progressColor", value.asInstanceOf[js.Any])
      
      inline def setWaveColor(value: String): Self = StObject.set(x, "waveColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait SplitChannelOptions extends StObject {
    
    /** Object describing color for each channel. */
    var channelColors: js.UndefOr[NumberDictionary[ChannelColor]] = js.undefined
    
    /** Indexes of channels to be hidden from rendering. */
    var filterChannels: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Determines whether channels are rendered on top of each other or on separate tracks. */
    var overlay: js.UndefOr[Boolean] = js.undefined
    
    /** Determines whether normalization is done per channel or maintains proportionality between channels. */
    var relativeNormalization: js.UndefOr[Boolean] = js.undefined
  }
  object SplitChannelOptions {
    
    inline def apply(): SplitChannelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitChannelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitChannelOptions] (val x: Self) extends AnyVal {
      
      inline def setChannelColors(value: NumberDictionary[ChannelColor]): Self = StObject.set(x, "channelColors", value.asInstanceOf[js.Any])
      
      inline def setChannelColorsUndefined: Self = StObject.set(x, "channelColors", js.undefined)
      
      inline def setFilterChannels(value: js.Array[Double]): Self = StObject.set(x, "filterChannels", value.asInstanceOf[js.Any])
      
      inline def setFilterChannelsUndefined: Self = StObject.set(x, "filterChannels", js.undefined)
      
      inline def setFilterChannelsVarargs(value: Double*): Self = StObject.set(x, "filterChannels", js.Array(value*))
      
      inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setRelativeNormalization(value: Boolean): Self = StObject.set(x, "relativeNormalization", value.asInstanceOf[js.Any])
      
      inline def setRelativeNormalizationUndefined: Self = StObject.set(x, "relativeNormalization", js.undefined)
    }
  }
  
  trait WaveSurferParams extends StObject {
    
    /** Use your own previously initialized AudioContext or leave blank (default: null). */
    var audioContext: js.UndefOr[AudioContext] = js.undefined
    
    /** Speed at which to play audio. Lower number is slower (default: 1). */
    var audioRate: js.UndefOr[Double] = js.undefined
    
    /** Use your own previously initialized ScriptProcessorNode or leave blank (default: null). */
    var audioScriptProcessor: js.UndefOr[ScriptProcessorNode] = js.undefined
    
    /** If a scrollbar is present, center the waveform on current progress (default: true). */
    var autoCenter: js.UndefOr[Boolean] = js.undefined
    
    /** If autoCenter is active, immediately center waveform on current progress (default: false). */
    var autoCenterImmediately: js.UndefOr[Boolean] = js.undefined
    
    /** If autoCenter is active, rate at which the waveform is centered (default: 5). */
    var autoCenterRate: js.UndefOr[Double] = js.undefined
    
    /**
      * Backend to use (default: 'WebAudio').
      *
      * MediaElement is a fallback for unsupported browsers.
      * MediaElementWebAudio allows to use WebAudio API also with big audio files, loading audio like with MediaElement backend (HTML5 audio tag).
      */
    var backend: js.UndefOr[WebAudio | MediaElement | MediaElementWebAudio] = js.undefined
    
    /** Change background color of the waveform container (default: null). */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** The optional spacing between bars of the wave, if not provided will be calculated in legacy format (default: null). */
    var barGap: js.UndefOr[Double] = js.undefined
    
    /** The height of the wave bars (default: 1). */
    var barHeight: js.UndefOr[Double] = js.undefined
    
    /** If specified, draw at least a bar of this height, eliminating waveform gaps (default: null). */
    var barMinHeight: js.UndefOr[Double] = js.undefined
    
    /** The radius of the wave bars (default: 0). Makes bars rounded. */
    var barRadius: js.UndefOr[Double] = js.undefined
    
    /** Draw the waveform using bars (default: null). */
    var barWidth: js.UndefOr[Double] = js.undefined
    
    /** Close and nullify all audio contexts when the destroy method is called (default: false). */
    var closeAudioContext: js.UndefOr[Boolean] = js.undefined
    
    /** CSS selector or HTML element where the waveform should be drawn. This is the only required parameter. */
    var container: String | HTMLElement
    
    /** The fill color of the cursor indicating the playhead position (default: '#333'). */
    var cursorColor: js.UndefOr[String] = js.undefined
    
    /** Measured in pixels (default: 1). */
    var cursorWidth: js.UndefOr[Double] = js.undefined
    
    var drawingContextAttributes: js.UndefOr[DrawingContextAttributes] = js.undefined
    
    /** Optional audio length so pre-rendered peaks can be display immediately for example (default: null). */
    var duration: js.UndefOr[Double] = js.undefined
    
    /** Whether to fill the entire container or draw only according to minPxPerSec (default: true). */
    var fillParent: js.UndefOr[Boolean] = js.undefined
    
    /** Force decoding of audio using web audio when zooming to get a more detailed waveform (default: false). */
    var forceDecode: js.UndefOr[Boolean] = js.undefined
    
    /** The height of the waveform. Measured in pixels (default: 128). */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Whether to hide the mouse cursor when one would normally be shown by default (default: false). */
    var hideCursor: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to hide the horizontal scrollbar when one would normally be shown (default: false). */
    var hideScrollbar: js.UndefOr[Boolean] = js.undefined
    
    /** If true, ignores device silence mode. */
    var ignoreSilenceMode: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the mouse interaction will be enabled at initialization. You can switch this parameter at any time later on (default: true). */
    var interact: js.UndefOr[Boolean] = js.undefined
    
    /** (Use with regions plugin) Enable looping of selected regions (default: false). */
    var loopSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Maximum width of a single canvas in pixels (default: 4000). */
    var maxCanvasWidth: js.UndefOr[Double] = js.undefined
    
    /** (Use with backend MediaElement or MediaElementWebAudio) Enable the native controls for the media element (default: false). */
    var mediaControls: js.UndefOr[Boolean] = js.undefined
    
    /** (Use with backend MediaElement or MediaElementWebAudio) 'audio'|'video' ('video' only for MediaElement) */
    var mediaType: js.UndefOr[audio | video] = js.undefined
    
    /** Minimum number of pixels per second of audio (default: 20). */
    var minPxPerSec: js.UndefOr[Double] = js.undefined
    
    /** If true, normalize by the maximum peak instead of 1.0 (default: false). */
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    /** Use the PeakCache to improve rendering speed of large waveforms (default: false). */
    var partialRender: js.UndefOr[Boolean] = js.undefined
    
    /** The pixel ratio used to calculate display (default: window.deviceDixelRatio). */
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /** An array of plugin definitions to register during instantiation. */
    var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.undefined
    
    /** The fill color of the part of the waveform behind the cursor (default: '#555'). */
    var progressColor: js.UndefOr[String] = js.undefined
    
    /** Set to false to keep the media element in the DOM when the player is destroyed (default: true). */
    var removeMediaElementOnDestroy: js.UndefOr[Boolean] = js.undefined
    
    /** Can be used to inject a custom renderer (default: MultiCanvas). */
    var renderer: js.UndefOr[default] = js.undefined
    
    /**
      * If set to true resize the waveform, when the window is resized (default: false).
      *
      * This is debounced with a 100ms timeout by default. If this parameter is a number it represents that timeout.
      */
    var responsive: js.UndefOr[Boolean | Double] = js.undefined
    
    /** If set to true, renders waveform from right-to-left (default: false). */
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to scroll the container with a lengthy waveform. Otherwise the waveform is shrunk to the container width (see fillParent) (default: false). */
    var scrollParent: js.UndefOr[Boolean] = js.undefined
    
    /** Number of seconds to skip with the skipForward() and skipBackward() methods (default: 2). */
    var skipLength: js.UndefOr[Double] = js.undefined
    
    /** Render with separate waveforms for the channels of the audio (default: false). */
    var splitChannels: js.UndefOr[Boolean] = js.undefined
    
    /** Options for splitChannel rendering. */
    var splitChannelsOptions: js.UndefOr[SplitChannelOptions] = js.undefined
    
    /** Render the waveform vertically instead of horizontally. */
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    /** The fill color of the waveform after the cursor. */
    var waveColor: js.UndefOr[String | CanvasGradient] = js.undefined
    
    /** XHR options. */
    var xhr: js.UndefOr[XHROptions] = js.undefined
  }
  object WaveSurferParams {
    
    inline def apply(container: String | HTMLElement): WaveSurferParams = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaveSurferParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaveSurferParams] (val x: Self) extends AnyVal {
      
      inline def setAudioContext(value: AudioContext): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
      
      inline def setAudioContextUndefined: Self = StObject.set(x, "audioContext", js.undefined)
      
      inline def setAudioRate(value: Double): Self = StObject.set(x, "audioRate", value.asInstanceOf[js.Any])
      
      inline def setAudioRateUndefined: Self = StObject.set(x, "audioRate", js.undefined)
      
      inline def setAudioScriptProcessor(value: ScriptProcessorNode): Self = StObject.set(x, "audioScriptProcessor", value.asInstanceOf[js.Any])
      
      inline def setAudioScriptProcessorUndefined: Self = StObject.set(x, "audioScriptProcessor", js.undefined)
      
      inline def setAutoCenter(value: Boolean): Self = StObject.set(x, "autoCenter", value.asInstanceOf[js.Any])
      
      inline def setAutoCenterImmediately(value: Boolean): Self = StObject.set(x, "autoCenterImmediately", value.asInstanceOf[js.Any])
      
      inline def setAutoCenterImmediatelyUndefined: Self = StObject.set(x, "autoCenterImmediately", js.undefined)
      
      inline def setAutoCenterRate(value: Double): Self = StObject.set(x, "autoCenterRate", value.asInstanceOf[js.Any])
      
      inline def setAutoCenterRateUndefined: Self = StObject.set(x, "autoCenterRate", js.undefined)
      
      inline def setAutoCenterUndefined: Self = StObject.set(x, "autoCenter", js.undefined)
      
      inline def setBackend(value: WebAudio | MediaElement | MediaElementWebAudio): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBarGap(value: Double): Self = StObject.set(x, "barGap", value.asInstanceOf[js.Any])
      
      inline def setBarGapUndefined: Self = StObject.set(x, "barGap", js.undefined)
      
      inline def setBarHeight(value: Double): Self = StObject.set(x, "barHeight", value.asInstanceOf[js.Any])
      
      inline def setBarHeightUndefined: Self = StObject.set(x, "barHeight", js.undefined)
      
      inline def setBarMinHeight(value: Double): Self = StObject.set(x, "barMinHeight", value.asInstanceOf[js.Any])
      
      inline def setBarMinHeightUndefined: Self = StObject.set(x, "barMinHeight", js.undefined)
      
      inline def setBarRadius(value: Double): Self = StObject.set(x, "barRadius", value.asInstanceOf[js.Any])
      
      inline def setBarRadiusUndefined: Self = StObject.set(x, "barRadius", js.undefined)
      
      inline def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      inline def setCloseAudioContext(value: Boolean): Self = StObject.set(x, "closeAudioContext", value.asInstanceOf[js.Any])
      
      inline def setCloseAudioContextUndefined: Self = StObject.set(x, "closeAudioContext", js.undefined)
      
      inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setCursorColor(value: String): Self = StObject.set(x, "cursorColor", value.asInstanceOf[js.Any])
      
      inline def setCursorColorUndefined: Self = StObject.set(x, "cursorColor", js.undefined)
      
      inline def setCursorWidth(value: Double): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
      
      inline def setCursorWidthUndefined: Self = StObject.set(x, "cursorWidth", js.undefined)
      
      inline def setDrawingContextAttributes(value: DrawingContextAttributes): Self = StObject.set(x, "drawingContextAttributes", value.asInstanceOf[js.Any])
      
      inline def setDrawingContextAttributesUndefined: Self = StObject.set(x, "drawingContextAttributes", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFillParent(value: Boolean): Self = StObject.set(x, "fillParent", value.asInstanceOf[js.Any])
      
      inline def setFillParentUndefined: Self = StObject.set(x, "fillParent", js.undefined)
      
      inline def setForceDecode(value: Boolean): Self = StObject.set(x, "forceDecode", value.asInstanceOf[js.Any])
      
      inline def setForceDecodeUndefined: Self = StObject.set(x, "forceDecode", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideCursor(value: Boolean): Self = StObject.set(x, "hideCursor", value.asInstanceOf[js.Any])
      
      inline def setHideCursorUndefined: Self = StObject.set(x, "hideCursor", js.undefined)
      
      inline def setHideScrollbar(value: Boolean): Self = StObject.set(x, "hideScrollbar", value.asInstanceOf[js.Any])
      
      inline def setHideScrollbarUndefined: Self = StObject.set(x, "hideScrollbar", js.undefined)
      
      inline def setIgnoreSilenceMode(value: Boolean): Self = StObject.set(x, "ignoreSilenceMode", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSilenceModeUndefined: Self = StObject.set(x, "ignoreSilenceMode", js.undefined)
      
      inline def setInteract(value: Boolean): Self = StObject.set(x, "interact", value.asInstanceOf[js.Any])
      
      inline def setInteractUndefined: Self = StObject.set(x, "interact", js.undefined)
      
      inline def setLoopSelection(value: Boolean): Self = StObject.set(x, "loopSelection", value.asInstanceOf[js.Any])
      
      inline def setLoopSelectionUndefined: Self = StObject.set(x, "loopSelection", js.undefined)
      
      inline def setMaxCanvasWidth(value: Double): Self = StObject.set(x, "maxCanvasWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxCanvasWidthUndefined: Self = StObject.set(x, "maxCanvasWidth", js.undefined)
      
      inline def setMediaControls(value: Boolean): Self = StObject.set(x, "mediaControls", value.asInstanceOf[js.Any])
      
      inline def setMediaControlsUndefined: Self = StObject.set(x, "mediaControls", js.undefined)
      
      inline def setMediaType(value: audio | video): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setMinPxPerSec(value: Double): Self = StObject.set(x, "minPxPerSec", value.asInstanceOf[js.Any])
      
      inline def setMinPxPerSecUndefined: Self = StObject.set(x, "minPxPerSec", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setPartialRender(value: Boolean): Self = StObject.set(x, "partialRender", value.asInstanceOf[js.Any])
      
      inline def setPartialRenderUndefined: Self = StObject.set(x, "partialRender", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setPlugins(value: js.Array[PluginDefinition]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: PluginDefinition*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setProgressColor(value: String): Self = StObject.set(x, "progressColor", value.asInstanceOf[js.Any])
      
      inline def setProgressColorUndefined: Self = StObject.set(x, "progressColor", js.undefined)
      
      inline def setRemoveMediaElementOnDestroy(value: Boolean): Self = StObject.set(x, "removeMediaElementOnDestroy", value.asInstanceOf[js.Any])
      
      inline def setRemoveMediaElementOnDestroyUndefined: Self = StObject.set(x, "removeMediaElementOnDestroy", js.undefined)
      
      inline def setRenderer(value: default): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setResponsive(value: Boolean | Double): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setScrollParent(value: Boolean): Self = StObject.set(x, "scrollParent", value.asInstanceOf[js.Any])
      
      inline def setScrollParentUndefined: Self = StObject.set(x, "scrollParent", js.undefined)
      
      inline def setSkipLength(value: Double): Self = StObject.set(x, "skipLength", value.asInstanceOf[js.Any])
      
      inline def setSkipLengthUndefined: Self = StObject.set(x, "skipLength", js.undefined)
      
      inline def setSplitChannels(value: Boolean): Self = StObject.set(x, "splitChannels", value.asInstanceOf[js.Any])
      
      inline def setSplitChannelsOptions(value: SplitChannelOptions): Self = StObject.set(x, "splitChannelsOptions", value.asInstanceOf[js.Any])
      
      inline def setSplitChannelsOptionsUndefined: Self = StObject.set(x, "splitChannelsOptions", js.undefined)
      
      inline def setSplitChannelsUndefined: Self = StObject.set(x, "splitChannels", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setWaveColor(value: String | CanvasGradient): Self = StObject.set(x, "waveColor", value.asInstanceOf[js.Any])
      
      inline def setWaveColorUndefined: Self = StObject.set(x, "waveColor", js.undefined)
      
      inline def setXhr(value: XHROptions): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
}
