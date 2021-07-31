package typings.wordcloud

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(elements: js.Array[HTMLElement], options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(elements: HTMLElement, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("wordcloud", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wordcloud", "isSupported")
  @js.native
  val isSupported: Boolean = js.native
  
  @JSImport("wordcloud", "miniumFontSize")
  @js.native
  def miniumFontSize: Double = js.native
  @scala.inline
  def miniumFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("miniumFontSize")(x.asInstanceOf[js.Any])
  
  trait Dimension extends StObject {
    
    var h: Double
    
    var w: Double
    
    var x: Double
    
    var y: Double
  }
  object Dimension {
    
    @scala.inline
    def apply(h: Double, w: Double, x: Double, y: Double): Dimension = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimension]
    }
    
    @scala.inline
    implicit class DimensionMutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type EventCallback = js.Function3[/* item */ ListEntry, /* dimension */ Dimension, /* event */ MouseEvent, Unit]
  
  type ListEntry = js.Tuple2[String, Double]
  
  trait Options extends StObject {
    
    /** callback function to call when abort. */
    var abort: js.UndefOr[js.Function] = js.undefined
    
    /** If the call with in the loop takes more than x milliseconds (and blocks the browser), abort immediately. */
    var abortThreshold: js.UndefOr[Double] = js.undefined
    
    /** color of the background. */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * for DOM clouds, allows the user to define the class of the span elements.Can be a normal class
      * string, applying the same class to every span or a callback(word, weight, fontSize, distance, theta)
      * for per-span class definition. In canvas clouds or if equals null, this option has no effect.
      */
    var classes: js.UndefOr[
        String | (js.Function5[
          /* word */ String, 
          /* weight */ String | Double, 
          /* fontSize */ Double, 
          /* distance */ Double, 
          /* theta */ Double, 
          String
        ])
      ] = js.undefined
    
    /** paint the entire canvas with background color and consider it empty before start. */
    var clearCanvas: js.UndefOr[Boolean] = js.undefined
    
    /**
      * callback to call when the user clicks on a word. The callback will take arugments
      * callback(item, dimension,  event), where event is the original click event. This only will work on HTML5
      * canvas word clouds.
      */
    var click: js.UndefOr[EventCallback] = js.undefined
    
    /**
      * color of the text, can be any CSS color, or a callback(word, weight, fontSize, distance, theta)
      * specifies  different color for each item in the list. You may also specify colors with built-in
      * keywords: random-dark and random-light.
      */
    var color: js.UndefOr[
        String | (js.Function5[
          /* word */ String, 
          /* weight */ String | Double, 
          /* fontSize */ Double, 
          /* distance */ Double, 
          /* theta */ Double, 
          String
        ])
      ] = js.undefined
    
    /** visualize the grid by draw squares to mask the drawn areas. */
    var drawMask: js.UndefOr[Boolean] = js.undefined
    
    /** set to true to allow word being draw partly outside of the canvas. Allow word bigger than the size of the canvas to be drawn. */
    var drawOutOfBound: js.UndefOr[Boolean] = js.undefined
    
    /** degree of "flatness" of the shape wordcloud2.js should draw. */
    var ellipticity: js.UndefOr[Double] = js.undefined
    
    /** font to use. */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** font weight to use, e.g. normal, bold or 600 */
    var fontWeight: js.UndefOr[String | Double] = js.undefined
    
    /**
      * size of the grid in pixels for marking the availability of the canvas — the larger the grid size,
      * the  bigger the gap between words.
      */
    var gridSize: js.UndefOr[Double] = js.undefined
    
    /**
      * callback to call when the cursor enters or leaves a region occupied by a word. The callback will take
      * arugments callback(item, dimension, event), where event is the original mousemove event. This only will work
      * on HTML5 canvas word clouds.
      */
    var hover: js.UndefOr[EventCallback] = js.undefined
    
    /**
      * List of words/text to paint on the canvas in a 2-d array, in the form of [word, size],
      * e.g. [['foo', 12] , ['bar', 6]].
      */
    var list: js.UndefOr[js.Array[js.Any | ListEntry]] = js.undefined
    
    /** color of the mask squares. */
    var maskColor: js.UndefOr[String] = js.undefined
    
    /** width of the gaps between mask squares. */
    var maskGapWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * If the word should rotate, the maximum rotation (in rad) the text should rotate. Set the two value equal
      * to  keep all text in one angle.
      */
    var maxRotation: js.UndefOr[Double] = js.undefined
    
    /** If the word should rotate, the minimum rotation (in rad) the text should rotate. */
    var minRotation: js.UndefOr[Double] = js.undefined
    
    /** minimum font size to draw on the canvas. */
    var minSize: js.UndefOr[Double] = js.undefined
    
    /** origin of the “cloud” in [x, y]. */
    var origin: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /** Probability for the word to rotate. Set the number to 1 to always rotate. */
    var rotateRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * The shape of the "cloud" to draw. Can be any polar equation represented as a callback function, or a
      * keyword present. Available presents are circle (default), cardioid (apple or heart shape curve, the most
      * known polar equation), diamond (alias of square), triangle-forward, triangle, (alias of triangle-upright,
      * pentagon, and star.
      */
    var shape: js.UndefOr[String | (js.Function1[/* theta */ Double, Double])] = js.undefined
    
    /** Shuffle the points to draw so the result will be different each time for the same list and settings. */
    var shuffle: js.UndefOr[Boolean] = js.undefined
    
    /** Wait for x milliseconds before start drawn the next item using setTimeout. */
    @JSName("wait")
    var wait_FOptions: js.UndefOr[Double] = js.undefined
    
    /** function to call or number to multiply for size of each word in the list. */
    var weightFactor: js.UndefOr[Double | (js.Function1[/* weight */ Double, Double])] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: js.Function): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortThreshold(value: Double): Self = StObject.set(x, "abortThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortThresholdUndefined: Self = StObject.set(x, "abortThreshold", js.undefined)
      
      @scala.inline
      def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setClasses(
        value: String | (js.Function5[
              /* word */ String, 
              /* weight */ String | Double, 
              /* fontSize */ Double, 
              /* distance */ Double, 
              /* theta */ Double, 
              String
            ])
      ): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesFunction5(
        value: (/* word */ String, /* weight */ String | Double, /* fontSize */ Double, /* distance */ Double, /* theta */ Double) => String
      ): Self = StObject.set(x, "classes", js.Any.fromFunction5(value))
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setClearCanvas(value: Boolean): Self = StObject.set(x, "clearCanvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearCanvasUndefined: Self = StObject.set(x, "clearCanvas", js.undefined)
      
      @scala.inline
      def setClick(value: (/* item */ ListEntry, /* dimension */ Dimension, /* event */ MouseEvent) => Unit): Self = StObject.set(x, "click", js.Any.fromFunction3(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setColor(
        value: String | (js.Function5[
              /* word */ String, 
              /* weight */ String | Double, 
              /* fontSize */ Double, 
              /* distance */ Double, 
              /* theta */ Double, 
              String
            ])
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorFunction5(
        value: (/* word */ String, /* weight */ String | Double, /* fontSize */ Double, /* distance */ Double, /* theta */ Double) => String
      ): Self = StObject.set(x, "color", js.Any.fromFunction5(value))
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDrawMask(value: Boolean): Self = StObject.set(x, "drawMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawMaskUndefined: Self = StObject.set(x, "drawMask", js.undefined)
      
      @scala.inline
      def setDrawOutOfBound(value: Boolean): Self = StObject.set(x, "drawOutOfBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawOutOfBoundUndefined: Self = StObject.set(x, "drawOutOfBound", js.undefined)
      
      @scala.inline
      def setEllipticity(value: Double): Self = StObject.set(x, "ellipticity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipticityUndefined: Self = StObject.set(x, "ellipticity", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
      
      @scala.inline
      def setHover(value: (/* item */ ListEntry, /* dimension */ Dimension, /* event */ MouseEvent) => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      @scala.inline
      def setList(value: js.Array[js.Any | ListEntry]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setListVarargs(value: (js.Any | ListEntry)*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setMaskColor(value: String): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
      
      @scala.inline
      def setMaskGapWidth(value: Double): Self = StObject.set(x, "maskGapWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskGapWidthUndefined: Self = StObject.set(x, "maskGapWidth", js.undefined)
      
      @scala.inline
      def setMaxRotation(value: Double): Self = StObject.set(x, "maxRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRotationUndefined: Self = StObject.set(x, "maxRotation", js.undefined)
      
      @scala.inline
      def setMinRotation(value: Double): Self = StObject.set(x, "minRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRotationUndefined: Self = StObject.set(x, "minRotation", js.undefined)
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setOrigin(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setRotateRatio(value: Double): Self = StObject.set(x, "rotateRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateRatioUndefined: Self = StObject.set(x, "rotateRatio", js.undefined)
      
      @scala.inline
      def setShape(value: String | (js.Function1[/* theta */ Double, Double])): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeFunction1(value: /* theta */ Double => Double): Self = StObject.set(x, "shape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
      
      @scala.inline
      def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
      
      @scala.inline
      def setWeightFactor(value: Double | (js.Function1[/* weight */ Double, Double])): Self = StObject.set(x, "weightFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightFactorFunction1(value: /* weight */ Double => Double): Self = StObject.set(x, "weightFactor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWeightFactorUndefined: Self = StObject.set(x, "weightFactor", js.undefined)
    }
  }
}
