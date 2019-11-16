package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.FontFamilyProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFamilyProps extends js.Object {
  val fontFamily: js.UndefOr[ResponsiveValue[FontFamilyProperty | Double]] = js.undefined
}

object FontFamilyProps {
  @scala.inline
  def apply(fontFamily: ResponsiveValue[FontFamilyProperty | Double] = null): FontFamilyProps = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamilyProps]
  }
}

