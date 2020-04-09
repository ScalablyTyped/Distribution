package typings.toughCookie.mod.CookieJar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowSpecialUseDomain: js.UndefOr[Boolean] = js.undefined
  var looseMode: js.UndefOr[Boolean] = js.undefined
  var prefixSecurity: js.UndefOr[String] = js.undefined
  var rejectPublicSuffixes: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowSpecialUseDomain: js.UndefOr[Boolean] = js.undefined,
    looseMode: js.UndefOr[Boolean] = js.undefined,
    prefixSecurity: String = null,
    rejectPublicSuffixes: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSpecialUseDomain)) __obj.updateDynamic("allowSpecialUseDomain")(allowSpecialUseDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(looseMode)) __obj.updateDynamic("looseMode")(looseMode.asInstanceOf[js.Any])
    if (prefixSecurity != null) __obj.updateDynamic("prefixSecurity")(prefixSecurity.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectPublicSuffixes)) __obj.updateDynamic("rejectPublicSuffixes")(rejectPublicSuffixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

