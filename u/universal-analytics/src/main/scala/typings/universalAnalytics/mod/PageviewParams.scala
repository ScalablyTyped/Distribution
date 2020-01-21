package typings.universalAnalytics.mod

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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dh != null) __obj.updateDynamic("dh")(dh.asInstanceOf[js.Any])
    if (dl != null) __obj.updateDynamic("dl")(dl.asInstanceOf[js.Any])
    if (dp != null) __obj.updateDynamic("dp")(dp.asInstanceOf[js.Any])
    if (dt != null) __obj.updateDynamic("dt")(dt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageviewParams]
  }
}

