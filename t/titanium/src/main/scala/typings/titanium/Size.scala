package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object consisting of size measurements.
  */
trait Size extends js.Object {
  /**
    * The height measurement.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The width measurement.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Size {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): Size = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

