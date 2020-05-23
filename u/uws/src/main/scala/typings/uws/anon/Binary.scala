package typings.uws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binary extends js.Object {
  var binary: js.UndefOr[Boolean] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
}

object Binary {
  @scala.inline
  def apply(binary: js.UndefOr[Boolean] = js.undefined, mask: js.UndefOr[Boolean] = js.undefined): Binary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
}

