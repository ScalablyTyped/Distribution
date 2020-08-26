package typings.wordcloud.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** callback function to call when abort. */
  var abort: js.UndefOr[js.Function] = js.native
  /** If the call with in the loop takes more than x milliseconds (and blocks the browser), abort immediately. */
  var abortThreshold: js.UndefOr[Double] = js.native
  /** color of the background. */
  var backgroundColor: js.UndefOr[String] = js.native
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
  ] = js.native
  /** paint the entire canvas with background color and consider it empty before start. */
  var clearCanvas: js.UndefOr[Boolean] = js.native
  /**
    * callback to call when the user clicks on a word. The callback will take arugments
    * callback(item, dimension,  event), where event is the original click event. This only will work on HTML5
    * canvas word clouds.
    */
  var click: js.UndefOr[EventCallback] = js.native
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
  ] = js.native
  /** visualize the grid by draw squares to mask the drawn areas. */
  var drawMask: js.UndefOr[Boolean] = js.native
  /** set to true to allow word being draw partly outside of the canvas. Allow word bigger than the size of the canvas to be drawn. */
  var drawOutOfBound: js.UndefOr[Boolean] = js.native
  /** degree of "flatness" of the shape wordcloud2.js should draw. */
  var ellipticity: js.UndefOr[Double] = js.native
  /** font to use. */
  var fontFamily: js.UndefOr[String] = js.native
  /** font weight to use, e.g. normal, bold or 600 */
  var fontWeight: js.UndefOr[String | Double] = js.native
  /**
    * size of the grid in pixels for marking the availability of the canvas — the larger the grid size,
    * the  bigger the gap between words.
    */
  var gridSize: js.UndefOr[Double] = js.native
  /**
    * callback to call when the cursor enters or leaves a region occupied by a word. The callback will take
    * arugments callback(item, dimension, event), where event is the original mousemove event. This only will work
    * on HTML5 canvas word clouds.
    */
  var hover: js.UndefOr[EventCallback] = js.native
  /**
    * List of words/text to paint on the canvas in a 2-d array, in the form of [word, size],
    * e.g. [['foo', 12] , ['bar', 6]].
    */
  var list: js.UndefOr[js.Array[_ | ListEntry]] = js.native
  /** color of the mask squares. */
  var maskColor: js.UndefOr[String] = js.native
  /** width of the gaps between mask squares. */
  var maskGapWidth: js.UndefOr[Double] = js.native
  /**
    * If the word should rotate, the maximum rotation (in rad) the text should rotate. Set the two value equal
    * to  keep all text in one angle.
    */
  var maxRotation: js.UndefOr[Double] = js.native
  /** If the word should rotate, the minimum rotation (in rad) the text should rotate. */
  var minRotation: js.UndefOr[Double] = js.native
  /** minimum font size to draw on the canvas. */
  var minSize: js.UndefOr[Double] = js.native
  /** origin of the “cloud” in [x, y]. */
  var origin: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Probability for the word to rotate. Set the number to 1 to always rotate. */
  var rotateRatio: js.UndefOr[Double] = js.native
  /**
    * The shape of the "cloud" to draw. Can be any polar equation represented as a callback function, or a
    * keyword present. Available presents are circle (default), cardioid (apple or heart shape curve, the most
    * known polar equation), diamond (alias of square), triangle-forward, triangle, (alias of triangle-upright,
    * pentagon, and star.
    */
  var shape: js.UndefOr[String | (js.Function1[/* theta */ Double, Double])] = js.native
  /** Shuffle the points to draw so the result will be different each time for the same list and settings. */
  var shuffle: js.UndefOr[Boolean] = js.native
  /** Wait for x milliseconds before start drawn the next item using setTimeout. */
  @JSName("wait")
  var wait_FOptions: js.UndefOr[Double] = js.native
  /** function to call or number to multiply for size of each word in the list. */
  var weightFactor: js.UndefOr[Double | (js.Function1[/* weight */ Double, Double])] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: js.Function): Self = this.set("abort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    @scala.inline
    def setAbortThreshold(value: Double): Self = this.set("abortThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortThreshold: Self = this.set("abortThreshold", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setClassesFunction5(
      value: (/* word */ String, /* weight */ String | Double, /* fontSize */ Double, /* distance */ Double, /* theta */ Double) => String
    ): Self = this.set("classes", js.Any.fromFunction5(value))
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
    ): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setClearCanvas(value: Boolean): Self = this.set("clearCanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearCanvas: Self = this.set("clearCanvas", js.undefined)
    @scala.inline
    def setClick(value: (/* item */ ListEntry, /* dimension */ Dimension, /* event */ MouseEvent) => Unit): Self = this.set("click", js.Any.fromFunction3(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setColorFunction5(
      value: (/* word */ String, /* weight */ String | Double, /* fontSize */ Double, /* distance */ Double, /* theta */ Double) => String
    ): Self = this.set("color", js.Any.fromFunction5(value))
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
    ): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDrawMask(value: Boolean): Self = this.set("drawMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawMask: Self = this.set("drawMask", js.undefined)
    @scala.inline
    def setDrawOutOfBound(value: Boolean): Self = this.set("drawOutOfBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawOutOfBound: Self = this.set("drawOutOfBound", js.undefined)
    @scala.inline
    def setEllipticity(value: Double): Self = this.set("ellipticity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipticity: Self = this.set("ellipticity", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontWeight(value: String | Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setGridSize(value: Double): Self = this.set("gridSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridSize: Self = this.set("gridSize", js.undefined)
    @scala.inline
    def setHover(value: (/* item */ ListEntry, /* dimension */ Dimension, /* event */ MouseEvent) => Unit): Self = this.set("hover", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setListVarargs(value: (js.Any | ListEntry)*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: js.Array[_ | ListEntry]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setMaskColor(value: String): Self = this.set("maskColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskColor: Self = this.set("maskColor", js.undefined)
    @scala.inline
    def setMaskGapWidth(value: Double): Self = this.set("maskGapWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskGapWidth: Self = this.set("maskGapWidth", js.undefined)
    @scala.inline
    def setMaxRotation(value: Double): Self = this.set("maxRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRotation: Self = this.set("maxRotation", js.undefined)
    @scala.inline
    def setMinRotation(value: Double): Self = this.set("minRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRotation: Self = this.set("minRotation", js.undefined)
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setOrigin(value: js.Tuple2[Double, Double]): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setRotateRatio(value: Double): Self = this.set("rotateRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateRatio: Self = this.set("rotateRatio", js.undefined)
    @scala.inline
    def setShapeFunction1(value: /* theta */ Double => Double): Self = this.set("shape", js.Any.fromFunction1(value))
    @scala.inline
    def setShape(value: String | (js.Function1[/* theta */ Double, Double])): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setShuffle(value: Boolean): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShuffle: Self = this.set("shuffle", js.undefined)
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
    @scala.inline
    def setWeightFactorFunction1(value: /* weight */ Double => Double): Self = this.set("weightFactor", js.Any.fromFunction1(value))
    @scala.inline
    def setWeightFactor(value: Double | (js.Function1[/* weight */ Double, Double])): Self = this.set("weightFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightFactor: Self = this.set("weightFactor", js.undefined)
  }
  
}

