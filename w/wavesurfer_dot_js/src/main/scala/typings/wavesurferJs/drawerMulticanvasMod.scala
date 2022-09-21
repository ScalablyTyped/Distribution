package typings.wavesurferJs

import org.scalablytyped.runtime.Instantiable0
import typings.std.HTMLElement
import typings.wavesurferJs.backendMod.Peaks
import typings.wavesurferJs.paramsMod.WaveSurferParams
import typings.wavesurferJs.typesUtilMod.DrawingContextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMulticanvasMod {
  
  @JSImport("wavesurfer.js/src/drawer.multicanvas", JSImport.Default)
  @js.native
  open class default protected () extends MultiCanvas {
    def this(container: HTMLElement, params: WaveSurferParams) = this()
  }
  
  trait DrawParams extends StObject {
    
    var absmax: Double
    
    var channelIndex: Double
    
    var halfH: Double
    
    var hasMinVals: Boolean
    
    var height: Double
    
    var offsetY: Double
    
    var peaks: Peaks
  }
  object DrawParams {
    
    inline def apply(
      absmax: Double,
      channelIndex: Double,
      halfH: Double,
      hasMinVals: Boolean,
      height: Double,
      offsetY: Double,
      peaks: Peaks
    ): DrawParams = {
      val __obj = js.Dynamic.literal(absmax = absmax.asInstanceOf[js.Any], channelIndex = channelIndex.asInstanceOf[js.Any], halfH = halfH.asInstanceOf[js.Any], hasMinVals = hasMinVals.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], peaks = peaks.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawParams]
    }
    
    extension [Self <: DrawParams](x: Self) {
      
      inline def setAbsmax(value: Double): Self = StObject.set(x, "absmax", value.asInstanceOf[js.Any])
      
      inline def setChannelIndex(value: Double): Self = StObject.set(x, "channelIndex", value.asInstanceOf[js.Any])
      
      inline def setHalfH(value: Double): Self = StObject.set(x, "halfH", value.asInstanceOf[js.Any])
      
      inline def setHasMinVals(value: Boolean): Self = StObject.set(x, "hasMinVals", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setPeaks(value: Peaks): Self = StObject.set(x, "peaks", value.asInstanceOf[js.Any])
      
      inline def setPeaksVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "peaks", js.Array(value*))
    }
  }
  
  @js.native
  trait MultiCanvas
    extends typings.wavesurferJs.drawerMod.default {
    
    /** Class used to generate entries. */
    val EntryClass: Instantiable0[typings.wavesurferJs.drawerCanvasentryMod.default] = js.native
    
    /** Add a canvas to the canvas list. */
    def addCanvas(): Unit = js.native
    
    /** Set the canvas transforms for a certain entry (wave and progress). */
    def applyCanvasTransforms(entry: typings.wavesurferJs.drawerCanvasentryMod.default, vertical: Boolean): Unit = js.native
    
    /** The radius of the wave bars. */
    val barRadius: Double = js.native
    
    /** Canvas 2d context attributes. */
    val canvasContextAttributes: DrawingContextAttributes = js.native
    
    val canvases: js.Array[typings.wavesurferJs.drawerCanvasentryMod.default] = js.native
    
    /** Clear the whole multi-canvas. */
    def clearWave(): Unit = js.native
    
    /** Create the canvas elements and style them. */
    def createElements(): Unit = js.native
    
    /** Draw a waveform with bars. */
    def drawBars(peaks: Peaks, channelIndex: Double, start: Double, end: Double): Unit = js.native
    
    /** Tell the canvas entries to render their portion of the waveform. */
    def drawLine(
      peaks: js.Array[Double],
      absmax: Double,
      halfH: Double,
      offsetY: Double,
      start: Double,
      end: Double,
      channelIndex: Double
    ): Unit = js.native
    
    /** Draw a waveform. */
    def drawWave(peaks: Peaks, channelIndex: Double, start: Double, end: Double): Unit = js.native
    
    /** Draw a rectangle on the multi-canvas. */
    def fillRect(x: Double, y: Double, width: Double, height: Double, radius: Double, channelIndex: Double): Unit = js.native
    
    /** Return image data of the multi-canvas. */
    def getImage(format: String, quality: Double, `type`: String): String | js.Array[String] | (js.Promise[String | js.Array[String]]) = js.native
    
    val halfPixel: Double = js.native
    
    /** Whether or not the progress wave is rendered. */
    val hasProgressCanvas: Boolean = js.native
    
    /** Returns whether to hide the channel from being drawn based on params. */
    def hideChannel(channelIndex: Double): Unit = js.native
    
    /** Initialize the drawer. */
    def init(): Unit = js.native
    
    val maxCanvasElementWidth: Double = js.native
    
    val maxCanvasWidth: Double = js.native
    
    /** Overlap added between entries to prevent vertical white stripes between canvas elements. */
    val overlap: Double = js.native
    
    /** Performs preparation tasks and calculations which are shared by drawBars and drawWave. */
    def prepareDraw(
      peaks: Peaks,
      channelIndex: Double,
      start: Double,
      end: Double,
      fn: js.Function1[/* arg */ DrawParams, Unit],
      drawIndex: Double,
      normalizedMax: Double
    ): Unit = js.native
    
    val progressWave: HTMLElement = js.native
    
    /** Pop single canvas from the list. */
    def removeCanvas(): Unit = js.native
    
    /** Set the fill styles for a certain entry (wave and progress). */
    def setFillStyles(entry: typings.wavesurferJs.drawerCanvasentryMod.default, waveColor: String, progressColor: String): Unit = js.native
    
    /** Update cursor style. */
    def updateCursor(): Unit = js.native
    
    /** Update the dimensions of a canvas element. */
    def updateDimensions(entry: typings.wavesurferJs.drawerCanvasentryMod.default, width: Double, heihgt: Double): Unit = js.native
    
    /** Render the new progress. */
    def updateProgress(position: Double): Unit = js.native
    
    /** Adjust to the updated size by adding or removing canvases. */
    def updateSize(): Unit = js.native
    
    /** Whether to render the waveform vertically. */
    val vertical: Boolean = js.native
  }
}
