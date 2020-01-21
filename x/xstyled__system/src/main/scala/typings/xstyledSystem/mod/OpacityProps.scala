package typings.xstyledSystem.mod

import typings.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacityProps extends js.Object {
  val opacity: js.UndefOr[ResponsiveValue[GlobalsNumber]] = js.undefined
}

object OpacityProps {
  @scala.inline
  def apply(opacity: ResponsiveValue[GlobalsNumber] = null): OpacityProps = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityProps]
  }
}

