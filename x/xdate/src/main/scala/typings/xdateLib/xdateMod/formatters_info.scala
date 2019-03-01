package typings
package xdateLib.xdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait formatters_info extends js.Object {
  var i: js.UndefOr[java.lang.String] = js.undefined
  var u: js.UndefOr[java.lang.String] = js.undefined
  var vvv: js.UndefOr[js.Function2[/* xdate */ XDate, /* useutc */ scala.Boolean, java.lang.String]] = js.undefined
  var xxx: js.UndefOr[java.lang.String] = js.undefined
}

object formatters_info {
  @scala.inline
  def apply(
    i: java.lang.String = null,
    u: java.lang.String = null,
    vvv: js.Function2[/* xdate */ XDate, /* useutc */ scala.Boolean, java.lang.String] = null,
    xxx: java.lang.String = null
  ): formatters_info = {
    val __obj = js.Dynamic.literal()
    if (i != null) __obj.updateDynamic("i")(i)
    if (u != null) __obj.updateDynamic("u")(u)
    if (vvv != null) __obj.updateDynamic("vvv")(vvv)
    if (xxx != null) __obj.updateDynamic("xxx")(xxx)
    __obj.asInstanceOf[formatters_info]
  }
}

