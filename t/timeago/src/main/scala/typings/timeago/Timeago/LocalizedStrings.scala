package typings.timeago.Timeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedStrings extends js.Object {
  var day: String | DynamicMessage
  var days: String | DynamicMessage
  var hour: String | DynamicMessage
  var hours: String | DynamicMessage
  var inPast: String
  var minute: String | DynamicMessage
  var minutes: String | DynamicMessage
  var month: String | DynamicMessage
  var months: String | DynamicMessage
  var numbers: js.Array[String]
  var prefixAgo: String | Null
  var prefixFromNow: String | Null
  var seconds: String | DynamicMessage
  var suffixAgo: String | Null
  var suffixFromNow: String | Null
  var wordSeparator: String
  var year: String | DynamicMessage
  var years: String | DynamicMessage
}

object LocalizedStrings {
  @scala.inline
  def apply(
    day: String | DynamicMessage,
    days: String | DynamicMessage,
    hour: String | DynamicMessage,
    hours: String | DynamicMessage,
    inPast: String,
    minute: String | DynamicMessage,
    minutes: String | DynamicMessage,
    month: String | DynamicMessage,
    months: String | DynamicMessage,
    numbers: js.Array[String],
    seconds: String | DynamicMessage,
    wordSeparator: String,
    year: String | DynamicMessage,
    years: String | DynamicMessage,
    prefixAgo: String = null,
    prefixFromNow: String = null,
    suffixAgo: String = null,
    suffixFromNow: String = null
  ): LocalizedStrings = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], inPast = inPast, minute = minute.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], numbers = numbers, seconds = seconds.asInstanceOf[js.Any], wordSeparator = wordSeparator, year = year.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    if (prefixAgo != null) __obj.updateDynamic("prefixAgo")(prefixAgo)
    if (prefixFromNow != null) __obj.updateDynamic("prefixFromNow")(prefixFromNow)
    if (suffixAgo != null) __obj.updateDynamic("suffixAgo")(suffixAgo)
    if (suffixFromNow != null) __obj.updateDynamic("suffixFromNow")(suffixFromNow)
    __obj.asInstanceOf[LocalizedStrings]
  }
}

