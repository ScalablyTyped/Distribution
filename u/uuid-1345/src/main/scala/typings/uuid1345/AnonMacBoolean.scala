package typings.uuid1345

import typings.uuid1345.uuid1345Strings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMacBoolean extends js.Object {
  var encoding: `object`
  var mac: js.UndefOr[Boolean] = js.undefined
}

object AnonMacBoolean {
  @scala.inline
  def apply(encoding: `object`, mac: js.UndefOr[Boolean] = js.undefined): AnonMacBoolean = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMacBoolean]
  }
}

