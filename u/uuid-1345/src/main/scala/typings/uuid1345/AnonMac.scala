package typings.uuid1345

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMac extends js.Object {
  var mac: js.UndefOr[Boolean] = js.undefined
}

object AnonMac {
  @scala.inline
  def apply(mac: js.UndefOr[Boolean] = js.undefined): AnonMac = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMac]
  }
}

