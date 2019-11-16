package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.OverflowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowProps extends js.Object {
  val overflow: js.UndefOr[ResponsiveValue[OverflowProperty]] = js.undefined
}

object OverflowProps {
  @scala.inline
  def apply(overflow: ResponsiveValue[OverflowProperty] = null): OverflowProps = {
    val __obj = js.Dynamic.literal()
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowProps]
  }
}

