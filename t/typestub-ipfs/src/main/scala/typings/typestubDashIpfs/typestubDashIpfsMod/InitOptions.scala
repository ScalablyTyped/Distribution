package typings.typestubDashIpfs.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var bits: js.UndefOr[Double] = js.undefined
  var emptyRepo: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[js.Function] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(bits: Int | Double = null, emptyRepo: js.UndefOr[Boolean] = js.undefined, log: js.Function = null): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (bits != null) __obj.updateDynamic("bits")(bits.asInstanceOf[js.Any])
    if (!js.isUndefined(emptyRepo)) __obj.updateDynamic("emptyRepo")(emptyRepo.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

