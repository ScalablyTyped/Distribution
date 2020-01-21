package typings.xstyledSystem.mod

import typings.csstype.mod.BorderColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderRightColorProps extends js.Object {
  val borderRightColor: js.UndefOr[ResponsiveValue[BorderColorProperty]] = js.undefined
}

object BorderRightColorProps {
  @scala.inline
  def apply(borderRightColor: ResponsiveValue[BorderColorProperty] = null): BorderRightColorProps = {
    val __obj = js.Dynamic.literal()
    if (borderRightColor != null) __obj.updateDynamic("borderRightColor")(borderRightColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRightColorProps]
  }
}

