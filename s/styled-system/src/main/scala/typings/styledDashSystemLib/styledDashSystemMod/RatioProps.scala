package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatioProps extends js.Object {
  /**
    * The ration is height: 0 & paddingBottom
    */
  var ratio: js.UndefOr[ResponsiveValue[scala.Double]] = js.undefined
}

object RatioProps {
  @scala.inline
  def apply(ratio: ResponsiveValue[scala.Double] = null): RatioProps = {
    val __obj = js.Dynamic.literal()
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatioProps]
  }
}

