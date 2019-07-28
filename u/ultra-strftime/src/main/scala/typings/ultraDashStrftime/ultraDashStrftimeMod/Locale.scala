package typings.ultraDashStrftime.ultraDashStrftimeMod

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
    val __obj = js.Dynamic.literal(AM = AM, PM = PM, am = am, days = days, formats = formats, months = months, pm = pm, shortDays = shortDays, shortMonths = shortMonths)
  
    __obj.asInstanceOf[Locale]
  }
}

