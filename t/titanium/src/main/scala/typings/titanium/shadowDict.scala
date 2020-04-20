package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary describing the shadow effect for text.
  */
trait shadowDict extends js.Object {
  /**
  	 * Specifies the blur radius of the shadow.
  	 */
  var blurRadius: js.UndefOr[Double] = js.undefined
  /**
  	 * Color name or hex triplet specifying the color of the shadow.
  	 */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * <Size> with the properties `width` and `height` used as the horizontal
  	 * and vertical offset of the shadow, respectively.
  	 */
  var offset: js.UndefOr[Size] = js.undefined
}

object shadowDict {
  @scala.inline
  def apply(blurRadius: Int | Double = null, color: java.lang.String = null, offset: Size = null): shadowDict = {
    val __obj = js.Dynamic.literal()
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[shadowDict]
  }
}

