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
  def apply(height: Int | Double = null, width: Int | Double = null): Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

