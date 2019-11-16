package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderProps extends js.Object {
  val order: js.UndefOr[ResponsiveValue[GlobalsNumber]] = js.undefined
}

object OrderProps {
  @scala.inline
  def apply(order: ResponsiveValue[GlobalsNumber] = null): OrderProps = {
    val __obj = js.Dynamic.literal()
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderProps]
  }
}

