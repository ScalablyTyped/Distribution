package typings.xstyledSystem.mod

import typings.csstype.mod.BorderColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderColorProps extends js.Object {
  val borderColor: js.UndefOr[ResponsiveValue[BorderColorProperty]] = js.undefined
}

object BorderColorProps {
  @scala.inline
  def apply(borderColor: ResponsiveValue[BorderColorProperty] = null): BorderColorProps = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorProps]
  }
}

