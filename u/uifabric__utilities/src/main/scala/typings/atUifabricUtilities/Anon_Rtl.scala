package typings.atUifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rtl extends js.Object {
  var rtl: js.UndefOr[Boolean] = js.undefined
}

object Anon_Rtl {
  @scala.inline
  def apply(rtl: js.UndefOr[Boolean] = js.undefined): Anon_Rtl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Rtl]
  }
}

