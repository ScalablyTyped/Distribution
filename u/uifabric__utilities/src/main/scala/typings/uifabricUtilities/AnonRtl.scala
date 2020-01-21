package typings.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRtl extends js.Object {
  var rtl: js.UndefOr[Boolean] = js.undefined
}

object AnonRtl {
  @scala.inline
  def apply(rtl: js.UndefOr[Boolean] = js.undefined): AnonRtl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRtl]
  }
}

