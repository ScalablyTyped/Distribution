package typings.wavesurferJs

import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.wavesurferJs.typesPluginMod.PluginDefinition
import typings.wavesurferJs.typesPluginMod.PluginParams
import typings.wavesurferJs.wavesurferJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPluginTimelineMod {
  
  @JSImport("wavesurfer.js/src/plugin/timeline", JSImport.Default)
  @js.native
  open class default protected () extends TimelinePlugin {
    def this(params: TimelinePluginParams, ws: typings.wavesurferJs.srcWavesurferMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/plugin/timeline", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: TimelinePluginParams): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wavesurferJs.typesPluginMod.WaveSurferPlugin because Inheritance from two classes. Inlined init, destroy */ @js.native
  trait TimelinePlugin
    extends typings.wavesurferJs.srcUtilObserverMod.default {
    
    /** Add new timeline canvas. */
    def addCanvas(): Unit = js.native
    
    val canvases: js.Array[HTMLCanvasElement] = js.native
    
    val container: String | HTMLElement = js.native
    
    /** Create a timeline element to wrap the canvases drawn by this plugin. */
    def createWrapper(): Unit = js.native
    
    /** Turn the time into a suitable label for the time. */
    def defaultFormatTimeCallback(seconds: Double, pxPerSec: Double): Double = js.native
    
    /** Return the cadence of notches that get labels in the primary color. */
    def defaultPrimaryLabelInterval(pxPerSec: Double): Double = js.native
    
    /** Return the cadence of notches that get labels in the secondary color. */
    def defaultSecondaryLabelInterval(pxPerSec: Double): Double = js.native
    
    /** Return how many seconds should be between each notch. */
    def defaultTimeInterval(pxPerSec: Double): Double = js.native
    
    def destroy(): Unit = js.native
    
    /** Draw a rectangle on the canvases. */
    def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /** Fill a given text on the canvases. */
    def fillText(text: String, x: Double, y: Double): Unit = js.native
    
    def init(): Unit = js.native
    
    val params: TimelinePluginParams = js.native
    
    /** Remove timeline canvas. */
    def removeCanvas(): Unit = js.native
    
    /** Render the timeline (also updates the already rendered timeline). */
    def render(): Unit = js.native
    
    /** Render the timeline labels and notches. */
    def renderCanvases(): Unit = js.native
    
    /** Set the canvas fill style. */
    def setFillStyles(fillStyle: String): Unit = js.native
    def setFillStyles(fillStyle: CanvasGradient): Unit = js.native
    def setFillStyles(fillStyle: CanvasPattern): Unit = js.native
    
    /** Set the canvas font. */
    def setFonts(font: String): Unit = js.native
    
    /** Make sure the correct of timeline canvas elements exist and are cached in this.canvases. */
    def updateCanvases(): Unit = js.native
    
    /** Update the dimensions and positioning style for all the timeline canvases. */
    def updateCanvasesPositioning(): Unit = js.native
    
    val util: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util'] */ js.Any = js.native
    
    val wavesurfer: typings.wavesurferJs.srcWavesurferMod.default = js.native
    
    val wrapper: HTMLElement = js.native
  }
  
  trait TimelinePluginParams
    extends StObject
       with PluginParams {
    
    /** CSS selector or HTML element where the timeline should be drawn. This is the only required parameter. */
    var container: String | HTMLElement
    
    /** Length of the track in seconds. Overrides getDuration() for setting length of timeline. */
    var duration: js.UndefOr[Double | Null] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font size of labels in pixels (default: 10). */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var formatTimecallback: js.UndefOr[js.Function2[/* sec */ Double, /* pxPerSec */ Double, String]] = js.undefined
    
    /** The padding between the label and the notch (default: 5). */
    var labelPadding: js.UndefOr[Double] = js.undefined
    
    /** Height of notches in percent (default: 90). */
    var notchPercentHeight: js.UndefOr[Double] = js.undefined
    
    /** Offset for the timeline start in seconds. May also be negative. */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** The colour of the main notches (default: '#000'). */
    var primaryColor: js.UndefOr[String] = js.undefined
    
    /** The colour of the labels next to the main notches (default: '#000'). */
    var primaryFontColor: js.UndefOr[String] = js.undefined
    
    /** Cadence between labels in primary color. */
    var primaryLabelInterval: js.UndefOr[js.Function1[/* pxPerSec */ Double, Double]] = js.undefined
    
    /** The colour of the secondary notches (default: '#c0c0c0'). */
    var secondaryColor: js.UndefOr[String] = js.undefined
    
    /** The colour of the labels next to the secondary notches (default: '#000'). */
    var secondaryFontColor: js.UndefOr[String] = js.undefined
    
    /** Cadence between labels in secondary color. */
    var secondaryLabelInterval: js.UndefOr[js.Function1[/* pxPerSec */ Double, Double]] = js.undefined
    
    var timeInterval: js.UndefOr[js.Function1[/* pxPerSec */ Double, Double]] = js.undefined
    
    /** The colour of the notches that do not have labels (default: '#c0c0c0'). */
    var unlabeledNotchColor: js.UndefOr[String] = js.undefined
    
    /** A debounce timeout to increase rendering performance for large files. */
    var zoomDebounce: js.UndefOr[Double | `false`] = js.undefined
  }
  object TimelinePluginParams {
    
    inline def apply(container: String | HTMLElement): TimelinePluginParams = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelinePluginParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimelinePluginParams] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationNull: Self = StObject.set(x, "duration", null)
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFormatTimecallback(value: (/* sec */ Double, /* pxPerSec */ Double) => String): Self = StObject.set(x, "formatTimecallback", js.Any.fromFunction2(value))
      
      inline def setFormatTimecallbackUndefined: Self = StObject.set(x, "formatTimecallback", js.undefined)
      
      inline def setLabelPadding(value: Double): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      inline def setNotchPercentHeight(value: Double): Self = StObject.set(x, "notchPercentHeight", value.asInstanceOf[js.Any])
      
      inline def setNotchPercentHeightUndefined: Self = StObject.set(x, "notchPercentHeight", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      inline def setPrimaryFontColor(value: String): Self = StObject.set(x, "primaryFontColor", value.asInstanceOf[js.Any])
      
      inline def setPrimaryFontColorUndefined: Self = StObject.set(x, "primaryFontColor", js.undefined)
      
      inline def setPrimaryLabelInterval(value: /* pxPerSec */ Double => Double): Self = StObject.set(x, "primaryLabelInterval", js.Any.fromFunction1(value))
      
      inline def setPrimaryLabelIntervalUndefined: Self = StObject.set(x, "primaryLabelInterval", js.undefined)
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
      
      inline def setSecondaryFontColor(value: String): Self = StObject.set(x, "secondaryFontColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryFontColorUndefined: Self = StObject.set(x, "secondaryFontColor", js.undefined)
      
      inline def setSecondaryLabelInterval(value: /* pxPerSec */ Double => Double): Self = StObject.set(x, "secondaryLabelInterval", js.Any.fromFunction1(value))
      
      inline def setSecondaryLabelIntervalUndefined: Self = StObject.set(x, "secondaryLabelInterval", js.undefined)
      
      inline def setTimeInterval(value: /* pxPerSec */ Double => Double): Self = StObject.set(x, "timeInterval", js.Any.fromFunction1(value))
      
      inline def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
      
      inline def setUnlabeledNotchColor(value: String): Self = StObject.set(x, "unlabeledNotchColor", value.asInstanceOf[js.Any])
      
      inline def setUnlabeledNotchColorUndefined: Self = StObject.set(x, "unlabeledNotchColor", js.undefined)
      
      inline def setZoomDebounce(value: Double | `false`): Self = StObject.set(x, "zoomDebounce", value.asInstanceOf[js.Any])
      
      inline def setZoomDebounceUndefined: Self = StObject.set(x, "zoomDebounce", js.undefined)
    }
  }
}
