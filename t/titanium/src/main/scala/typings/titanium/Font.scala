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
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Font size, in platform-dependent units.
  	 */
  var fontSize: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
  	 * Font style. Valid values are "italic" or "normal".
  	 */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Font weight. Valid values are "bold", "semibold", "normal", "thin",
  	 * "light" and "ultralight".
  	 */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The text style for the font.
  	 */
  var textStyle: js.UndefOr[java.lang.String] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontSize: Double | java.lang.String = null,
    fontStyle: java.lang.String = null,
    fontWeight: java.lang.String = null,
    textStyle: java.lang.String = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

