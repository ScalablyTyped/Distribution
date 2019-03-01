package typings
package toughDashCookieLib.toughDashCookieMod.CookieJarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var looseMode: js.UndefOr[scala.Boolean] = js.undefined
  var rejectPublicSuffixes: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    looseMode: js.UndefOr[scala.Boolean] = js.undefined,
    rejectPublicSuffixes: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(looseMode)) __obj.updateDynamic("looseMode")(looseMode)
    if (!js.isUndefined(rejectPublicSuffixes)) __obj.updateDynamic("rejectPublicSuffixes")(rejectPublicSuffixes)
    __obj.asInstanceOf[Options]
  }
}

