package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to <Titanium.UI.createMatrix3D> to initialize a matrix.
  */
trait Matrix3DCreationDict extends js.Object {
  /**
  	 * Scale the matrix by the specified scaling factor.
  	 */
  var scale: js.UndefOr[Double] = js.undefined
}

object Matrix3DCreationDict {
  @scala.inline
  def apply(scale: Int | Double = null): Matrix3DCreationDict = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix3DCreationDict]
  }
}

