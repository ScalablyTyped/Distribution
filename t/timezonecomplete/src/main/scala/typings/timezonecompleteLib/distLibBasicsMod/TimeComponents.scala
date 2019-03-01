package typings
package timezonecompleteLib.distLibBasicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeComponents extends js.Object {
  /**
    * Day of month 1-31
    */
  var day: scala.Double
  /**
    * Hour 0-23
    */
  var hour: scala.Double
  /**
    * Millisecond 0-999
    */
  var milli: scala.Double
  /**
    * Minute
    */
  var minute: scala.Double
  /**
    * Month 1-12
    */
  var month: scala.Double
  /**
    * Second
    */
  var second: scala.Double
  /**
    * Year
    */
  var year: scala.Double
}

object TimeComponents {
  @scala.inline
  def apply(
    day: scala.Double,
    hour: scala.Double,
    milli: scala.Double,
    minute: scala.Double,
    month: scala.Double,
    second: scala.Double,
    year: scala.Double
  ): TimeComponents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("hour")(hour)
    __obj.updateDynamic("milli")(milli)
    __obj.updateDynamic("minute")(minute)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("second")(second)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[TimeComponents]
  }
}

