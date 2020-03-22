package typings.uuid1345

import typings.uuid1345.uuid1345Strings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingMac extends js.Object {
  var encoding: binary
  var mac: js.UndefOr[Boolean] = js.undefined
}

object AnonEncodingMac {
  @scala.inline
  def apply(encoding: binary, mac: js.UndefOr[Boolean] = js.undefined): AnonEncodingMac = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingMac]
  }
}

