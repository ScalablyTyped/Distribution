package typings.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeOptions extends js.Object {
  var prepend: js.UndefOr[Boolean] = js.undefined
}

object SubscribeOptions {
  @scala.inline
  def apply(prepend: js.UndefOr[Boolean] = js.undefined): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(prepend)) __obj.updateDynamic("prepend")(prepend.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
}

