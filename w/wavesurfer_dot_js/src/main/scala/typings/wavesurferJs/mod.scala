package typings.wavesurferJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.AudioContext
import typings.std.AudioNode
import typings.std.Blob
import typings.std.CanvasGradient
import typings.std.Event
import typings.std.File
import typings.std.HTMLElement
import typings.std.HTMLMediaElement
import typings.std.ScriptProcessorNode
import typings.wavesurferJs.anon.Instantiable
import typings.wavesurferJs.anon.InstantiableWaveSurferPlugin
import typings.wavesurferJs.anon.Xhr
import typings.wavesurferJs.wavesurferJsStrings.MediaElement
import typings.wavesurferJs.wavesurferJsStrings.MediaElementWebAudio
import typings.wavesurferJs.wavesurferJsStrings.WebAudio
import typings.wavesurferJs.wavesurferJsStrings.blob
import typings.wavesurferJs.wavesurferJsStrings.dataURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wavesurfer.js", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with WaveSurfer {
    def this(params: WaveSurferParams) = this()
    
    /* CompleteClass */
    override def fireEvent(eventName: String, args: js.Any*): Unit = js.native
    
    /* CompleteClass */
    override def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor = js.native
    
    /* CompleteClass */
    override def once(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor = js.native
    
    /* CompleteClass */
    override def un(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def unAll(): Unit = js.native
  }
  @JSImport("wavesurfer.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("wavesurfer.js", "VERSION")
  @js.native
  def VERSION: String = js.native
  @scala.inline
  def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  @JSImport("wavesurfer.js", "WaveRenderer")
  @js.native
  class WaveRenderer protected ()
    extends StObject
       with Observer {
    def this(container: HTMLElement, params: WaveSurferParams) = this()
    
    def clearWave(): Unit = js.native
    
    def createWrapper(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def drawBars(peaks: js.Array[js.Array[Double] | Double], channelIndex: Double, start: Double, end: Double): Unit = js.native
    
    def drawPeaks(peaks: js.Array[js.Array[Double] | Double], length: Double, start: Double, end: Double): Unit = js.native
    
    def drawWave(peaks: js.Array[js.Array[Double] | Double], channelIndex: Double, start: Double, end: Double): Unit = js.native
    
    /* CompleteClass */
    override def fireEvent(eventName: String, args: js.Any*): Unit = js.native
    
    def getScrollX(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def handleEvent(e: Event, noPrevent: Boolean): Double = js.native
    
    var height: Double = js.native
    
    /* CompleteClass */
    override def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor = js.native
    
    /* CompleteClass */
    override def once(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor = js.native
    
    def progress(progress: Double): Unit = js.native
    
    def recenter(percent: Double): Unit = js.native
    
    def recenterOnPosition(position: Double, immediate: Boolean): Unit = js.native
    
    def resetScroll(): Unit = js.native
    
    def setHeight(height: Double): Boolean = js.native
    
    def setWidth(width: Double): Boolean = js.native
    
    def style(el: HTMLElement, styles: StringDictionary[String]): HTMLElement = js.native
    
    /* CompleteClass */
    override def un(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def unAll(): Unit = js.native
    
    def updateProgress(position: Double): Unit = js.native
    
    def updateSize(): Unit = js.native
    
    var width: Double = js.native
    
    var wrapper: HTMLElement = js.native
  }
  
  @JSImport("wavesurfer.js", "WaveSurferPlugin")
  @js.native
  class WaveSurferPlugin protected () extends StObject {
    def this(params: js.Object, ws: WaveSurfer) = this()
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
  }
  object WaveSurferPlugin {
    
    @JSImport("wavesurfer.js", "WaveSurferPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def create(params: js.Object): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  /* static member */
  @scala.inline
  def create(params: WaveSurferParams): WaveSurfer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[WaveSurfer]
  
  /* static member */
  @JSImport("wavesurfer.js", "util")
  @js.native
  def util: WaveSurferUtil = js.native
  @scala.inline
  def util_=(x: WaveSurferUtil): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("util")(x.asInstanceOf[js.Any])
  
  trait ListenerDescriptor extends StObject {
    
    def callback(args: js.Any*): Unit
    
    var name: String
    
    def un(): Unit
  }
  object ListenerDescriptor {
    
    @scala.inline
    def apply(callback: /* repeated */ js.Any => Unit, name: String, un: () => Unit): ListenerDescriptor = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), name = name.asInstanceOf[js.Any], un = js.Any.fromFunction0(un))
      __obj.asInstanceOf[ListenerDescriptor]
    }
    
    @scala.inline
    implicit class ListenerDescriptorMutableBuilder[Self <: ListenerDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUn(value: () => Unit): Self = StObject.set(x, "un", js.Any.fromFunction0(value))
    }
  }
  
  trait Observer extends StObject {
    
    def fireEvent(eventName: String, args: js.Any*): Unit
    
    def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor
    
    def once(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor
    
    def un(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit
    
    def unAll(): Unit
  }
  object Observer {
    
    @scala.inline
    def apply(
      fireEvent: (String, /* repeated */ js.Any) => Unit,
      on: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor,
      once: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor,
      un: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit,
      unAll: () => Unit
    ): Observer = {
      val __obj = js.Dynamic.literal(fireEvent = js.Any.fromFunction2(fireEvent), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), un = js.Any.fromFunction2(un), unAll = js.Any.fromFunction0(unAll))
      __obj.asInstanceOf[Observer]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFireEvent(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnce(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit): Self = StObject.set(x, "un", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnAll(value: () => Unit): Self = StObject.set(x, "unAll", js.Any.fromFunction0(value))
    }
  }
  
  trait PluginDefinition extends StObject {
    
    var deferInit: js.UndefOr[Boolean] = js.undefined
    
    var instance: InstantiableWaveSurferPlugin
    
    var name: String
    
    var params: js.Object
    
    var staticProps: js.UndefOr[js.Object] = js.undefined
  }
  object PluginDefinition {
    
    @scala.inline
    def apply(instance: InstantiableWaveSurferPlugin, name: String, params: js.Object): PluginDefinition = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginDefinition]
    }
    
    @scala.inline
    implicit class PluginDefinitionMutableBuilder[Self <: PluginDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeferInit(value: Boolean): Self = StObject.set(x, "deferInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferInitUndefined: Self = StObject.set(x, "deferInit", js.undefined)
      
      @scala.inline
      def setInstance(value: InstantiableWaveSurferPlugin): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticProps(value: js.Object): Self = StObject.set(x, "staticProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticPropsUndefined: Self = StObject.set(x, "staticProps", js.undefined)
    }
  }
  
  @js.native
  trait WaveSurfer
    extends StObject
       with Observer
       with // [x: string]: any
  //   pluginName -> WaveSurferPlugin
  //   propertyNameAddedByPlugin -> any
  /* x */ StringDictionary[js.Any] {
    
    def addPlugin(plugin: PluginDefinition): WaveSurfer = js.native
    
    var backend: WaveSurferBackend = js.native
    
    def cancelAjax(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def destroyPlugin(name: String): WaveSurfer = js.native
    
    def empty(): Unit = js.native
    
    def exportImage(): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: String): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: String, quality: Double): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: Unit, quality: Double): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_blob(format: String, quality: Double, `type`: blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_blob(format: String, quality: Unit, `type`: blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_blob(format: Unit, quality: Double, `type`: blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_blob(format: Unit, quality: Unit, `type`: blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_dataURL(format: String, quality: Double, `type`: dataURL): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_dataURL(format: String, quality: Unit, `type`: dataURL): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_dataURL(format: Unit, quality: Double, `type`: dataURL): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_dataURL(format: Unit, quality: Unit, `type`: dataURL): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    
    def exportPCM(): js.Promise[String] = js.native
    def exportPCM(length: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: Double, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: Unit, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Unit, start: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Unit, start: Double, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Unit, start: Unit, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Boolean): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Boolean, start: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Boolean, start: Double, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Boolean, start: Unit, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Unit, start: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Unit, start: Double, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Unit, noWindow: Unit, start: Unit, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Boolean): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Boolean, start: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Boolean, start: Double, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Boolean, start: Unit, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Unit, start: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Unit, start: Double, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Double, noWindow: Unit, start: Unit, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Boolean): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Boolean, start: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Boolean, start: Double, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Boolean, start: Unit, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Unit, start: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Unit, start: Double, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Unit, accuracy: Unit, noWindow: Unit, start: Unit, end: Double): js.Promise[String] = js.native
    
    def getActivePlugins(): js.Object = js.native
    
    def getBackgroundColor(): String = js.native
    
    def getCurrentTime(): Double = js.native
    
    def getCursorColor(): String = js.native
    
    def getDuration(): Double = js.native
    
    def getFilters(): js.Array[AudioNode] = js.native
    
    def getHeight(): Double = js.native
    
    def getMute(): Boolean = js.native
    
    def getPlaybackRate(): Double = js.native
    
    def getProgressColor(): String = js.native
    
    def getVolume(): Double = js.native
    
    def getWaveColor(): CanvasGradient | String = js.native
    
    def init(): WaveSurfer = js.native
    
    def initPlugin(name: String): WaveSurfer = js.native
    
    def isPlaying(): Boolean = js.native
    
    def isReady(): Boolean = js.native
    
    def load(url: String): Unit = js.native
    def load(url: String, peaks: js.Array[js.Array[Double] | Double]): Unit = js.native
    def load(url: String, peaks: js.Array[js.Array[Double] | Double], preload: String): Unit = js.native
    def load(url: String, peaks: js.Array[js.Array[Double] | Double], preload: String, duration: Double): Unit = js.native
    def load(url: String, peaks: js.Array[js.Array[Double] | Double], preload: Unit, duration: Double): Unit = js.native
    def load(url: String, peaks: Unit, preload: String): Unit = js.native
    def load(url: String, peaks: Unit, preload: String, duration: Double): Unit = js.native
    def load(url: String, peaks: Unit, preload: Unit, duration: Double): Unit = js.native
    def load(url: HTMLMediaElement): Unit = js.native
    def load(url: HTMLMediaElement, peaks: js.Array[js.Array[Double] | Double]): Unit = js.native
    def load(url: HTMLMediaElement, peaks: js.Array[js.Array[Double] | Double], preload: String): Unit = js.native
    def load(
      url: HTMLMediaElement,
      peaks: js.Array[js.Array[Double] | Double],
      preload: String,
      duration: Double
    ): Unit = js.native
    def load(url: HTMLMediaElement, peaks: js.Array[js.Array[Double] | Double], preload: Unit, duration: Double): Unit = js.native
    def load(url: HTMLMediaElement, peaks: Unit, preload: String): Unit = js.native
    def load(url: HTMLMediaElement, peaks: Unit, preload: String, duration: Double): Unit = js.native
    def load(url: HTMLMediaElement, peaks: Unit, preload: Unit, duration: Double): Unit = js.native
    
    def loadBlob(url: Blob): Unit = js.native
    def loadBlob(url: File): Unit = js.native
    
    def pause(): js.UndefOr[js.Promise[Unit]] = js.native
    
    def play(): js.UndefOr[js.Promise[Unit]] = js.native
    def play(start: Double): js.UndefOr[js.Promise[Unit]] = js.native
    def play(start: Double, end: Double): js.UndefOr[js.Promise[Unit]] = js.native
    def play(start: Unit, end: Double): js.UndefOr[js.Promise[Unit]] = js.native
    
    def playPause(): js.UndefOr[js.Promise[Unit]] = js.native
    
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
    
    def setSinkId(deviceId: String): js.Promise[js.Any] = js.native
    
    def setVolume(newVolume: Double): Unit = js.native
    
    def setWaveColor(color: String): Unit = js.native
    def setWaveColor(color: CanvasGradient): Unit = js.native
    
    def skip(offset: Double): Unit = js.native
    
    def skipBackward(): Unit = js.native
    def skipBackward(seconds: Double): Unit = js.native
    
    def skipForward(): Unit = js.native
    def skipForward(seconds: Double): Unit = js.native
    
    def stop(): Unit = js.native
    
    def toggleInteraction(): Unit = js.native
    
    def toggleMute(): Unit = js.native
    
    def toggleScroll(): Unit = js.native
    
    var util: WaveSurferUtil = js.native
    
    def zoom(): Unit = js.native
    def zoom(pxPerSec: Double): Unit = js.native
  }
  
  @js.native
  trait WaveSurferBackend extends StObject {
    
    def getPeaks(length: Double): js.Array[js.Array[Double] | Double] = js.native
    def getPeaks(length: Double, first: Double): js.Array[js.Array[Double] | Double] = js.native
    def getPeaks(length: Double, first: Double, last: Double): js.Array[js.Array[Double] | Double] = js.native
    def getPeaks(length: Double, first: Unit, last: Double): js.Array[js.Array[Double] | Double] = js.native
  }
  
  trait WaveSurferParams extends StObject {
    
    var audioContext: js.UndefOr[AudioContext] = js.undefined
    
    var audioRate: js.UndefOr[Double] = js.undefined
    
    var audioScriptProcessor: js.UndefOr[ScriptProcessorNode] = js.undefined
    
    var autoCenter: js.UndefOr[Boolean] = js.undefined
    
    var autoCenterImmediately: js.UndefOr[Boolean] = js.undefined
    
    var autoCenterRate: js.UndefOr[Double] = js.undefined
    
    var backend: js.UndefOr[WebAudio | MediaElement | MediaElementWebAudio] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var barGap: js.UndefOr[Double] = js.undefined
    
    var barHeight: js.UndefOr[Double] = js.undefined
    
    var barMinHeight: js.UndefOr[Double] = js.undefined
    
    var barRadius: js.UndefOr[Double] = js.undefined
    
    var barWidth: js.UndefOr[Double] = js.undefined
    
    var closeAudioContext: js.UndefOr[Boolean] = js.undefined
    
    var container: String | HTMLElement
    
    var cursorColor: js.UndefOr[String] = js.undefined
    
    var cursorWidth: js.UndefOr[Double] = js.undefined
    
    var drawingContextAttributes: js.UndefOr[js.Object] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var fillParent: js.UndefOr[Boolean] = js.undefined
    
    var forceDecode: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var hideScrollbar: js.UndefOr[Boolean] = js.undefined
    
    var interact: js.UndefOr[Boolean] = js.undefined
    
    var loopSelection: js.UndefOr[Boolean] = js.undefined
    
    var maxCanvasWidth: js.UndefOr[Double] = js.undefined
    
    var mediaControls: js.UndefOr[Boolean] = js.undefined
    
    var mediaType: js.UndefOr[String] = js.undefined
    
    var minPxPerSec: js.UndefOr[Double] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var partialRender: js.UndefOr[Boolean] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.undefined
    
    var progressColor: js.UndefOr[String] = js.undefined
    
    var removeMediaElementOnDestroy: js.UndefOr[Boolean] = js.undefined
    
    var renderer: js.UndefOr[Instantiable] = js.undefined
    
    var responsive: js.UndefOr[Boolean | Double] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var scrollParent: js.UndefOr[Boolean] = js.undefined
    
    var skipLength: js.UndefOr[Double] = js.undefined
    
    var splitChannels: js.UndefOr[Boolean] = js.undefined
    
    var waveColor: js.UndefOr[String | CanvasGradient] = js.undefined
    
    var xhr: js.UndefOr[XHROptions] = js.undefined
  }
  object WaveSurferParams {
    
    @scala.inline
    def apply(container: String | HTMLElement): WaveSurferParams = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaveSurferParams]
    }
    
    @scala.inline
    implicit class WaveSurferParamsMutableBuilder[Self <: WaveSurferParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioContext(value: AudioContext): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioContextUndefined: Self = StObject.set(x, "audioContext", js.undefined)
      
      @scala.inline
      def setAudioRate(value: Double): Self = StObject.set(x, "audioRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioRateUndefined: Self = StObject.set(x, "audioRate", js.undefined)
      
      @scala.inline
      def setAudioScriptProcessor(value: ScriptProcessorNode): Self = StObject.set(x, "audioScriptProcessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioScriptProcessorUndefined: Self = StObject.set(x, "audioScriptProcessor", js.undefined)
      
      @scala.inline
      def setAutoCenter(value: Boolean): Self = StObject.set(x, "autoCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCenterImmediately(value: Boolean): Self = StObject.set(x, "autoCenterImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCenterImmediatelyUndefined: Self = StObject.set(x, "autoCenterImmediately", js.undefined)
      
      @scala.inline
      def setAutoCenterRate(value: Double): Self = StObject.set(x, "autoCenterRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCenterRateUndefined: Self = StObject.set(x, "autoCenterRate", js.undefined)
      
      @scala.inline
      def setAutoCenterUndefined: Self = StObject.set(x, "autoCenter", js.undefined)
      
      @scala.inline
      def setBackend(value: WebAudio | MediaElement | MediaElementWebAudio): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBarGap(value: Double): Self = StObject.set(x, "barGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarGapUndefined: Self = StObject.set(x, "barGap", js.undefined)
      
      @scala.inline
      def setBarHeight(value: Double): Self = StObject.set(x, "barHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarHeightUndefined: Self = StObject.set(x, "barHeight", js.undefined)
      
      @scala.inline
      def setBarMinHeight(value: Double): Self = StObject.set(x, "barMinHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarMinHeightUndefined: Self = StObject.set(x, "barMinHeight", js.undefined)
      
      @scala.inline
      def setBarRadius(value: Double): Self = StObject.set(x, "barRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarRadiusUndefined: Self = StObject.set(x, "barRadius", js.undefined)
      
      @scala.inline
      def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      @scala.inline
      def setCloseAudioContext(value: Boolean): Self = StObject.set(x, "closeAudioContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseAudioContextUndefined: Self = StObject.set(x, "closeAudioContext", js.undefined)
      
      @scala.inline
      def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorColor(value: String): Self = StObject.set(x, "cursorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorColorUndefined: Self = StObject.set(x, "cursorColor", js.undefined)
      
      @scala.inline
      def setCursorWidth(value: Double): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorWidthUndefined: Self = StObject.set(x, "cursorWidth", js.undefined)
      
      @scala.inline
      def setDrawingContextAttributes(value: js.Object): Self = StObject.set(x, "drawingContextAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawingContextAttributesUndefined: Self = StObject.set(x, "drawingContextAttributes", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFillParent(value: Boolean): Self = StObject.set(x, "fillParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillParentUndefined: Self = StObject.set(x, "fillParent", js.undefined)
      
      @scala.inline
      def setForceDecode(value: Boolean): Self = StObject.set(x, "forceDecode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDecodeUndefined: Self = StObject.set(x, "forceDecode", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHideScrollbar(value: Boolean): Self = StObject.set(x, "hideScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideScrollbarUndefined: Self = StObject.set(x, "hideScrollbar", js.undefined)
      
      @scala.inline
      def setInteract(value: Boolean): Self = StObject.set(x, "interact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractUndefined: Self = StObject.set(x, "interact", js.undefined)
      
      @scala.inline
      def setLoopSelection(value: Boolean): Self = StObject.set(x, "loopSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopSelectionUndefined: Self = StObject.set(x, "loopSelection", js.undefined)
      
      @scala.inline
      def setMaxCanvasWidth(value: Double): Self = StObject.set(x, "maxCanvasWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCanvasWidthUndefined: Self = StObject.set(x, "maxCanvasWidth", js.undefined)
      
      @scala.inline
      def setMediaControls(value: Boolean): Self = StObject.set(x, "mediaControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaControlsUndefined: Self = StObject.set(x, "mediaControls", js.undefined)
      
      @scala.inline
      def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setMinPxPerSec(value: Double): Self = StObject.set(x, "minPxPerSec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPxPerSecUndefined: Self = StObject.set(x, "minPxPerSec", js.undefined)
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setPartialRender(value: Boolean): Self = StObject.set(x, "partialRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialRenderUndefined: Self = StObject.set(x, "partialRender", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[PluginDefinition]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: PluginDefinition*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setProgressColor(value: String): Self = StObject.set(x, "progressColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressColorUndefined: Self = StObject.set(x, "progressColor", js.undefined)
      
      @scala.inline
      def setRemoveMediaElementOnDestroy(value: Boolean): Self = StObject.set(x, "removeMediaElementOnDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveMediaElementOnDestroyUndefined: Self = StObject.set(x, "removeMediaElementOnDestroy", js.undefined)
      
      @scala.inline
      def setRenderer(value: Instantiable): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean | Double): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setScrollParent(value: Boolean): Self = StObject.set(x, "scrollParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollParentUndefined: Self = StObject.set(x, "scrollParent", js.undefined)
      
      @scala.inline
      def setSkipLength(value: Double): Self = StObject.set(x, "skipLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipLengthUndefined: Self = StObject.set(x, "skipLength", js.undefined)
      
      @scala.inline
      def setSplitChannels(value: Boolean): Self = StObject.set(x, "splitChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitChannelsUndefined: Self = StObject.set(x, "splitChannels", js.undefined)
      
      @scala.inline
      def setWaveColor(value: String | CanvasGradient): Self = StObject.set(x, "waveColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaveColorUndefined: Self = StObject.set(x, "waveColor", js.undefined)
      
      @scala.inline
      def setXhr(value: XHROptions): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait WaveSurferUtil extends StObject {
    
    var Observer: typings.wavesurferJs.mod.Observer
    
    def ajax(options: Xhr): Observer
    
    def extend(dest: js.Object, sources: js.Object*): js.Object
    
    def frame(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Double]
    
    def getId(): String
    
    def max(values: js.Array[Double]): Double
    
    def min(values: js.Array[Double]): Double
    
    def preventClick(): Unit
    
    def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]
    
    def style(el: HTMLElement, styles: StringDictionary[String]): HTMLElement
  }
  object WaveSurferUtil {
    
    @scala.inline
    def apply(
      Observer: Observer,
      ajax: Xhr => Observer,
      extend: (js.Object, /* repeated */ js.Object) => js.Object,
      frame: js.Function1[/* repeated */ js.Any, Unit] => js.Function1[/* repeated */ js.Any, Double],
      getId: () => String,
      max: js.Array[Double] => Double,
      min: js.Array[Double] => Double,
      preventClick: () => Unit,
      requestAnimationFrame: () => js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double],
      style: (HTMLElement, StringDictionary[String]) => HTMLElement
    ): WaveSurferUtil = {
      val __obj = js.Dynamic.literal(Observer = Observer.asInstanceOf[js.Any], ajax = js.Any.fromFunction1(ajax), extend = js.Any.fromFunction2(extend), frame = js.Any.fromFunction1(frame), getId = js.Any.fromFunction0(getId), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), preventClick = js.Any.fromFunction0(preventClick), requestAnimationFrame = js.Any.fromFunction0(requestAnimationFrame), style = js.Any.fromFunction2(style))
      __obj.asInstanceOf[WaveSurferUtil]
    }
    
    @scala.inline
    implicit class WaveSurferUtilMutableBuilder[Self <: WaveSurferUtil] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjax(value: Xhr => Observer): Self = StObject.set(x, "ajax", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtend(value: (js.Object, /* repeated */ js.Object) => js.Object): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFrame(value: js.Function1[/* repeated */ js.Any, Unit] => js.Function1[/* repeated */ js.Any, Double]): Self = StObject.set(x, "frame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMax(value: js.Array[Double] => Double): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMin(value: js.Array[Double] => Double): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      @scala.inline
      def setObserver(value: Observer): Self = StObject.set(x, "Observer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventClick(value: () => Unit): Self = StObject.set(x, "preventClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequestAnimationFrame(value: () => js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStyle(value: (HTMLElement, StringDictionary[String]) => HTMLElement): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
    }
  }
  
  trait XHROptions extends StObject {
    
    var requestHeaders: js.UndefOr[js.Array[XHRRequestHeader]] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object XHROptions {
    
    @scala.inline
    def apply(): XHROptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XHROptions]
    }
    
    @scala.inline
    implicit class XHROptionsMutableBuilder[Self <: XHROptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestHeaders(value: js.Array[XHRRequestHeader]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      @scala.inline
      def setRequestHeadersVarargs(value: XHRRequestHeader*): Self = StObject.set(x, "requestHeaders", js.Array(value :_*))
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait XHRRequestHeader extends StObject {
    
    var key: String
    
    var value: String
  }
  object XHRRequestHeader {
    
    @scala.inline
    def apply(key: String, value: String): XHRRequestHeader = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[XHRRequestHeader]
    }
    
    @scala.inline
    implicit class XHRRequestHeaderMutableBuilder[Self <: XHRRequestHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
