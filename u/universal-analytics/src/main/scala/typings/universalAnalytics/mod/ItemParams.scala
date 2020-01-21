package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemParams
  extends /* key */ StringDictionary[js.Any] {
  var ic: js.UndefOr[String] = js.undefined
  var in: js.UndefOr[String] = js.undefined
  var ip: js.UndefOr[String | Double] = js.undefined
  var iq: js.UndefOr[String | Double] = js.undefined
  var iv: js.UndefOr[String] = js.undefined
  var p: js.UndefOr[String] = js.undefined
  var ti: js.UndefOr[String] = js.undefined
}

object ItemParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    ic: String = null,
    in: String = null,
    ip: String | Double = null,
    iq: String | Double = null,
    iv: String = null,
    p: String = null,
    ti: String = null
  ): ItemParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ic != null) __obj.updateDynamic("ic")(ic.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (iq != null) __obj.updateDynamic("iq")(iq.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (ti != null) __obj.updateDynamic("ti")(ti.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemParams]
  }
}

