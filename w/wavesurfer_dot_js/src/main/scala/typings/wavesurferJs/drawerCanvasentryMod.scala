package typings.wavesurferJs

import typings.std.CanvasGradient
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.wavesurferJs.typesUtilMod.DrawingContextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerCanvasentryMod {
  
  @JSImport("wavesurfer.js/src/drawer.canvasentry", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CanvasEntry {
    
    /** Set the canvas transforms for wave and progress. */
    /* CompleteClass */
    override def applyCanvasTransforms(vertical: Boolean): Unit = js.native
    
    /** Canvas 2d context attributes. */
    /* CompleteClass */
    override val canvasContextAttributes: DrawingContextAttributes = js.native
    
    /** Clear the wave and progress rendering contexts. */
    /* CompleteClass */
    override def clearWave(): Unit = js.native
    
    /** Destroys this entry. */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /** Render the actual waveform line on a canvas element. */
    /* CompleteClass */
    override def drawLineToContext(
      ctx: CanvasRenderingContext2D,
      peaks: js.Array[Double],
      absmax: Double,
      halfH: Double,
      offsetY: Double,
      start: Double,
      end: Double
    ): Unit = js.native
    
    /** Render the actual wave and progress lines. */
    /* CompleteClass */
    override def drawLines(
      peaks: js.Array[Double],
      absmax: Double,
      halfH: Double,
      offsetY: Double,
      start: Double,
      end: Double
    ): Unit = js.native
    
    /** Draw a rounded rectangle on Canvas. */
    /* CompleteClass */
    override def drawRoundedRect(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double, radius: Double): Unit = js.native
    
    /** End of the area the canvas should render, between 0 and 1. */
    /* CompleteClass */
    override val end: Double = js.native
    
    /** Draw the actual rectangle on a canvas element. */
    /* CompleteClass */
    override def fillRectToContext(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double, radius: Double): Unit = js.native
    
    /** Draw a rectangle for wave and progress. */
    /* CompleteClass */
    override def fillRects(x: Double, y: Double, width: Double, height: Double, radius: Double): Unit = js.native
    
    /** Utility function to handle wave color arguments. */
    /* CompleteClass */
    override def getFillStyle(ctx: CanvasRenderingContext2D, color: String): String | CanvasGradient = js.native
    
    /** Return image data of the wave canvas element. */
    /* CompleteClass */
    override def getImage(format: String, quality: Double, `type`: String): String | js.Promise[String] = js.native
    
    /** Unique identifier for this entry. */
    /* CompleteClass */
    override val id: String = js.native
    
    /** Store the progress wave canvas element and create the 2D rendering context. */
    /* CompleteClass */
    override def initProgress(element: HTMLCanvasElement): String = js.native
    
    /** Store the wave canvas element and create the 2D rendering context. */
    /* CompleteClass */
    override def initWave(element: HTMLCanvasElement): String = js.native
    
    /** The (optional) progress wave node. */
    /* CompleteClass */
    override val progress: HTMLCanvasElement = js.native
    
    /** The (optional) progress wave canvas rendering context. */
    /* CompleteClass */
    override val progressCtx: CanvasRenderingContext2D = js.native
    
    /** Set the fill styles for wave and progress. */
    /* CompleteClass */
    override def setFillStyles(waveColor: String, progressColor: String): Unit = js.native
    
    /** Start of the area the canvas should render, between 0 and 1. */
    /* CompleteClass */
    override val start: Double = js.native
    
    /** Update the dimensions. */
    /* CompleteClass */
    override def updateDimensions(elementWidth: Double, totalWidth: Double, width: Double, height: Double): Unit = js.native
    
    /** The wave node. */
    /* CompleteClass */
    override val wave: HTMLCanvasElement = js.native
    
    /** The wave canvas rendering context. */
    /* CompleteClass */
    override val waveCtx: CanvasRenderingContext2D = js.native
  }
  
  trait CanvasEntry extends StObject {
    
    /** Set the canvas transforms for wave and progress. */
    def applyCanvasTransforms(vertical: Boolean): Unit
    
    /** Canvas 2d context attributes. */
    val canvasContextAttributes: DrawingContextAttributes
    
    /** Clear the wave and progress rendering contexts. */
    def clearWave(): Unit
    
    /** Destroys this entry. */
    def destroy(): Unit
    
    /** Render the actual waveform line on a canvas element. */
    def drawLineToContext(
      ctx: CanvasRenderingContext2D,
      peaks: js.Array[Double],
      absmax: Double,
      halfH: Double,
      offsetY: Double,
      start: Double,
      end: Double
    ): Unit
    
    /** Render the actual wave and progress lines. */
    def drawLines(
      peaks: js.Array[Double],
      absmax: Double,
      halfH: Double,
      offsetY: Double,
      start: Double,
      end: Double
    ): Unit
    
    /** Draw a rounded rectangle on Canvas. */
    def drawRoundedRect(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double, radius: Double): Unit
    
    /** End of the area the canvas should render, between 0 and 1. */
    val end: Double
    
    /** Draw the actual rectangle on a canvas element. */
    def fillRectToContext(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double, radius: Double): Unit
    
    /** Draw a rectangle for wave and progress. */
    def fillRects(x: Double, y: Double, width: Double, height: Double, radius: Double): Unit
    
    /** Utility function to handle wave color arguments. */
    def getFillStyle(ctx: CanvasRenderingContext2D, color: String): String | CanvasGradient
    
    /** Return image data of the wave canvas element. */
    def getImage(format: String, quality: Double, `type`: String): String | js.Promise[String]
    
    /** Unique identifier for this entry. */
    val id: String
    
    /** Store the progress wave canvas element and create the 2D rendering context. */
    def initProgress(element: HTMLCanvasElement): String
    
    /** Store the wave canvas element and create the 2D rendering context. */
    def initWave(element: HTMLCanvasElement): String
    
    /** The (optional) progress wave node. */
    val progress: HTMLCanvasElement
    
    /** The (optional) progress wave canvas rendering context. */
    val progressCtx: CanvasRenderingContext2D
    
    /** Set the fill styles for wave and progress. */
    def setFillStyles(waveColor: String, progressColor: String): Unit
    
    /** Start of the area the canvas should render, between 0 and 1. */
    val start: Double
    
    /** Update the dimensions. */
    def updateDimensions(elementWidth: Double, totalWidth: Double, width: Double, height: Double): Unit
    
    /** The wave node. */
    val wave: HTMLCanvasElement
    
    /** The wave canvas rendering context. */
    val waveCtx: CanvasRenderingContext2D
  }
  object CanvasEntry {
    
    inline def apply(
      applyCanvasTransforms: Boolean => Unit,
      canvasContextAttributes: DrawingContextAttributes,
      clearWave: () => Unit,
      destroy: () => Unit,
      drawLineToContext: (CanvasRenderingContext2D, js.Array[Double], Double, Double, Double, Double, Double) => Unit,
      drawLines: (js.Array[Double], Double, Double, Double, Double, Double) => Unit,
      drawRoundedRect: (CanvasRenderingContext2D, Double, Double, Double, Double, Double) => Unit,
      end: Double,
      fillRectToContext: (CanvasRenderingContext2D, Double, Double, Double, Double, Double) => Unit,
      fillRects: (Double, Double, Double, Double, Double) => Unit,
      getFillStyle: (CanvasRenderingContext2D, String) => String | CanvasGradient,
      getImage: (String, Double, String) => String | js.Promise[String],
      id: String,
      initProgress: HTMLCanvasElement => String,
      initWave: HTMLCanvasElement => String,
      progress: HTMLCanvasElement,
      progressCtx: CanvasRenderingContext2D,
      setFillStyles: (String, String) => Unit,
      start: Double,
      updateDimensions: (Double, Double, Double, Double) => Unit,
      wave: HTMLCanvasElement,
      waveCtx: CanvasRenderingContext2D
    ): CanvasEntry = {
      val __obj = js.Dynamic.literal(applyCanvasTransforms = js.Any.fromFunction1(applyCanvasTransforms), canvasContextAttributes = canvasContextAttributes.asInstanceOf[js.Any], clearWave = js.Any.fromFunction0(clearWave), destroy = js.Any.fromFunction0(destroy), drawLineToContext = js.Any.fromFunction7(drawLineToContext), drawLines = js.Any.fromFunction6(drawLines), drawRoundedRect = js.Any.fromFunction6(drawRoundedRect), end = end.asInstanceOf[js.Any], fillRectToContext = js.Any.fromFunction6(fillRectToContext), fillRects = js.Any.fromFunction5(fillRects), getFillStyle = js.Any.fromFunction2(getFillStyle), getImage = js.Any.fromFunction3(getImage), id = id.asInstanceOf[js.Any], initProgress = js.Any.fromFunction1(initProgress), initWave = js.Any.fromFunction1(initWave), progress = progress.asInstanceOf[js.Any], progressCtx = progressCtx.asInstanceOf[js.Any], setFillStyles = js.Any.fromFunction2(setFillStyles), start = start.asInstanceOf[js.Any], updateDimensions = js.Any.fromFunction4(updateDimensions), wave = wave.asInstanceOf[js.Any], waveCtx = waveCtx.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasEntry]
    }
    
    extension [Self <: CanvasEntry](x: Self) {
      
      inline def setApplyCanvasTransforms(value: Boolean => Unit): Self = StObject.set(x, "applyCanvasTransforms", js.Any.fromFunction1(value))
      
      inline def setCanvasContextAttributes(value: DrawingContextAttributes): Self = StObject.set(x, "canvasContextAttributes", value.asInstanceOf[js.Any])
      
      inline def setClearWave(value: () => Unit): Self = StObject.set(x, "clearWave", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDrawLineToContext(
        value: (CanvasRenderingContext2D, js.Array[Double], Double, Double, Double, Double, Double) => Unit
      ): Self = StObject.set(x, "drawLineToContext", js.Any.fromFunction7(value))
      
      inline def setDrawLines(value: (js.Array[Double], Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "drawLines", js.Any.fromFunction6(value))
      
      inline def setDrawRoundedRect(value: (CanvasRenderingContext2D, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "drawRoundedRect", js.Any.fromFunction6(value))
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setFillRectToContext(value: (CanvasRenderingContext2D, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "fillRectToContext", js.Any.fromFunction6(value))
      
      inline def setFillRects(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "fillRects", js.Any.fromFunction5(value))
      
      inline def setGetFillStyle(value: (CanvasRenderingContext2D, String) => String | CanvasGradient): Self = StObject.set(x, "getFillStyle", js.Any.fromFunction2(value))
      
      inline def setGetImage(value: (String, Double, String) => String | js.Promise[String]): Self = StObject.set(x, "getImage", js.Any.fromFunction3(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInitProgress(value: HTMLCanvasElement => String): Self = StObject.set(x, "initProgress", js.Any.fromFunction1(value))
      
      inline def setInitWave(value: HTMLCanvasElement => String): Self = StObject.set(x, "initWave", js.Any.fromFunction1(value))
      
      inline def setProgress(value: HTMLCanvasElement): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "progressCtx", value.asInstanceOf[js.Any])
      
      inline def setSetFillStyles(value: (String, String) => Unit): Self = StObject.set(x, "setFillStyles", js.Any.fromFunction2(value))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setUpdateDimensions(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "updateDimensions", js.Any.fromFunction4(value))
      
      inline def setWave(value: HTMLCanvasElement): Self = StObject.set(x, "wave", value.asInstanceOf[js.Any])
      
      inline def setWaveCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "waveCtx", value.asInstanceOf[js.Any])
    }
  }
}
