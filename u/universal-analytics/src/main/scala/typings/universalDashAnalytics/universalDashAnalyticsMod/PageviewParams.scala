package typings.universalDashAnalytics.universalDashAnalyticsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageviewParams
  extends /* key */ StringDictionary[js.Any] {
  var dh: js.UndefOr[String] = js.undefined
  var dl: js.UndefOr[String] = js.undefined
  var dp: js.UndefOr[String] = js.undefined
  var dt: js.UndefOr[String] = js.undefined
}

object PageviewParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    dh: String = null,
    dl: String = null,
    dp: String = null,
    dt: String = null
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

