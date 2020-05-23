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
  def apply(
    anchorPoint: Point = null,
    rotate: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): Matrix2DCreationDict = {
    val __obj = js.Dynamic.literal()
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix2DCreationDict]
  }
}

