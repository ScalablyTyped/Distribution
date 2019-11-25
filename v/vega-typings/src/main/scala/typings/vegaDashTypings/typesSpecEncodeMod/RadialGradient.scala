package typings.vegaDashTypings.typesSpecEncodeMod

import typings.vegaDashTypings.vegaDashTypingsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradient extends BaseGradient {
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
    r1: Int | Double = null,
    r2: Int | Double = null,
    x1: Int | Double = null,
    x2: Int | Double = null,
    y1: Int | Double = null,
    y2: Int | Double = null
  ): RadialGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (r1 != null) __obj.updateDynamic("r1")(r1.asInstanceOf[js.Any])
    if (r2 != null) __obj.updateDynamic("r2")(r2.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradient]
  }
}

