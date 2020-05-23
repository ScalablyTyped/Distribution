package typings.uifabricUtilities.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rtl extends js.Object {
  var rtl: js.UndefOr[Boolean] = js.undefined
}

object Rtl {
  @scala.inline
  def apply(rtl: js.UndefOr[Boolean] = js.undefined): Rtl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rtl]
  }
}

