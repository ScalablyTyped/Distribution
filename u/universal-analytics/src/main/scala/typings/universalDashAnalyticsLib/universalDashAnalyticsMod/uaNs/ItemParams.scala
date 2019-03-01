package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemParams
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var ic: js.UndefOr[java.lang.String] = js.undefined
  var in: js.UndefOr[java.lang.String] = js.undefined
  var ip: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var iq: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var iv: js.UndefOr[java.lang.String] = js.undefined
  var p: js.UndefOr[java.lang.String] = js.undefined
  var ti: js.UndefOr[java.lang.String] = js.undefined
}

object ItemParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ic: java.lang.String = null,
    in: java.lang.String = null,
    ip: java.lang.String | scala.Double = null,
    iq: java.lang.String | scala.Double = null,
    iv: java.lang.String = null,
    p: java.lang.String = null,
    ti: java.lang.String = null
  ): ItemParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ic != null) __obj.updateDynamic("ic")(ic)
    if (in != null) __obj.updateDynamic("in")(in)
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (iq != null) __obj.updateDynamic("iq")(iq.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv)
    if (p != null) __obj.updateDynamic("p")(p)
    if (ti != null) __obj.updateDynamic("ti")(ti)
    __obj.asInstanceOf[ItemParams]
  }
}

