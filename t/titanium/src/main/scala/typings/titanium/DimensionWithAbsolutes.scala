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
    absoluteX: Int | Double = null,
    absoluteY: Int | Double = null,
    height: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): DimensionWithAbsolutes = {
    val __obj = js.Dynamic.literal()
    if (absoluteX != null) __obj.updateDynamic("absoluteX")(absoluteX.asInstanceOf[js.Any])
    if (absoluteY != null) __obj.updateDynamic("absoluteY")(absoluteY.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionWithAbsolutes]
  }
}

