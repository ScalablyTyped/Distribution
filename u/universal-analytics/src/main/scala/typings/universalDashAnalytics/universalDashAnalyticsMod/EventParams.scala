package typings.universalDashAnalytics.universalDashAnalyticsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventParams
  extends /* key */ StringDictionary[js.Any] {
  var dp: js.UndefOr[String] = js.undefined
  var ea: js.UndefOr[String] = js.undefined
  var ec: js.UndefOr[String] = js.undefined
  var el: js.UndefOr[String] = js.undefined
  var ev: js.UndefOr[String | Double] = js.undefined
  var p: js.UndefOr[String] = js.undefined
}

object EventParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    dp: String = null,
    ea: String = null,
    ec: String = null,
    el: String = null,
    ev: String | Double = null,
    p: String = null
  ): EventParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dp != null) __obj.updateDynamic("dp")(dp.asInstanceOf[js.Any])
    if (ea != null) __obj.updateDynamic("ea")(ea.asInstanceOf[js.Any])
    if (ec != null) __obj.updateDynamic("ec")(ec.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (ev != null) __obj.updateDynamic("ev")(ev.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParams]
  }
}

