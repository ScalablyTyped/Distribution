package typings.uuid1345

import typings.uuid1345.uuid1345Strings.ascii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncoding extends js.Object {
  var encoding: ascii
  var mac: js.UndefOr[Boolean] = js.undefined
}

object AnonEncoding {
  @scala.inline
  def apply(encoding: ascii, mac: js.UndefOr[Boolean] = js.undefined): AnonEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncoding]
  }
}

