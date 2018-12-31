package typings
package titaniumLib

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
  var backfillEnd: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set to `true` to continue filling with the starting color beyond the `startPoint`.
  	 */
  var backfillStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * An array of colors, as a color name or hex triplet.
  	 */
  var colors: js.UndefOr[js.Array[java.lang.String] | js.Array[GradientColorRef]] = js.undefined
  /**
  	 * End point for the gradient.
  	 */
  var endPoint: js.UndefOr[Point] = js.undefined
  /**
  	 * For a radial gradient, the radius at the `endPoint`.
  	 */
  var endRadius: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Start point for the gradient.
  	 */
  var startPoint: js.UndefOr[Point] = js.undefined
  /**
  	 * For a radial gradient, the radius at the `startPoint`.
  	 */
  var startRadius: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Type of gradient, either 'linear' or 'radial'.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

