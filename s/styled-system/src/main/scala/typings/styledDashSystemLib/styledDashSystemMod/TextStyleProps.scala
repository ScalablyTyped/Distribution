package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyleProps extends js.Object {
  var textStyle: js.UndefOr[ResponsiveValue[java.lang.String]] = js.undefined
}

object TextStyleProps {
  @scala.inline
  def apply(textStyle: ResponsiveValue[java.lang.String] = null): TextStyleProps = {
    val __obj = js.Dynamic.literal()
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleProps]
  }
}

