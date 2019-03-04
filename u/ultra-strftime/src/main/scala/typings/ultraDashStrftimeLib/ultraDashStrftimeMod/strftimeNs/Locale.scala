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
    val __obj = js.Dynamic.literal(AM = AM, PM = PM, am = am, days = days, formats = formats, months = months, pm = pm, shortDays = shortDays, shortMonths = shortMonths)
  
    __obj.asInstanceOf[Locale]
  }
}

