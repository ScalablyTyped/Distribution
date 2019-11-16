package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.PositionProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionProps extends js.Object {
  val position: js.UndefOr[ResponsiveValue[PositionProperty]] = js.undefined
}

object PositionProps {
  @scala.inline
  def apply(position: ResponsiveValue[PositionProperty] = null): PositionProps = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionProps]
  }
}

