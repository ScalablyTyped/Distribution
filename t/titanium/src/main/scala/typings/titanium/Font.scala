package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract datatype for specifying a text font.
  */
trait Font extends js.Object {
  /**
  	 * Specifies the font family or specific font to use.
  	 */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
  	 * Font size, in platform-dependent units.
  	 */
  var fontSize: js.UndefOr[Double | String] = js.undefined
  /**
  	 * Font style. Valid values are "italic" or "normal".
  	 */
  var fontStyle: js.UndefOr[String] = js.undefined
  /**
  	 * Font weight. Valid values are "bold", "semibold", "normal", "thin",
  	 * "light" and "ultralight".
  	 */
  var fontWeight: js.UndefOr[String] = js.undefined
  /**
  	 * The text style for the font.
  	 */
  var textStyle: js.UndefOr[String] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    fontFamily: String = null,
    fontSize: Double | String = null,
    fontStyle: String = null,
    fontWeight: String = null,
    textStyle: String = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[Font]
  }
}

