package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenviewParams
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var aid: js.UndefOr[java.lang.String] = js.undefined
  var aiid: js.UndefOr[java.lang.String] = js.undefined
  var an: js.UndefOr[java.lang.String] = js.undefined
  var av: js.UndefOr[java.lang.String] = js.undefined
  var cd: js.UndefOr[java.lang.String] = js.undefined
}

object ScreenviewParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    aid: java.lang.String = null,
    aiid: java.lang.String = null,
    an: java.lang.String = null,
    av: java.lang.String = null,
    cd: java.lang.String = null
  ): ScreenviewParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (aid != null) __obj.updateDynamic("aid")(aid)
    if (aiid != null) __obj.updateDynamic("aiid")(aiid)
    if (an != null) __obj.updateDynamic("an")(an)
    if (av != null) __obj.updateDynamic("av")(av)
    if (cd != null) __obj.updateDynamic("cd")(cd)
    __obj.asInstanceOf[ScreenviewParams]
  }
}

