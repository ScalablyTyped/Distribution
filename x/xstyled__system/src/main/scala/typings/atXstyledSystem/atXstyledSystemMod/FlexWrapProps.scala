package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.FlexWrapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexWrapProps extends js.Object {
  val flexWrap: js.UndefOr[ResponsiveValue[FlexWrapProperty]] = js.undefined
}

object FlexWrapProps {
  @scala.inline
  def apply(flexWrap: ResponsiveValue[FlexWrapProperty] = null): FlexWrapProps = {
    val __obj = js.Dynamic.literal()
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexWrapProps]
  }
}

