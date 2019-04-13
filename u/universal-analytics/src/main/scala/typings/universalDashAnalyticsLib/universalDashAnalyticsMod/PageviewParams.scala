package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageviewParams
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var dh: js.UndefOr[java.lang.String] = js.undefined
  var dl: js.UndefOr[java.lang.String] = js.undefined
  var dp: js.UndefOr[java.lang.String] = js.undefined
  var dt: js.UndefOr[java.lang.String] = js.undefined
}

object PageviewParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dh: java.lang.String = null,
    dl: java.lang.String = null,
    dp: java.lang.String = null,
    dt: java.lang.String = null
  ): PageviewParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dh != null) __obj.updateDynamic("dh")(dh)
    if (dl != null) __obj.updateDynamic("dl")(dl)
    if (dp != null) __obj.updateDynamic("dp")(dp)
    if (dt != null) __obj.updateDynamic("dt")(dt)
    __obj.asInstanceOf[PageviewParams]
  }
}

