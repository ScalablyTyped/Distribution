package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDay extends js.Object {
  /**
    * The day of birth, between 1 and 31.
    */
  var day: Double
  /**
    * The month of birth, between 1 and 12.
    */
  var month: Double
  /**
    * The four-digit year of birth.
    */
  var year: Double
}

object AnonDay {
  @scala.inline
  def apply(day: Double, month: Double, year: Double): AnonDay = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDay]
  }
}

