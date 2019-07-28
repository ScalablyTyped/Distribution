package typings.styledDashSystem.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStyleProps extends js.Object {
  var colors: js.UndefOr[ResponsiveValue[String]] = js.undefined
}

object ColorStyleProps {
  @scala.inline
  def apply(colors: ResponsiveValue[String] = null): ColorStyleProps = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStyleProps]
  }
}

