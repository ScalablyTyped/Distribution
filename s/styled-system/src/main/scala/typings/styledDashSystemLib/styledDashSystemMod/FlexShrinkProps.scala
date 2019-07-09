package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexShrinkProps extends js.Object {
  var flexShrink: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.GlobalsNumber]] = js.undefined
}

object FlexShrinkProps {
  @scala.inline
  def apply(flexShrink: ResponsiveValue[csstypeLib.csstypeMod.GlobalsNumber] = null): FlexShrinkProps = {
    val __obj = js.Dynamic.literal()
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexShrinkProps]
  }
}

