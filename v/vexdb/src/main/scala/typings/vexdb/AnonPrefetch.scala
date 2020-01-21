package typings.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefetch extends js.Object {
  var prefetch: js.UndefOr[Boolean] = js.undefined
}

object AnonPrefetch {
  @scala.inline
  def apply(prefetch: js.UndefOr[Boolean] = js.undefined): AnonPrefetch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrefetch]
  }
}

