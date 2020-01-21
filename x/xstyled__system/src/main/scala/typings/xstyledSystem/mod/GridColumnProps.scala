package typings.xstyledSystem.mod

import typings.csstype.mod.GridColumnProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnProps extends js.Object {
  val gridColumn: js.UndefOr[ResponsiveValue[GridColumnProperty]] = js.undefined
}

object GridColumnProps {
  @scala.inline
  def apply(gridColumn: ResponsiveValue[GridColumnProperty] = null): GridColumnProps = {
    val __obj = js.Dynamic.literal()
    if (gridColumn != null) __obj.updateDynamic("gridColumn")(gridColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnProps]
  }
}

