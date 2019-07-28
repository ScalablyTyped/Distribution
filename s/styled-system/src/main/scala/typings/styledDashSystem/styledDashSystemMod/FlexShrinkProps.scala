package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexShrinkProps extends js.Object {
  var flexShrink: js.UndefOr[ResponsiveValue[GlobalsNumber]] = js.undefined
}

object FlexShrinkProps {
  @scala.inline
  def apply(flexShrink: ResponsiveValue[GlobalsNumber] = null): FlexShrinkProps = {
    val __obj = js.Dynamic.literal()
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexShrinkProps]
  }
}

