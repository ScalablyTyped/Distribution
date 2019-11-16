package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.BorderColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderLeftColorProps extends js.Object {
  val borderLeftColor: js.UndefOr[ResponsiveValue[BorderColorProperty]] = js.undefined
}

object BorderLeftColorProps {
  @scala.inline
  def apply(borderLeftColor: ResponsiveValue[BorderColorProperty] = null): BorderLeftColorProps = {
    val __obj = js.Dynamic.literal()
    if (borderLeftColor != null) __obj.updateDynamic("borderLeftColor")(borderLeftColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLeftColorProps]
  }
}

