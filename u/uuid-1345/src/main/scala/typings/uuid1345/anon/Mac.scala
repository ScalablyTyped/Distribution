package typings.uuid1345.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mac extends js.Object {
  var mac: js.UndefOr[Boolean] = js.undefined
}

object Mac {
  @scala.inline
  def apply(mac: js.UndefOr[Boolean] = js.undefined): Mac = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mac]
  }
}

