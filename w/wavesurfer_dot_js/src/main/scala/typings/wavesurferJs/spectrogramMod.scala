package typings.wavesurferJs

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import typings.wavesurferJs.anon.ArrayRGBAlength256
import typings.wavesurferJs.markersMod.Marker
import typings.wavesurferJs.markersMod.MarkerParams
import typings.wavesurferJs.pluginMod.PluginDefinition
import typings.wavesurferJs.pluginMod.PluginParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spectrogramMod {
  
  @JSImport("wavesurfer.js/src/plugin/spectrogram", JSImport.Default)
  @js.native
  open class default protected () extends SpectrogramPlugin {
    def this(params: SpectrogramPluginParams, ws: typings.wavesurferJs.wavesurferMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/plugin/spectrogram", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: SpectrogramPluginParams): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  type RGBA = js.Tuple4[Double, Double, Double, Double]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wavesurferJs.pluginMod.WaveSurferPlugin because Inheritance from two classes. Inlined init, destroy */ @js.native
  trait SpectrogramPlugin
    extends typings.wavesurferJs.observerMod.default {
    
    val alpha: Double = js.native
    
    val colorMap: js.Array[js.Array[Double]] = js.native
    
    val container: HTMLElement = js.native
    
    def destroy(): Unit = js.native
    
    val drawer: typings.wavesurferJs.drawerMod.default = js.native
    
    val fftSamples: Double = js.native
    
    val frequenciesDataUrl: String = js.native
    
    val height: Double = js.native
    
    def init(): Unit = js.native
    
    val noverlap: Double = js.native
    
    val params: SpectrogramPluginParams = js.native
    
    val pixelRatio: Double = js.native
    
    val spectrCc: CanvasRenderingContext2D = js.native
    
    val util: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util'] */ js.Any = js.native
    
    val wavesurfer: typings.wavesurferJs.wavesurferMod.default = js.native
    
    val width: Double = js.native
    
    val windowFunc: WindowFunction = js.native
    
    val wrapper: HTMLElement = js.native
  }
  
  trait SpectrogramPluginParams
    extends StObject
       with PluginParams {
    
    /** Some window functions have this extra value (between 0 and 1). */
    var alpha: js.UndefOr[Double] = js.undefined
    
    /** A 256 long array of 4-element arrays. Each entry should contain a float between 0 and 1 and specify r, g, b, and alpha. */
    var colorMap: js.UndefOr[ArrayRGBAlength256] = js.undefined
    
    /** Selector of element or element in which to render. */
    var container: String | HTMLElement
    
    /** Number of samples to fetch to FFT. Must be a power of 2. */
    var fftSamples: js.UndefOr[Double] = js.undefined
    
    /** Set to true to display frequency labels. */
    var labels: js.UndefOr[Boolean] = js.undefined
    
    /** Size of the overlapping window. Must be < fftSamples. Auto deduced from canvas size by default. */
    var noverlap: js.UndefOr[Double] = js.undefined
    
    /** Controls the size of the spectrogram in relation with its canvas (1 = Draw on the whole canvas. 2 = Draw on a quarter, i.e. 1/2 the length and 1/2 the width). */
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /** Render with separate spectograms for the channels of the audio. */
    var splitChannels: js.UndefOr[Boolean] = js.undefined
    
    /** The window function to be used. */
    var windowFunc: js.UndefOr[WindowFunction] = js.undefined
  }
  object SpectrogramPluginParams {
    
    inline def apply(container: String | HTMLElement): SpectrogramPluginParams = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpectrogramPluginParams]
    }
    
    extension [Self <: SpectrogramPluginParams](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setColorMap(value: ArrayRGBAlength256): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
      
      inline def setColorMapUndefined: Self = StObject.set(x, "colorMap", js.undefined)
      
      inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setFftSamples(value: Double): Self = StObject.set(x, "fftSamples", value.asInstanceOf[js.Any])
      
      inline def setFftSamplesUndefined: Self = StObject.set(x, "fftSamples", js.undefined)
      
      inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setNoverlap(value: Double): Self = StObject.set(x, "noverlap", value.asInstanceOf[js.Any])
      
      inline def setNoverlapUndefined: Self = StObject.set(x, "noverlap", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setSplitChannels(value: Boolean): Self = StObject.set(x, "splitChannels", value.asInstanceOf[js.Any])
      
      inline def setSplitChannelsUndefined: Self = StObject.set(x, "splitChannels", js.undefined)
      
      inline def setWindowFunc(value: WindowFunction): Self = StObject.set(x, "windowFunc", value.asInstanceOf[js.Any])
      
      inline def setWindowFuncUndefined: Self = StObject.set(x, "windowFunc", js.undefined)
    }
  }
  
  object WavesurferAugmentingMod {
    
    trait WaveSurfer extends StObject {
      
      def addMarker(param: MarkerParams): Marker
      
      def clearMarkers(): Unit
    }
    object WaveSurfer {
      
      inline def apply(addMarker: MarkerParams => Marker, clearMarkers: () => Unit): WaveSurfer = {
        val __obj = js.Dynamic.literal(addMarker = js.Any.fromFunction1(addMarker), clearMarkers = js.Any.fromFunction0(clearMarkers))
        __obj.asInstanceOf[WaveSurfer]
      }
      
      extension [Self <: WaveSurfer](x: Self) {
        
        inline def setAddMarker(value: MarkerParams => Marker): Self = StObject.set(x, "addMarker", js.Any.fromFunction1(value))
        
        inline def setClearMarkers(value: () => Unit): Self = StObject.set(x, "clearMarkers", js.Any.fromFunction0(value))
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wavesurferJs.wavesurferJsStrings.bartlett
    - typings.wavesurferJs.wavesurferJsStrings.bartlettHann
    - typings.wavesurferJs.wavesurferJsStrings.blackman
    - typings.wavesurferJs.wavesurferJsStrings.cosine
    - typings.wavesurferJs.wavesurferJsStrings.gauss
    - typings.wavesurferJs.wavesurferJsStrings.hamming
    - typings.wavesurferJs.wavesurferJsStrings.hann
    - typings.wavesurferJs.wavesurferJsStrings.lanczoz
    - typings.wavesurferJs.wavesurferJsStrings.rectangular
    - typings.wavesurferJs.wavesurferJsStrings.triangular
  */
  trait WindowFunction extends StObject
  object WindowFunction {
    
    inline def bartlett: typings.wavesurferJs.wavesurferJsStrings.bartlett = "bartlett".asInstanceOf[typings.wavesurferJs.wavesurferJsStrings.bartlett]
    
    inline def bartlettHann: typings.wavesurferJs.wavesurferJsStrings.bartlettHann = "bartlettHann".asInstanceOf[typings.wavesurferJs.wavesurferJsStrings.bartlettHann]
    
    inline def blackman: typings.wavesurferJs.wavesurferJsStrings.blackman = "blackman".asInstanceOf[typings.wavesurferJs.wavesurferJsStrings.blackman]
    
    inline def cosine: typings.wavesurferJs.wavesurferJsStrings.cosine = "cosine".asInstanceOf[typings.wavesurferJs.wavesurferJsStrings.cosine]
    
    inline def gauss: typings.wavesurferJs.wavesurferJsStrings.gauss = "gauss".asInstanceOf[typings.wavesurferJs.wavesurferJsStrings.gauss]
    
    inline def hamming: typings.wavesurferJs.wavesurferJsStrings.hamming = "hamming".asInstanceOf[typings.wavesurferJs.wavesurferJsStrings.hamming]
    
    inline def hann: typings.wavesurferJs.wavesurferJsStrings.hann = "hann".asInstanceOf[typings.wavesurferJs.wavesurferJsStrings.hann]
    
    inline def lanczoz: typings.wavesurferJs.wavesurferJsStrings.lanczoz = "lanczoz".asInstanceOf[typings.wavesurferJs.wavesurferJsStrings.lanczoz]
    
    inline def rectangular: typings.wavesurferJs.wavesurferJsStrings.rectangular = "rectangular".asInstanceOf[typings.wavesurferJs.wavesurferJsStrings.rectangular]
    
    inline def triangular: typings.wavesurferJs.wavesurferJsStrings.triangular = "triangular".asInstanceOf[typings.wavesurferJs.wavesurferJsStrings.triangular]
  }
}
