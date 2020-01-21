package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColProps extends js.Object {
  val col: js.UndefOr[ResponsiveValue[String | Double | Boolean]] = js.undefined
}

object ColProps {
  @scala.inline
  def apply(col: ResponsiveValue[String | Double | Boolean] = null): ColProps = {
    val __obj = js.Dynamic.literal()
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColProps]
  }
}

