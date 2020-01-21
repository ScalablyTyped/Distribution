package typings.timezonecomplete.basicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeComponents extends js.Object {
  /**
    * Day of month 1-31
    */
  var day: Double
  /**
    * Hour 0-23
    */
  var hour: Double
  /**
    * Millisecond 0-999
    */
  var milli: Double
  /**
    * Minute
    */
  var minute: Double
  /**
    * Month 1-12
    */
  var month: Double
  /**
    * Second
    */
  var second: Double
  /**
    * Year
    */
  var year: Double
}

object TimeComponents {
  @scala.inline
  def apply(
    day: Double,
    hour: Double,
    milli: Double,
    minute: Double,
    month: Double,
    second: Double,
    year: Double
  ): TimeComponents = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], milli = milli.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimeComponents]
  }
}

