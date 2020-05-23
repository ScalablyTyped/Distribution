package typings.uuid1345.anon

import typings.uuid1345.uuid1345Strings.ascii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var encoding: ascii
  var mac: js.UndefOr[Boolean] = js.undefined
}

object Encoding {
  @scala.inline
  def apply(encoding: ascii, mac: js.UndefOr[Boolean] = js.undefined): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}

