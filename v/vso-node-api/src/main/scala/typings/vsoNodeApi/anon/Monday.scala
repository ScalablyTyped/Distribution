package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Monday extends js.Object {
  var friday: scala.Double = js.native
  var monday: scala.Double = js.native
  var saturday: scala.Double = js.native
  var sunday: scala.Double = js.native
  var thursday: scala.Double = js.native
  var tuesday: scala.Double = js.native
  var wednesday: scala.Double = js.native
}

object Monday {
  @scala.inline
  def apply(
    friday: scala.Double,
    monday: scala.Double,
    saturday: scala.Double,
    sunday: scala.Double,
    thursday: scala.Double,
    tuesday: scala.Double,
    wednesday: scala.Double
  ): Monday = {
    val __obj = js.Dynamic.literal(friday = friday.asInstanceOf[js.Any], monday = monday.asInstanceOf[js.Any], saturday = saturday.asInstanceOf[js.Any], sunday = sunday.asInstanceOf[js.Any], thursday = thursday.asInstanceOf[js.Any], tuesday = tuesday.asInstanceOf[js.Any], wednesday = wednesday.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monday]
  }
  @scala.inline
  implicit class MondayOps[Self <: Monday] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFriday(value: scala.Double): Self = this.set("friday", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonday(value: scala.Double): Self = this.set("monday", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaturday(value: scala.Double): Self = this.set("saturday", value.asInstanceOf[js.Any])
    @scala.inline
    def setSunday(value: scala.Double): Self = this.set("sunday", value.asInstanceOf[js.Any])
    @scala.inline
    def setThursday(value: scala.Double): Self = this.set("thursday", value.asInstanceOf[js.Any])
    @scala.inline
    def setTuesday(value: scala.Double): Self = this.set("tuesday", value.asInstanceOf[js.Any])
    @scala.inline
    def setWednesday(value: scala.Double): Self = this.set("wednesday", value.asInstanceOf[js.Any])
  }
  
}

