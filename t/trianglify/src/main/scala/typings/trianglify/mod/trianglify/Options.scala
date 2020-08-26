package typings.trianglify.mod.trianglify

import typings.trianglify.trianglifyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Size of the cells used to generate a randomized grid */
  var cell_size: js.UndefOr[Double] = js.native
  /** Color function f(x, y) that returns a color specification that is consumable by chroma-js */
  var color_function: js.UndefOr[(js.Function2[/* x */ Double, /* y */ Double, String]) | Null] = js.native
  /** Color space used for gradient construction & interpolation */
  var color_space: js.UndefOr[String] = js.native
  /** Height of pattern */
  var height: js.UndefOr[Double] = js.native
  /** An array of [x,y] coordinates to trianglulate. Defaults to undefined, and points are generated. */
  var points: js.UndefOr[js.Array[Double]] = js.native
  /** Seed for the RNG */
  var seed: js.UndefOr[Double | String | Null] = js.native
  /** Width of stroke. Defaults to 1.51 to fix an issue with canvas antialiasing. */
  var stroke_width: js.UndefOr[Double] = js.native
  /** how much to randomize the grid */
  var variance: js.UndefOr[Double] = js.native
  /** Width of pattern */
  var width: js.UndefOr[Double] = js.native
  /** X color stops */
  var x_colors: js.UndefOr[`false` | String | js.Array[String]] = js.native
  /** Y color stops */
  var y_colors: js.UndefOr[`false` | String | js.Array[String]] = js.native
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
    def setCell_size(value: Double): Self = this.set("cell_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell_size: Self = this.set("cell_size", js.undefined)
    @scala.inline
    def setColor_function(value: (/* x */ Double, /* y */ Double) => String): Self = this.set("color_function", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColor_function: Self = this.set("color_function", js.undefined)
    @scala.inline
    def setColor_functionNull: Self = this.set("color_function", null)
    @scala.inline
    def setColor_space(value: String): Self = this.set("color_space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor_space: Self = this.set("color_space", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPointsVarargs(value: Double*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Double]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setSeed(value: Double | String): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    @scala.inline
    def setSeedNull: Self = this.set("seed", null)
    @scala.inline
    def setStroke_width(value: Double): Self = this.set("stroke_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke_width: Self = this.set("stroke_width", js.undefined)
    @scala.inline
    def setVariance(value: Double): Self = this.set("variance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariance: Self = this.set("variance", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX_colorsVarargs(value: String*): Self = this.set("x_colors", js.Array(value :_*))
    @scala.inline
    def setX_colors(value: `false` | String | js.Array[String]): Self = this.set("x_colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX_colors: Self = this.set("x_colors", js.undefined)
    @scala.inline
    def setY_colorsVarargs(value: String*): Self = this.set("y_colors", js.Array(value :_*))
    @scala.inline
    def setY_colors(value: `false` | String | js.Array[String]): Self = this.set("y_colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY_colors: Self = this.set("y_colors", js.undefined)
  }
  
}

