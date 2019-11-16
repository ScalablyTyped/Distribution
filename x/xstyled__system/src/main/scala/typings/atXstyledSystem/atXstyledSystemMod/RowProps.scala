package typings.atXstyledSystem.atXstyledSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  val row: js.UndefOr[ResponsiveValue[String | Double | Boolean]] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(row: ResponsiveValue[String | Double | Boolean] = null): RowProps = {
    val __obj = js.Dynamic.literal()
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

