package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatioPaddingProps[TLength] extends js.Object {
  var ratio: js.UndefOr[ResponsiveValue[scala.Double]] = js.undefined
}

object RatioPaddingProps {
  @scala.inline
  def apply[TLength](ratio: ResponsiveValue[scala.Double] = null): RatioPaddingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatioPaddingProps[TLength]]
  }
}

