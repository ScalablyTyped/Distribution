package typings.wampy.wampyMod

import typings.wampy.wampyStrings.first
import typings.wampy.wampyStrings.last
import typings.wampy.wampyStrings.prefix
import typings.wampy.wampyStrings.random
import typings.wampy.wampyStrings.roundrobin
import typings.wampy.wampyStrings.single
import typings.wampy.wampyStrings.wildcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterAdvancedOptions extends js.Object {
  var invoke: js.UndefOr[single | roundrobin | random | first | last] = js.undefined
  var `match`: js.UndefOr[prefix | wildcard] = js.undefined
}

object RegisterAdvancedOptions {
  @scala.inline
  def apply(invoke: single | roundrobin | random | first | last = null, `match`: prefix | wildcard = null): RegisterAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (invoke != null) __obj.updateDynamic("invoke")(invoke.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterAdvancedOptions]
  }
}

