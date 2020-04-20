package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMonday extends js.Object {
  var friday: Double
  var monday: Double
  var saturday: Double
  var sunday: Double
  var thursday: Double
  var tuesday: Double
  var wednesday: Double
}

object AnonMonday {
  @scala.inline
  def apply(
    friday: Double,
    monday: Double,
    saturday: Double,
    sunday: Double,
    thursday: Double,
    tuesday: Double,
    wednesday: Double
  ): AnonMonday = {
    val __obj = js.Dynamic.literal(friday = friday.asInstanceOf[js.Any], monday = monday.asInstanceOf[js.Any], saturday = saturday.asInstanceOf[js.Any], sunday = sunday.asInstanceOf[js.Any], thursday = thursday.asInstanceOf[js.Any], tuesday = tuesday.asInstanceOf[js.Any], wednesday = wednesday.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMonday]
  }
}

