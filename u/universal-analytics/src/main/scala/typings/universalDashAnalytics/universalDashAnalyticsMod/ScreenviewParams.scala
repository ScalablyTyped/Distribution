package typings.universalDashAnalytics.universalDashAnalyticsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenviewParams
  extends /* key */ StringDictionary[js.Any] {
  var aid: js.UndefOr[String] = js.undefined
  var aiid: js.UndefOr[String] = js.undefined
  var an: js.UndefOr[String] = js.undefined
  var av: js.UndefOr[String] = js.undefined
  var cd: js.UndefOr[String] = js.undefined
}

object ScreenviewParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    aid: String = null,
    aiid: String = null,
    an: String = null,
    av: String = null,
    cd: String = null
  ): ScreenviewParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (aid != null) __obj.updateDynamic("aid")(aid.asInstanceOf[js.Any])
    if (aiid != null) __obj.updateDynamic("aiid")(aiid.asInstanceOf[js.Any])
    if (an != null) __obj.updateDynamic("an")(an.asInstanceOf[js.Any])
    if (av != null) __obj.updateDynamic("av")(av.asInstanceOf[js.Any])
    if (cd != null) __obj.updateDynamic("cd")(cd.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenviewParams]
  }
}

