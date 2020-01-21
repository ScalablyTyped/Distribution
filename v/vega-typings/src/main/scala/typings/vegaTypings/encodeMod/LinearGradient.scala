package typings.vegaTypings.encodeMod

import typings.vegaTypings.vegaTypingsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradient extends BaseGradient {
  /**
    * The type of gradient. Use `"linear"` for a linear gradient.
    */
  @JSName("gradient")
  var gradient_LinearGradient: linear
  var id: js.UndefOr[String] = js.undefined
  /**
    * An array of gradient stops defining the gradient color sequence.
    */
  var stops: js.Array[GradientStop]
  /**
    * The starting x-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `0`
    */
  var x1: js.UndefOr[Double] = js.undefined
  /**
    * The ending x-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `1`
    */
  var x2: js.UndefOr[Double] = js.undefined
  /**
    * The starting y-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `0`
    */
  var y1: js.UndefOr[Double] = js.undefined
  /**
    * The ending y-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `0`
    */
  var y2: js.UndefOr[Double] = js.undefined
}

object LinearGradient {
  @scala.inline
  def apply(
    gradient: linear,
    stops: js.Array[GradientStop],
    id: String = null,
    x1: Int | Double = null,
    x2: Int | Double = null,
    y1: Int | Double = null,
    y2: Int | Double = null
  ): LinearGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradient]
  }
}

