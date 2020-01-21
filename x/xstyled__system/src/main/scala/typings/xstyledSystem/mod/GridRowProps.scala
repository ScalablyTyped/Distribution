package typings.xstyledSystem.mod

import typings.csstype.mod.GridRowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridRowProps extends js.Object {
  val gridRow: js.UndefOr[ResponsiveValue[GridRowProperty]] = js.undefined
}

object GridRowProps {
  @scala.inline
  def apply(gridRow: ResponsiveValue[GridRowProperty] = null): GridRowProps = {
    val __obj = js.Dynamic.literal()
    if (gridRow != null) __obj.updateDynamic("gridRow")(gridRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRowProps]
  }
}

