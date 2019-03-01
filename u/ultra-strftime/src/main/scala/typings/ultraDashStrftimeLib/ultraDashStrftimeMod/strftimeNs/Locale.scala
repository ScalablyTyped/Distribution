package typings
package ultraDashStrftimeLib.ultraDashStrftimeMod.strftimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var AM: java.lang.String
  var PM: java.lang.String
  var am: java.lang.String
  var days: js.Array[java.lang.String]
  var formats: LocaleFormats
  var months: js.Array[java.lang.String]
  var pm: java.lang.String
  var shortDays: js.Array[java.lang.String]
  var shortMonths: js.Array[java.lang.String]
}

object Locale {
  @scala.inline
  def apply(
    AM: java.lang.String,
    PM: java.lang.String,
    am: java.lang.String,
    days: js.Array[java.lang.String],
    formats: LocaleFormats,
    months: js.Array[java.lang.String],
    pm: java.lang.String,
    shortDays: js.Array[java.lang.String],
    shortMonths: js.Array[java.lang.String]
  ): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AM")(AM)
    __obj.updateDynamic("PM")(PM)
    __obj.updateDynamic("am")(am)
    __obj.updateDynamic("days")(days)
    __obj.updateDynamic("formats")(formats)
    __obj.updateDynamic("months")(months)
    __obj.updateDynamic("pm")(pm)
    __obj.updateDynamic("shortDays")(shortDays)
    __obj.updateDynamic("shortMonths")(shortMonths)
    __obj.asInstanceOf[Locale]
  }
}

