package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object consisting of the position and size measurements. Effectively combines <Size> and <Point> but ensures numeric x/y values.
  */
trait Dimension extends Size {
  /**
    * The x-axis coordinate of the position. When returned by <Titanium.UI.View.rect> the position is relative to it's parent.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y-axis coordinate of the position. When returned by <Titanium.UI.View.rect> the position is relative to it's parent.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Dimension {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): Dimension = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
}

