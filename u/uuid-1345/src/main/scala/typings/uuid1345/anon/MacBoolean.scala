package typings.uuid1345.anon

import typings.uuid1345.uuid1345Strings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacBoolean extends js.Object {
  var encoding: `object`
  var mac: js.UndefOr[Boolean] = js.undefined
}

object MacBoolean {
  @scala.inline
  def apply(encoding: `object`, mac: js.UndefOr[Boolean] = js.undefined): MacBoolean = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacBoolean]
  }
}

