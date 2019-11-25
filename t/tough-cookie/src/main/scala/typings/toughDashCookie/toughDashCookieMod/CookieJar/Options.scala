package typings.toughDashCookie.toughDashCookieMod.CookieJar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var looseMode: js.UndefOr[Boolean] = js.undefined
  var rejectPublicSuffixes: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    looseMode: js.UndefOr[Boolean] = js.undefined,
    rejectPublicSuffixes: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(looseMode)) __obj.updateDynamic("looseMode")(looseMode.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectPublicSuffixes)) __obj.updateDynamic("rejectPublicSuffixes")(rejectPublicSuffixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

