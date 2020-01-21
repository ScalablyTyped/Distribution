package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionParams
  extends /* key */ StringDictionary[js.Any] {
  var p: js.UndefOr[String] = js.undefined
  var ta: js.UndefOr[String] = js.undefined
  var ti: js.UndefOr[String] = js.undefined
  var tr: js.UndefOr[String | Double] = js.undefined
  var ts: js.UndefOr[String | Double] = js.undefined
  var tt: js.UndefOr[String | Double] = js.undefined
}

object TransactionParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    p: String = null,
    ta: String = null,
    ti: String = null,
    tr: String | Double = null,
    ts: String | Double = null,
    tt: String | Double = null
  ): TransactionParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (ta != null) __obj.updateDynamic("ta")(ta.asInstanceOf[js.Any])
    if (ti != null) __obj.updateDynamic("ti")(ti.asInstanceOf[js.Any])
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (tt != null) __obj.updateDynamic("tt")(tt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionParams]
  }
}

