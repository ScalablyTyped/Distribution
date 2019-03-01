package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonStyleProps extends js.Object {
  var variant: js.UndefOr[ResponsiveValue[java.lang.String]] = js.undefined
}

object ButtonStyleProps {
  @scala.inline
  def apply(variant: ResponsiveValue[java.lang.String] = null): ButtonStyleProps = {
    val __obj = js.Dynamic.literal()
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonStyleProps]
  }
}

