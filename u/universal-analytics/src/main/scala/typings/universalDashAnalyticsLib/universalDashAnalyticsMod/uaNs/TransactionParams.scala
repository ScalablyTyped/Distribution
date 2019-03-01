package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionParams
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var p: js.UndefOr[java.lang.String] = js.undefined
  var ta: js.UndefOr[java.lang.String] = js.undefined
  var ti: js.UndefOr[java.lang.String] = js.undefined
  var tr: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var ts: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var tt: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object TransactionParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    p: java.lang.String = null,
    ta: java.lang.String = null,
    ti: java.lang.String = null,
    tr: java.lang.String | scala.Double = null,
    ts: java.lang.String | scala.Double = null,
    tt: java.lang.String | scala.Double = null
  ): TransactionParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (p != null) __obj.updateDynamic("p")(p)
    if (ta != null) __obj.updateDynamic("ta")(ta)
    if (ti != null) __obj.updateDynamic("ti")(ti)
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (tt != null) __obj.updateDynamic("tt")(tt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionParams]
  }
}

