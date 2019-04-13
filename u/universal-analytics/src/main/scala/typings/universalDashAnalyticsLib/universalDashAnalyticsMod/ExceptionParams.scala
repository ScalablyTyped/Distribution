package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionParams
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var exd: js.UndefOr[java.lang.String] = js.undefined
  var exf: js.UndefOr[scala.Boolean] = js.undefined
}

object ExceptionParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    exd: java.lang.String = null,
    exf: js.UndefOr[scala.Boolean] = js.undefined
  ): ExceptionParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (exd != null) __obj.updateDynamic("exd")(exd)
    if (!js.isUndefined(exf)) __obj.updateDynamic("exf")(exf)
    __obj.asInstanceOf[ExceptionParams]
  }
}

