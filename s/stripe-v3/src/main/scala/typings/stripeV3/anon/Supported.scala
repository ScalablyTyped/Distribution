package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Supported extends js.Object {
  var supported: js.UndefOr[Boolean] = js.undefined
}

object Supported {
  @scala.inline
  def apply(supported: js.UndefOr[Boolean] = js.undefined): Supported = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(supported)) __obj.updateDynamic("supported")(supported.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Supported]
  }
}

