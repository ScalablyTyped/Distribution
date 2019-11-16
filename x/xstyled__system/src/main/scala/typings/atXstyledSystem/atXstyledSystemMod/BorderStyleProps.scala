package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.BorderStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderStyleProps extends js.Object {
  val borderStyle: js.UndefOr[ResponsiveValue[BorderStyleProperty | Double]] = js.undefined
}

object BorderStyleProps {
  @scala.inline
  def apply(borderStyle: ResponsiveValue[BorderStyleProperty | Double] = null): BorderStyleProps = {
    val __obj = js.Dynamic.literal()
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderStyleProps]
  }
}

