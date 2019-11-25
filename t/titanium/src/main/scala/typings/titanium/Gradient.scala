package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object defining a color gradient.
  */
trait Gradient extends js.Object {
  /**
  	 * Set to `true` to continue filling with the final color beyond the `endPoint`.
  	 */
  var backfillEnd: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set to `true` to continue filling with the starting color beyond the `startPoint`.
  	 */
  var backfillStart: js.UndefOr[Boolean] = js.undefined
  /**
  	 * An array of colors, as a color name or hex triplet.
  	 */
  var colors: js.UndefOr[js.Array[GradientColorRef | String]] = js.undefined
  /**
  	 * End point for the gradient.
  	 */
  var endPoint: js.UndefOr[Point] = js.undefined
  /**
  	 * For a radial gradient, the radius at the `endPoint`.
  	 */
  var endRadius: js.UndefOr[Double] = js.undefined
  /**
  	 * Start point for the gradient.
  	 */
  var startPoint: js.UndefOr[Point] = js.undefined
  /**
  	 * For a radial gradient, the radius at the `startPoint`.
  	 */
  var startRadius: js.UndefOr[Double] = js.undefined
  /**
  	 * Type of gradient, either 'linear' or 'radial'.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}

object Gradient {
  @scala.inline
  def apply(
    backfillEnd: js.UndefOr[Boolean] = js.undefined,
    backfillStart: js.UndefOr[Boolean] = js.undefined,
    colors: js.Array[GradientColorRef | String] = null,
    endPoint: Point = null,
    endRadius: Int | Double = null,
    startPoint: Point = null,
    startRadius: Int | Double = null,
    `type`: String = null
  ): Gradient = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backfillEnd)) __obj.updateDynamic("backfillEnd")(backfillEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(backfillStart)) __obj.updateDynamic("backfillStart")(backfillStart.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (endPoint != null) __obj.updateDynamic("endPoint")(endPoint.asInstanceOf[js.Any])
    if (endRadius != null) __obj.updateDynamic("endRadius")(endRadius.asInstanceOf[js.Any])
    if (startPoint != null) __obj.updateDynamic("startPoint")(startPoint.asInstanceOf[js.Any])
    if (startRadius != null) __obj.updateDynamic("startRadius")(startRadius.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
}

