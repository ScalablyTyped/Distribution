package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Friday extends js.Object {
  var all: scala.Double
  var friday: scala.Double
  var monday: scala.Double
  var none: scala.Double
  var saturday: scala.Double
  var sunday: scala.Double
  var thursday: scala.Double
  var tuesday: scala.Double
  var wednesday: scala.Double
}

object Friday {
  @scala.inline
  def apply(
    all: scala.Double,
    friday: scala.Double,
    monday: scala.Double,
    none: scala.Double,
    saturday: scala.Double,
    sunday: scala.Double,
    thursday: scala.Double,
    tuesday: scala.Double,
    wednesday: scala.Double
  ): Friday = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], friday = friday.asInstanceOf[js.Any], monday = monday.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], saturday = saturday.asInstanceOf[js.Any], sunday = sunday.asInstanceOf[js.Any], thursday = thursday.asInstanceOf[js.Any], tuesday = tuesday.asInstanceOf[js.Any], wednesday = wednesday.asInstanceOf[js.Any])
    __obj.asInstanceOf[Friday]
  }
}

