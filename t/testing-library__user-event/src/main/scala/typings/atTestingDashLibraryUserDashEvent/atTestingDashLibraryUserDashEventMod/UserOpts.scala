package typings.atTestingDashLibraryUserDashEvent.atTestingDashLibraryUserDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOpts extends js.Object {
  var allAtOnce: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
}

object UserOpts {
  @scala.inline
  def apply(allAtOnce: js.UndefOr[Boolean] = js.undefined, delay: Int | Double = null): UserOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allAtOnce)) __obj.updateDynamic("allAtOnce")(allAtOnce)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOpts]
  }
}

