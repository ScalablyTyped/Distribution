package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonStyleProps extends js.Object {
  var variant: js.UndefOr[ResponsiveValue[String]] = js.undefined
}

object ButtonStyleProps {
  @scala.inline
  def apply(variant: ResponsiveValue[String] = null): ButtonStyleProps = {
    val __obj = js.Dynamic.literal()
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonStyleProps]
  }
}

