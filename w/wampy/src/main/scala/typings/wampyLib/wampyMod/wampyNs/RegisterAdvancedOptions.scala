package typings
package wampyLib.wampyMod.wampyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RegisterAdvancedOptions extends js.Object {
  var invoke: js.UndefOr[
    wampyLib.wampyLibStrings.single | wampyLib.wampyLibStrings.roundrobin | wampyLib.wampyLibStrings.random | wampyLib.wampyLibStrings.first | wampyLib.wampyLibStrings.last
  ] = js.undefined
  var `match`: js.UndefOr[wampyLib.wampyLibStrings.prefix | wampyLib.wampyLibStrings.wildcard] = js.undefined
}

