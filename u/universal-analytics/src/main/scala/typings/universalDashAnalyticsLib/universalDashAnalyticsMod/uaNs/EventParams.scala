package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventParams
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var dp: js.UndefOr[java.lang.String] = js.undefined
  var ea: js.UndefOr[java.lang.String] = js.undefined
  var ec: js.UndefOr[java.lang.String] = js.undefined
  var el: js.UndefOr[java.lang.String] = js.undefined
  var ev: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var p: js.UndefOr[java.lang.String] = js.undefined
}

object EventParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dp: java.lang.String = null,
    ea: java.lang.String = null,
    ec: java.lang.String = null,
    el: java.lang.String = null,
    ev: java.lang.String | scala.Double = null,
    p: java.lang.String = null
  ): EventParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dp != null) __obj.updateDynamic("dp")(dp)
    if (ea != null) __obj.updateDynamic("ea")(ea)
    if (ec != null) __obj.updateDynamic("ec")(ec)
    if (el != null) __obj.updateDynamic("el")(el)
    if (ev != null) __obj.updateDynamic("ev")(ev.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p)
    __obj.asInstanceOf[EventParams]
  }
}

