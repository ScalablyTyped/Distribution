package typings
package wampyLib.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterAdvancedOptions extends js.Object {
  var invoke: js.UndefOr[
    wampyLib.wampyLibStrings.single | wampyLib.wampyLibStrings.roundrobin | wampyLib.wampyLibStrings.random | wampyLib.wampyLibStrings.first | wampyLib.wampyLibStrings.last
  ] = js.undefined
  var `match`: js.UndefOr[wampyLib.wampyLibStrings.prefix | wampyLib.wampyLibStrings.wildcard] = js.undefined
}

object RegisterAdvancedOptions {
  @scala.inline
  def apply(
    invoke: wampyLib.wampyLibStrings.single | wampyLib.wampyLibStrings.roundrobin | wampyLib.wampyLibStrings.random | wampyLib.wampyLibStrings.first | wampyLib.wampyLibStrings.last = null,
    `match`: wampyLib.wampyLibStrings.prefix | wampyLib.wampyLibStrings.wildcard = null
  ): RegisterAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (invoke != null) __obj.updateDynamic("invoke")(invoke.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterAdvancedOptions]
  }
}

