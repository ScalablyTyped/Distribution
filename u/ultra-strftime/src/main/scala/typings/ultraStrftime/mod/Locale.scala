package typings.ultraStrftime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var AM: String
  var PM: String
  var am: String
  var days: js.Array[String]
  var formats: LocaleFormats
  var months: js.Array[String]
  var pm: String
  var shortDays: js.Array[String]
  var shortMonths: js.Array[String]
}

object Locale {
  @scala.inline
  def apply(
    AM: String,
    PM: String,
    am: String,
    days: js.Array[String],
    formats: LocaleFormats,
    months: js.Array[String],
    pm: String,
    shortDays: js.Array[String],
    shortMonths: js.Array[String]
  ): Locale = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], am = am.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Locale]
  }
}

