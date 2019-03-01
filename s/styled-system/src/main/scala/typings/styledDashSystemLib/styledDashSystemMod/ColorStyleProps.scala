package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStyleProps extends js.Object {
  var colors: js.UndefOr[ResponsiveValue[java.lang.String]] = js.undefined
}

object ColorStyleProps {
  @scala.inline
  def apply(colors: ResponsiveValue[java.lang.String] = null): ColorStyleProps = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStyleProps]
  }
}

