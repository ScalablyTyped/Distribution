package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary containing `daysOfWeek` and `week`.
  */
@js.native
trait daysOfTheWeekDictionary extends js.Object {
  /**
    * The day of the week. Values are from 1 to 7, with Sunday being 1.
    */
  var daysOfWeek: js.UndefOr[Double] = js.native
  /**
    * The week number of the day of the week.
    * Values range from -53 to 53. A negative value indicates a value from the end of
    * the range. 0 indicates the week number is irrelevant.
    */
  var week: js.UndefOr[Double] = js.native
}

object daysOfTheWeekDictionary {
  @scala.inline
  def apply(): daysOfTheWeekDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[daysOfTheWeekDictionary]
  }
  @scala.inline
  implicit class daysOfTheWeekDictionaryOps[Self <: daysOfTheWeekDictionary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDaysOfWeek(value: Double): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaysOfWeek: Self = this.set("daysOfWeek", js.undefined)
    @scala.inline
    def setWeek(value: Double): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
  }
  
}

