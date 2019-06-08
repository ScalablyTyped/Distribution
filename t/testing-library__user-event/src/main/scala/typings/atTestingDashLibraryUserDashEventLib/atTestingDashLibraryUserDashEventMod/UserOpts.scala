package typings
package atTestingDashLibraryUserDashEventLib.atTestingDashLibraryUserDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOpts extends js.Object {
  var allAtOnce: js.UndefOr[scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
}

object UserOpts {
  @scala.inline
  def apply(allAtOnce: js.UndefOr[scala.Boolean] = js.undefined, delay: scala.Int | scala.Double = null): UserOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allAtOnce)) __obj.updateDynamic("allAtOnce")(allAtOnce)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOpts]
  }
}

