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
  def apply(scale: js.UndefOr[Double] = js.undefined): Matrix3DCreationDict = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix3DCreationDict]
  }
}

