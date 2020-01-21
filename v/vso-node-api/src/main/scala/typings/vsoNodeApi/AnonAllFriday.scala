package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllFriday extends js.Object {
  var all: Double
  var friday: Double
  var monday: Double
  var none: Double
  var saturday: Double
  var sunday: Double
  var thursday: Double
  var tuesday: Double
  var wednesday: Double
}

object AnonAllFriday {
  @scala.inline
  def apply(
    all: Double,
    friday: Double,
    monday: Double,
    none: Double,
    saturday: Double,
    sunday: Double,
    thursday: Double,
    tuesday: Double,
    wednesday: Double
  ): AnonAllFriday = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], friday = friday.asInstanceOf[js.Any], monday = monday.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], saturday = saturday.asInstanceOf[js.Any], sunday = sunday.asInstanceOf[js.Any], thursday = thursday.asInstanceOf[js.Any], tuesday = tuesday.asInstanceOf[js.Any], wednesday = wednesday.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllFriday]
  }
}

