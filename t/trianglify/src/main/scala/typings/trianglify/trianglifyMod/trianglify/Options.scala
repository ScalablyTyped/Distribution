package typings.trianglify.trianglifyMod.trianglify

import typings.trianglify.trianglifyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Size of the cells used to generate a randomized grid */
  var cell_size: js.UndefOr[Double] = js.undefined
  /** Color function f(x, y) that returns a color specification that is consumable by chroma-js */
  var color_function: js.UndefOr[(js.Function2[/* x */ Double, /* y */ Double, String]) | Null] = js.undefined
  /** Color space used for gradient construction & interpolation */
  var color_space: js.UndefOr[String] = js.undefined
  /** Height of pattern */
  var height: js.UndefOr[Double] = js.undefined
  /** An array of [x,y] coordinates to trianglulate. Defaults to undefined, and points are generated. */
  var points: js.UndefOr[js.Array[Double]] = js.undefined
  /** Seed for the RNG */
  var seed: js.UndefOr[Double | String | Null] = js.undefined
  /** Width of stroke. Defaults to 1.51 to fix an issue with canvas antialiasing. */
  var stroke_width: js.UndefOr[Double] = js.undefined
  /** how much to randomize the grid */
  var variance: js.UndefOr[Double] = js.undefined
  /** Width of pattern */
  var width: js.UndefOr[Double] = js.undefined
  /** X color stops */
  var x_colors: js.UndefOr[`false` | String | js.Array[String]] = js.undefined
  /** Y color stops */
  var y_colors: js.UndefOr[`false` | String | js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cell_size: Int | Double = null,
    color_function: (/* x */ Double, /* y */ Double) => String = null,
    color_space: String = null,
    height: Int | Double = null,
    points: js.Array[Double] = null,
    seed: Double | String = null,
    stroke_width: Int | Double = null,
    variance: Int | Double = null,
    width: Int | Double = null,
    x_colors: `false` | String | js.Array[String] = null,
    y_colors: `false` | String | js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cell_size != null) __obj.updateDynamic("cell_size")(cell_size.asInstanceOf[js.Any])
    if (color_function != null) __obj.updateDynamic("color_function")(js.Any.fromFunction2(color_function))
    if (color_space != null) __obj.updateDynamic("color_space")(color_space.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (stroke_width != null) __obj.updateDynamic("stroke_width")(stroke_width.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x_colors != null) __obj.updateDynamic("x_colors")(x_colors.asInstanceOf[js.Any])
    if (y_colors != null) __obj.updateDynamic("y_colors")(y_colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

