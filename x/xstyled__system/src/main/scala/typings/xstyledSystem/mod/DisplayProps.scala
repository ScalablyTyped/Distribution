package typings.xstyledSystem.mod

import typings.csstype.mod.DisplayProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayProps extends js.Object {
  val display: js.UndefOr[ResponsiveValue[DisplayProperty]] = js.undefined
}

object DisplayProps {
  @scala.inline
  def apply(display: ResponsiveValue[DisplayProperty] = null): DisplayProps = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayProps]
  }
}

