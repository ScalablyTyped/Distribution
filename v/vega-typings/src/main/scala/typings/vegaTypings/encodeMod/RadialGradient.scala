package typings.vegaTypings.encodeMod

import typings.vegaTypings.vegaTypingsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradient
  extends BaseGradient
     with Gradient {
  /**
    * The type of gradient. Use `"radial"` for a radial gradient.
    */
  @JSName("gradient")
  var gradient_RadialGradient: radial
  var id: js.UndefOr[String] = js.undefined
  /**
    * The radius length, in normalized [0, 1] coordinates, of the inner circle for the gradient.
    *
    * __Default value:__ `0`
    */
  var r1: js.UndefOr[Double] = js.undefined
  /**
    * The radius length, in normalized [0, 1] coordinates, of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var r2: js.UndefOr[Double] = js.undefined
  /**
    * An array of gradient stops defining the gradient color sequence.
    */
  var stops: js.Array[GradientStop]
  /**
    * The x-coordinate, in normalized [0, 1] coordinates, for the center of the inner circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var x1: js.UndefOr[Double] = js.undefined
  /**
    * The x-coordinate, in normalized [0, 1] coordinates, for the center of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var x2: js.UndefOr[Double] = js.undefined
  /**
    * The y-coordinate, in normalized [0, 1] coordinates, for the center of the inner circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var y1: js.UndefOr[Double] = js.undefined
  /**
    * The y-coordinate, in normalized [0, 1] coordinates, for the center of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var y2: js.UndefOr[Double] = js.undefined
}

object RadialGradient {
  @scala.inline
  def apply(
    gradient: radial,
    stops: js.Array[GradientStop],
    id: String = null,
    r1: js.UndefOr[Double] = js.undefined,
    r2: js.UndefOr[Double] = js.undefined,
    x1: js.UndefOr[Double] = js.undefined,
    x2: js.UndefOr[Double] = js.undefined,
    y1: js.UndefOr[Double] = js.undefined,
    y2: js.UndefOr[Double] = js.undefined
  ): RadialGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(r1)) __obj.updateDynamic("r1")(r1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r2)) __obj.updateDynamic("r2")(r2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x1)) __obj.updateDynamic("x1")(x1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x2)) __obj.updateDynamic("x2")(x2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y1)) __obj.updateDynamic("y1")(y1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y2)) __obj.updateDynamic("y2")(y2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradient]
  }
}

