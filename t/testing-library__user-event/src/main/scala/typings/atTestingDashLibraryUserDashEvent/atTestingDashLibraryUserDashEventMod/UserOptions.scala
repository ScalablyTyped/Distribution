package typings.atTestingDashLibraryUserDashEvent.atTestingDashLibraryUserDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOptions extends js.Object {
  var allAtOnce: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
}

object UserOptions {
  @scala.inline
  def apply(allAtOnce: js.UndefOr[Boolean] = js.undefined, delay: Int | Double = null): UserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allAtOnce)) __obj.updateDynamic("allAtOnce")(allAtOnce.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOptions]
  }
}

