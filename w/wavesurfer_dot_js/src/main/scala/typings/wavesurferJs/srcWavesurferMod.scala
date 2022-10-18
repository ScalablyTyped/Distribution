package typings.wavesurferJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.AudioNode
import typings.std.Blob
import typings.std.CanvasGradient
import typings.std.File
import typings.std.HTMLMediaElement
import typings.wavesurferJs.typesBackendMod.Peaks
import typings.wavesurferJs.typesBackendMod.WaveSurferBackend
import typings.wavesurferJs.typesParamsMod.WaveSurferParams
import typings.wavesurferJs.typesPluginMod.PluginDefinition
import typings.wavesurferJs.typesUtilMod.WaveSurferUtil
import typings.wavesurferJs.wavesurferJsStrings.blob
import typings.wavesurferJs.wavesurferJsStrings.dataURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWavesurferMod {
  
  @JSImport("wavesurfer.js/src/wavesurfer", JSImport.Default)
  @js.native
  open class default protected () extends WaveSurfer {
    def this(params: WaveSurferParams) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/wavesurfer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wavesurfer.js/src/wavesurfer", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    inline def create(params: WaveSurferParams): WaveSurfer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[WaveSurfer]
    
    @JSImport("wavesurfer.js/src/wavesurfer", "default.util")
    @js.native
    def util: WaveSurferUtil = js.native
    inline def util_=(x: WaveSurferUtil): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("util")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @js.native
  trait WaveSurfer
    extends typings.wavesurferJs.srcUtilObserverMod.default {
    
    // propertyNameAddedByPlugin -> any
    def addPlugin(plugin: PluginDefinition): WaveSurfer = js.native
    
    var backend: WaveSurferBackend = js.native
    
    def cancelAjax(): Unit = js.native
    
    // pluginName -> WaveSurferPlugin
    /** Only available in WaveSurfer instances with CursorPlugin. */
    var cursor: typings.wavesurferJs.srcPluginCursorMod.default = js.native
    
    def destroy(): Unit = js.native
    
    def destroyPlugin(name: String): WaveSurfer = js.native
    
    /** Only available in WaveSurfer instances with ElanPlugin. */
    var elan: typings.wavesurferJs.srcPluginElanMod.default = js.native
    
    def empty(): Unit = js.native
    
    def exportImage(): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: String): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: String, quality: Double): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: String, quality: Double, `type`: dataURL | blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: String, quality: Unit, `type`: dataURL | blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: Unit, quality: Double): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: Unit, quality: Double, `type`: dataURL | blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: Unit, quality: Unit, `type`: dataURL | blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    
    def exportPCM(): js.Promise[Peaks] = js.native
    def exportPCM(length: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: Double, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: Unit, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Unit, start: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Unit, start: Double, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Unit, start: Unit, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Boolean): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Boolean, start: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Boolean, start: Double, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Boolean, start: Unit, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Unit, start: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Unit, start: Double, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Unit, start: Unit, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Boolean): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Boolean, start: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Boolean, start: Double, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Boolean, start: Unit, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Unit, start: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Unit, start: Double, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Unit, start: Unit, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Boolean): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Boolean, start: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Boolean, start: Double, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Boolean, start: Unit, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Unit, start: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Unit, start: Double, end: Double): js.Promise[Peaks] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Unit, start: Unit, end: Double): js.Promise[Peaks] = js.native
    
    def getActivePlugins(): StringDictionary[Boolean] = js.native
    
    def getBackgroundColor(): String = js.native
    
    def getCurrentTime(): Double = js.native
    
    def getCursorColor(): String = js.native
    
    def getDuration(): Double = js.native
    
    def getFilters(): js.Array[AudioNode] = js.native
    
    def getHeight(): Double = js.native
    
    def getMute(): Boolean = js.native
    
    def getPlaybackRate(): Double = js.native
    
    /** Get the fill color of the waveform behind the cursor. */
    def getProgressColor(): String = js.native
    def getProgressColor(channelIdx: Double): String = js.native
    
    def getVolume(): Double = js.native
    
    /** Get the fill color of the waveform after the cursor. */
    def getWaveColor(): CanvasGradient | String = js.native
    def getWaveColor(channelIdx: Double): CanvasGradient | String = js.native
    
    def init(): WaveSurfer = js.native
    
    def initPlugin(name: String): WaveSurfer = js.native
    
    def isPlaying(): Boolean = js.native
    
    var isReady: Boolean = js.native
    
    def load(url: String): Unit = js.native
    def load(url: String, peaks: Unit, preload: String): Unit = js.native
    def load(url: String, peaks: Unit, preload: String, duration: Double): Unit = js.native
    def load(url: String, peaks: Unit, preload: Unit, duration: Double): Unit = js.native
    def load(url: String, peaks: Peaks): Unit = js.native
    def load(url: String, peaks: Peaks, preload: String): Unit = js.native
    def load(url: String, peaks: Peaks, preload: String, duration: Double): Unit = js.native
    def load(url: String, peaks: Peaks, preload: Unit, duration: Double): Unit = js.native
    def load(url: HTMLMediaElement): Unit = js.native
    def load(url: HTMLMediaElement, peaks: Unit, preload: String): Unit = js.native
    def load(url: HTMLMediaElement, peaks: Unit, preload: String, duration: Double): Unit = js.native
    def load(url: HTMLMediaElement, peaks: Unit, preload: Unit, duration: Double): Unit = js.native
    def load(url: HTMLMediaElement, peaks: Peaks): Unit = js.native
    def load(url: HTMLMediaElement, peaks: Peaks, preload: String): Unit = js.native
    def load(url: HTMLMediaElement, peaks: Peaks, preload: String, duration: Double): Unit = js.native
    def load(url: HTMLMediaElement, peaks: Peaks, preload: Unit, duration: Double): Unit = js.native
    
    def loadBlob(url: Blob): Unit = js.native
    def loadBlob(url: File): Unit = js.native
    
    /** Only available in WaveSurfer instances with MarkersPlugin. */
    var markers: typings.wavesurferJs.srcPluginMarkersMod.default = js.native
    
    /** Only available in WaveSurfer instances with MediaSessionPlugin. */
    var mediasession: typings.wavesurferJs.srcPluginMediasessionMod.default = js.native
    
    /** Only available in WaveSurfer instances with MicrophonePlugin. */
    var microphone: typings.wavesurferJs.srcPluginMicrophoneMod.default = js.native
    
    /** Only available in WaveSurfer instances with MinimapPlugin. */
    var minimap: typings.wavesurferJs.srcPluginMinimapMod.default = js.native
    
    def pause(): Unit = js.native
    
    def play(): js.UndefOr[js.Promise[Unit]] = js.native
    def play(start: Double): js.UndefOr[js.Promise[Unit]] = js.native
    def play(start: Double, end: Double): js.UndefOr[js.Promise[Unit]] = js.native
    def play(start: Unit, end: Double): js.UndefOr[js.Promise[Unit]] = js.native
    
    def playPause(): js.UndefOr[js.Promise[Unit]] = js.native
    
    /** Only available in WaveSurfer instances with PlayheadPlugin. */
    var playhead: typings.wavesurferJs.srcPluginPlayheadMod.default = js.native
    
    /** Only available in WaveSurfer instances with RegionsPlugin. */
    var regions: typings.wavesurferJs.srcPluginRegionsMod.default = js.native
    
    def registerPlugins(plugins: js.Array[PluginDefinition]): WaveSurfer = js.native
    
    def seekAndCenter(progress: Double): Unit = js.native
    
    def seekTo(progress: Double): Unit = js.native
    
    def setBackgroundColor(color: String): Unit = js.native
    
    def setCurrentTime(seconds: Double): Unit = js.native
    
    def setCursorColor(color: String): Unit = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setMute(mute: Boolean): Unit = js.native
    
    def setPlayEnd(position: Double): Unit = js.native
    
    def setPlaybackRate(rate: Double): Unit = js.native
    
    /** Set the fill color of the waveform behind the cursor. */
    def setProgressColor(color: String): Unit = js.native
    def setProgressColor(color: String, channelIdx: Double): Unit = js.native
    def setProgressColor(color: CanvasGradient): Unit = js.native
    def setProgressColor(color: CanvasGradient, channelIdx: Double): Unit = js.native
    
    def setSinkId(deviceId: String): js.Promise[Any] = js.native
    
    def setVolume(newVolume: Double): Unit = js.native
    
    /** Set the fill color of the waveform after the cursor. */
    def setWaveColor(color: String): Unit = js.native
    def setWaveColor(color: String, channelIdx: Double): Unit = js.native
    def setWaveColor(color: CanvasGradient): Unit = js.native
    def setWaveColor(color: CanvasGradient, channelIdx: Double): Unit = js.native
    
    def skip(offset: Double): Unit = js.native
    
    def skipBackward(): Unit = js.native
    def skipBackward(seconds: Double): Unit = js.native
    
    def skipForward(): Unit = js.native
    def skipForward(seconds: Double): Unit = js.native
    
    /** Only available in WaveSurfer instances with SpectrogramPlugin. */
    var spectrogram: typings.wavesurferJs.srcPluginSpectrogramMod.default = js.native
    
    def stop(): Unit = js.native
    
    /** Only available in WaveSurfer instances with TimelinePlugin. */
    var timeline: typings.wavesurferJs.srcPluginTimelineMod.default = js.native
    
    def toggleInteraction(): Unit = js.native
    
    def toggleMute(): Unit = js.native
    
    def toggleScroll(): Unit = js.native
    
    var util: WaveSurferUtil = js.native
    
    def zoom(): Unit = js.native
    def zoom(pxPerSec: Double): Unit = js.native
  }
}
