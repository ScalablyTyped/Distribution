package typings.xdate.xdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait formatters_info extends js.Object {
  var i: js.UndefOr[String] = js.undefined
  var u: js.UndefOr[String] = js.undefined
  var vvv: js.UndefOr[js.Function2[/* xdate */ XDate, /* useutc */ Boolean, String]] = js.undefined
  var xxx: js.UndefOr[String] = js.undefined
}

object formatters_info {
  @scala.inline
  def apply(
    i: String = null,
    u: String = null,
    vvv: (/* xdate */ XDate, /* useutc */ Boolean) => String = null,
    xxx: String = null
  ): formatters_info = {
    val __obj = js.Dynamic.literal()
    if (i != null) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (u != null) __obj.updateDynamic("u")(u.asInstanceOf[js.Any])
    if (vvv != null) __obj.updateDynamic("vvv")(js.Any.fromFunction2(vvv))
    if (xxx != null) __obj.updateDynamic("xxx")(xxx.asInstanceOf[js.Any])
    __obj.asInstanceOf[formatters_info]
  }
}

