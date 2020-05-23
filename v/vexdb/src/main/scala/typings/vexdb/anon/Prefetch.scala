package typings.vexdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prefetch extends js.Object {
  var prefetch: js.UndefOr[Boolean] = js.undefined
}

object Prefetch {
  @scala.inline
  def apply(prefetch: js.UndefOr[Boolean] = js.undefined): Prefetch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefetch]
  }
}

