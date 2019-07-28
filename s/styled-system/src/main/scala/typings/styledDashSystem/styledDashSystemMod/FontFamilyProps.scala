package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.FontFamilyProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFamilyProps extends js.Object {
  var fontFamily: js.UndefOr[ResponsiveValue[FontFamilyProperty]] = js.undefined
}

object FontFamilyProps {
  @scala.inline
  def apply(fontFamily: ResponsiveValue[FontFamilyProperty] = null): FontFamilyProps = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamilyProps]
  }
}

