package typings.xstyledSystem.mod

import typings.csstype.mod.BorderColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderBottomColorProps extends js.Object {
  val borderBottomColor: js.UndefOr[ResponsiveValue[BorderColorProperty]] = js.undefined
}

object BorderBottomColorProps {
  @scala.inline
  def apply(borderBottomColor: ResponsiveValue[BorderColorProperty] = null): BorderBottomColorProps = {
    val __obj = js.Dynamic.literal()
    if (borderBottomColor != null) __obj.updateDynamic("borderBottomColor")(borderBottomColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomColorProps]
  }
}

