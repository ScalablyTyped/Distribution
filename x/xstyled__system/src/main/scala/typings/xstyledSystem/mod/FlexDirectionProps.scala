package typings.xstyledSystem.mod

import typings.csstype.mod.FlexDirectionProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexDirectionProps extends js.Object {
  val flexDirection: js.UndefOr[ResponsiveValue[FlexDirectionProperty]] = js.undefined
}

object FlexDirectionProps {
  @scala.inline
  def apply(flexDirection: ResponsiveValue[FlexDirectionProperty] = null): FlexDirectionProps = {
    val __obj = js.Dynamic.literal()
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionProps]
  }
}

