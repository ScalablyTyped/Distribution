package typings.stripeV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var cssSrc: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[String] = js.undefined
  var family: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var unicodeRange: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[String] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    cssSrc: String = null,
    display: String = null,
    family: String = null,
    src: String = null,
    style: String = null,
    unicodeRange: String = null,
    weight: String = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (cssSrc != null) __obj.updateDynamic("cssSrc")(cssSrc.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

