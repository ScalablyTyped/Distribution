package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to <Titanium.UI.createMatrix2D> to initialize a matrix.
  */
trait Matrix2DCreationDict extends js.Object {
  /**
  	 * Point to rotate around, specified as a dictionary object with `x` and `y`
  	 * properties, where { x: 0.5, y: 0.5 } represents the center of whatever is being
  	 * rotated.
  	 */
  var anchorPoint: js.UndefOr[Point] = js.undefined
  /**
  	 * Rotation angle, in degrees. See the [rotate](Titanium.UI.Matrix2D.rotate) method
  	 * for a discussion of rotation.
  	 */
  var rotate: js.UndefOr[Double] = js.undefined
  /**
  	 * Scale the matrix by the specified scaling factor. The same scaling factor is used
  	 * for both horizontal and vertical scaling.
  	 */
  var scale: js.UndefOr[Double] = js.undefined
}

object Matrix2DCreationDict {
  @scala.inline
  def apply(anchorPoint: Point = null, rotate: Int | Double = null, scale: Int | Double = null): Matrix2DCreationDict = {
    val __obj = js.Dynamic.literal()
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix2DCreationDict]
  }
}

