package typings.xstyledSystem.mod

import typings.csstype.mod.BorderColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderTopColorProps extends js.Object {
  val borderTopColor: js.UndefOr[ResponsiveValue[BorderColorProperty]] = js.undefined
}

object BorderTopColorProps {
  @scala.inline
  def apply(borderTopColor: ResponsiveValue[BorderColorProperty] = null): BorderTopColorProps = {
    val __obj = js.Dynamic.literal()
    if (borderTopColor != null) __obj.updateDynamic("borderTopColor")(borderTopColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopColorProps]
  }
}

