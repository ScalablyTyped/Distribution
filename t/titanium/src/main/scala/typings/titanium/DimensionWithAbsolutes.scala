package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An extension of <Dimension> where Android returns additional absolute X/Y values/properties for <Titanium.UI.View.rect>
  */
trait DimensionWithAbsolutes extends Dimension {
  /**
    * The x-axis coordinate of the position relative to the main window.
    */
  var absoluteX: js.UndefOr[Double] = js.undefined
  /**
    * The y-axis coordinate of the position relative to the main window.
    */
  var absoluteY: js.UndefOr[Double] = js.undefined
}

object DimensionWithAbsolutes {
  @scala.inline
  def apply(
    absoluteX: js.UndefOr[Double] = js.undefined,
    absoluteY: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): DimensionWithAbsolutes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absoluteX)) __obj.updateDynamic("absoluteX")(absoluteX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(absoluteY)) __obj.updateDynamic("absoluteY")(absoluteY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionWithAbsolutes]
  }
}

