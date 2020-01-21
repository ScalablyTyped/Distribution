package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XGridProps
  extends ColProps
     with RowProps

object XGridProps {
  @scala.inline
  def apply(
    col: ResponsiveValue[String | Double | Boolean] = null,
    row: ResponsiveValue[String | Double | Boolean] = null
  ): XGridProps = {
    val __obj = js.Dynamic.literal()
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[XGridProps]
  }
}

