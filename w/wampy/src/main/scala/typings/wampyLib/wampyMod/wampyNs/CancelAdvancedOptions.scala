package typings
package wampyLib.wampyMod.wampyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelAdvancedOptions extends js.Object {
  var mode: js.UndefOr[
    wampyLib.wampyLibStrings.skip | wampyLib.wampyLibStrings.kill | wampyLib.wampyLibStrings.killnowait
  ] = js.undefined
}

object CancelAdvancedOptions {
  @scala.inline
  def apply(
    mode: wampyLib.wampyLibStrings.skip | wampyLib.wampyLibStrings.kill | wampyLib.wampyLibStrings.killnowait = null
  ): CancelAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAdvancedOptions]
  }
}

