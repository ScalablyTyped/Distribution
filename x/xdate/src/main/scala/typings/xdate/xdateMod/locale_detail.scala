package typings.xdate.xdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait locale_detail extends js.Object {
  var amDesignator: js.UndefOr[String] = js.undefined
  var dayNames: js.UndefOr[js.Array[String]] = js.undefined
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  var pmDesignator: js.UndefOr[String] = js.undefined
}

object locale_detail {
  @scala.inline
  def apply(
    amDesignator: String = null,
    dayNames: js.Array[String] = null,
    dayNamesShort: js.Array[String] = null,
    monthNames: js.Array[String] = null,
    monthNamesShort: js.Array[String] = null,
    pmDesignator: String = null
  ): locale_detail = {
    val __obj = js.Dynamic.literal()
    if (amDesignator != null) __obj.updateDynamic("amDesignator")(amDesignator)
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames)
    if (dayNamesShort != null) __obj.updateDynamic("dayNamesShort")(dayNamesShort)
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames)
    if (monthNamesShort != null) __obj.updateDynamic("monthNamesShort")(monthNamesShort)
    if (pmDesignator != null) __obj.updateDynamic("pmDesignator")(pmDesignator)
    __obj.asInstanceOf[locale_detail]
  }
}

