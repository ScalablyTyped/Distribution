package typings.wordcloud.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  var list: js.UndefOr[js.Array[_ | ListEntry]] = js.undefined
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
  def apply(
    abort: js.Function = null,
    abortThreshold: js.UndefOr[Double] = js.undefined,
    backgroundColor: String = null,
    classes: String | (js.Function5[
      /* word */ String, 
      /* weight */ String | Double, 
      /* fontSize */ Double, 
      /* distance */ Double, 
      /* theta */ Double, 
      String
    ]) = null,
    clearCanvas: js.UndefOr[Boolean] = js.undefined,
    click: (/* item */ ListEntry, /* dimension */ Dimension, /* event */ MouseEvent) => Unit = null,
    color: String | (js.Function5[
      /* word */ String, 
      /* weight */ String | Double, 
      /* fontSize */ Double, 
      /* distance */ Double, 
      /* theta */ Double, 
      String
    ]) = null,
    drawMask: js.UndefOr[Boolean] = js.undefined,
    drawOutOfBound: js.UndefOr[Boolean] = js.undefined,
    ellipticity: js.UndefOr[Double] = js.undefined,
    fontFamily: String = null,
    fontWeight: String | Double = null,
    gridSize: js.UndefOr[Double] = js.undefined,
    hover: (/* item */ ListEntry, /* dimension */ Dimension, /* event */ MouseEvent) => Unit = null,
    list: js.Array[_ | ListEntry] = null,
    maskColor: String = null,
    maskGapWidth: js.UndefOr[Double] = js.undefined,
    maxRotation: js.UndefOr[Double] = js.undefined,
    minRotation: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined,
    origin: js.Tuple2[Double, Double] = null,
    rotateRatio: js.UndefOr[Double] = js.undefined,
    shape: String | (js.Function1[/* theta */ Double, Double]) = null,
    shuffle: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Double] = js.undefined,
    weightFactor: Double | (js.Function1[/* weight */ Double, Double]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(abort.asInstanceOf[js.Any])
    if (!js.isUndefined(abortThreshold)) __obj.updateDynamic("abortThreshold")(abortThreshold.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(clearCanvas)) __obj.updateDynamic("clearCanvas")(clearCanvas.get.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction3(click))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(drawMask)) __obj.updateDynamic("drawMask")(drawMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawOutOfBound)) __obj.updateDynamic("drawOutOfBound")(drawOutOfBound.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipticity)) __obj.updateDynamic("ellipticity")(ellipticity.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(gridSize)) __obj.updateDynamic("gridSize")(gridSize.get.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(js.Any.fromFunction3(hover))
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (maskColor != null) __obj.updateDynamic("maskColor")(maskColor.asInstanceOf[js.Any])
    if (!js.isUndefined(maskGapWidth)) __obj.updateDynamic("maskGapWidth")(maskGapWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRotation)) __obj.updateDynamic("maxRotation")(maxRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRotation)) __obj.updateDynamic("minRotation")(minRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateRatio)) __obj.updateDynamic("rotateRatio")(rotateRatio.get.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    if (weightFactor != null) __obj.updateDynamic("weightFactor")(weightFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

