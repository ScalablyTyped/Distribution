package typings.uuid1345.anon

import typings.uuid1345.uuid1345Strings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingMac extends js.Object {
  var encoding: binary
  var mac: js.UndefOr[Boolean] = js.undefined
}

object EncodingMac {
  @scala.inline
  def apply(encoding: binary, mac: js.UndefOr[Boolean] = js.undefined): EncodingMac = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingMac]
  }
}

