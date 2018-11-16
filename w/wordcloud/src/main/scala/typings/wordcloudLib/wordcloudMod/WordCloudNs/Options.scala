package typings
package wordcloudLib.wordcloudMod.WordCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** callback function to call when abort. */
  var abort: js.UndefOr[js.Function] = js.undefined
  /** If the call with in the loop takes more than x milliseconds (and blocks the browser), abort immediately. */
  var abortThreshold: js.UndefOr[scala.Double] = js.undefined
  /** color of the background. */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * for DOM clouds, allows the user to define the class of the span elements.Can be a normal class
  		 * string, applying the same class to every span or a callback(word, weight, fontSize, distance, theta)
  		 * for per-span class definition. In canvas clouds or if equals null, this option has no effect.
  		 */
  var classes: js.UndefOr[
    java.lang.String | (js.Function5[
      /* word */ java.lang.String, 
      /* weight */ java.lang.String | scala.Double, 
      /* fontSize */ scala.Double, 
      /* distance */ scala.Double, 
      /* theta */ scala.Double, 
      java.lang.String
    ])
  ] = js.undefined
  /** paint the entire canvas with background color and consider it empty before start. */
  var clearCanvas: js.UndefOr[scala.Boolean] = js.undefined
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
    java.lang.String | (js.Function5[
      /* word */ java.lang.String, 
      /* weight */ java.lang.String | scala.Double, 
      /* fontSize */ scala.Double, 
      /* distance */ scala.Double, 
      /* theta */ scala.Double, 
      java.lang.String
    ])
  ] = js.undefined
  /** visualize the grid by draw squares to mask the drawn areas. */
  var drawMask: js.UndefOr[scala.Boolean] = js.undefined
  /** set to true to allow word being draw partly outside of the canvas. Allow word bigger than the size of the canvas to be drawn. */
  var drawOutOfBound: js.UndefOr[scala.Boolean] = js.undefined
  /** degree of "flatness" of the shape wordcloud2.js should draw. */
  var ellipticity: js.UndefOr[scala.Double] = js.undefined
  /** font to use. */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** font weight to use, e.g. normal, bold or 600 */
  var fontWeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  		 * size of the grid in pixels for marking the availability of the canvas — the larger the grid size,
  		 * the  bigger the gap between words.
  		 */
  var gridSize: js.UndefOr[scala.Double] = js.undefined
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
  var list: js.UndefOr[js.Array[ListEntry] | js.Array[_]] = js.undefined
  /** color of the mask squares. */
  var maskColor: js.UndefOr[java.lang.String] = js.undefined
  /** width of the gaps between mask squares. */
  var maskGapWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * If the word should rotate, the maximum rotation (in rad) the text should rotate. Set the two value equal
  		 * to  keep all text in one angle.
  		 */
  var maxRotation: js.UndefOr[scala.Double] = js.undefined
  /** If the word should rotate, the minimum rotation (in rad) the text should rotate. */
  var minRotation: js.UndefOr[scala.Double] = js.undefined
  /** minimum font size to draw on the canvas. */
  var minSize: js.UndefOr[scala.Double] = js.undefined
  /** origin of the “cloud” in [x, y]. */
  var origin: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /** Probability for the word to rotate. Set the number to 1 to always rotate. */
  var rotateRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * The shape of the "cloud" to draw. Can be any polar equation represented as a callback function, or a
  		 * keyword present. Available presents are circle (default), cardioid (apple or heart shape curve, the most
  		 * known polar equation), diamond (alias of square), triangle-forward, triangle, (alias of triangle-upright,
  		 * pentagon, and star.
  		 */
  var shape: js.UndefOr[java.lang.String | (js.Function1[/* theta */ scala.Double, scala.Double])] = js.undefined
  /** Shuffle the points to draw so the result will be different each time for the same list and settings. */
  var shuffle: js.UndefOr[scala.Boolean] = js.undefined
  /** Wait for x milliseconds before start drawn the next item using setTimeout. */
  @JSName("wait")
  var wait_FOptions: js.UndefOr[scala.Double] = js.undefined
  /** function to call or number to multiply for size of each word in the list. */
  var weightFactor: js.UndefOr[scala.Double | (js.Function1[/* weight */ scala.Double, scala.Double])] = js.undefined
}

