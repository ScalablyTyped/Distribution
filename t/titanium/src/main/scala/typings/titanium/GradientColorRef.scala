package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object consisting of a color and an offset.
  */
trait GradientColorRef extends js.Object {
  /**
    * Color value at this point in the gradient, as a color name or hex triplet.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color's normalized position within the gradient, ranging from 0 (start) to 1 (end).
    */
  var offset: js.UndefOr[Double] = js.undefined
}

object GradientColorRef {
  @scala.inline
  def apply(color: java.lang.String = null, offset: js.UndefOr[Double] = js.undefined): GradientColorRef = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientColorRef]
  }
}

