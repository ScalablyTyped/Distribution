package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingParams
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var utc: js.UndefOr[java.lang.String] = js.undefined
  var utl: js.UndefOr[java.lang.String] = js.undefined
  var utt: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var utv: js.UndefOr[java.lang.String] = js.undefined
}

object TimingParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    utc: java.lang.String = null,
    utl: java.lang.String = null,
    utt: java.lang.String | scala.Double = null,
    utv: java.lang.String = null
  ): TimingParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (utc != null) __obj.updateDynamic("utc")(utc)
    if (utl != null) __obj.updateDynamic("utl")(utl)
    if (utt != null) __obj.updateDynamic("utt")(utt.asInstanceOf[js.Any])
    if (utv != null) __obj.updateDynamic("utv")(utv)
    __obj.asInstanceOf[TimingParams]
  }
}

