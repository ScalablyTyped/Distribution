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
  var color: js.UndefOr[String] = js.undefined
  /**
  	 * Dictionary with the properties `width` and `height` used as the horizontal
  	 * and vertical offset of the shadow, respectively.
  	 */
  var offset: js.UndefOr[js.Any] = js.undefined
}

object shadowDict {
  @scala.inline
  def apply(blurRadius: Int | Double = null, color: String = null, offset: js.Any = null): shadowDict = {
    val __obj = js.Dynamic.literal()
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[shadowDict]
  }
}

