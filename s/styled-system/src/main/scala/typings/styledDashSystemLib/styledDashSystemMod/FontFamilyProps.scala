package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFamilyProps extends js.Object {
  var fontFamily: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.FontFamilyProperty]] = js.undefined
}

object FontFamilyProps {
  @scala.inline
  def apply(fontFamily: ResponsiveValue[csstypeLib.csstypeMod.FontFamilyProperty] = null): FontFamilyProps = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamilyProps]
  }
}

