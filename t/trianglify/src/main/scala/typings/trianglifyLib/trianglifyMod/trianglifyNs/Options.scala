package typings
package trianglifyLib.trianglifyMod.trianglifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Size of the cells used to generate a randomized grid */
  var cell_size: js.UndefOr[scala.Double] = js.undefined
  /** Color function f(x, y) that returns a color specification that is consumable by chroma-js */
  var color_function: js.UndefOr[
    (js.Function2[/* x */ scala.Double, /* y */ scala.Double, java.lang.String]) | scala.Null
  ] = js.undefined
  /** Color space used for gradient construction & interpolation */
  var color_space: js.UndefOr[java.lang.String] = js.undefined
  /** Height of pattern */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** An array of [x,y] coordinates to trianglulate. Defaults to undefined, and points are generated. */
  var points: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Seed for the RNG */
  var seed: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
  /** Width of stroke. Defaults to 1.51 to fix an issue with canvas antialiasing. */
  var stroke_width: js.UndefOr[scala.Double] = js.undefined
  /** how much to randomize the grid */
  var variance: js.UndefOr[scala.Double] = js.undefined
  /** Width of pattern */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** X color stops */
  var x_colors: js.UndefOr[
    trianglifyLib.trianglifyLibNumbers.`false` | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
  /** Y color stops */
  var y_colors: js.UndefOr[
    trianglifyLib.trianglifyLibNumbers.`false` | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cell_size: scala.Int | scala.Double = null,
    color_function: (/* x */ scala.Double, /* y */ scala.Double) => java.lang.String = null,
    color_space: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    points: js.Array[scala.Double] = null,
    seed: scala.Double | java.lang.String = null,
    stroke_width: scala.Int | scala.Double = null,
    variance: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    x_colors: trianglifyLib.trianglifyLibNumbers.`false` | java.lang.String | js.Array[java.lang.String] = null,
    y_colors: trianglifyLib.trianglifyLibNumbers.`false` | java.lang.String | js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cell_size != null) __obj.updateDynamic("cell_size")(cell_size.asInstanceOf[js.Any])
    if (color_function != null) __obj.updateDynamic("color_function")(js.Any.fromFunction2(color_function))
    if (color_space != null) __obj.updateDynamic("color_space")(color_space)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points)
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (stroke_width != null) __obj.updateDynamic("stroke_width")(stroke_width.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x_colors != null) __obj.updateDynamic("x_colors")(x_colors.asInstanceOf[js.Any])
    if (y_colors != null) __obj.updateDynamic("y_colors")(y_colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

