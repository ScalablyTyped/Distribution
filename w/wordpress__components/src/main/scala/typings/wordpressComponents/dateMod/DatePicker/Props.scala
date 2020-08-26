package typings.wordpressComponents.dateMod.DatePicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * The current date and time at initialization. Optionally pass in `null`
    * to specify no date is currently selected. Defaults to current date.
    */
  var currentDate: js.UndefOr[String] = js.native
  /**
    * Whether we use a 12-hour clock. With a 12-hour clock, an AM/PM
    * widget is displayed and the time format is assumed to be MM-DD-YYYY.
    */
  var is12Hour: js.UndefOr[Boolean] = js.native
  /**
    * A callback function that should return a `boolean` to signify if the
    * day is valid or not.
    */
  var isInvalidDate: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.native
  /**
    * Function to call when the date value changes.
    */
  def onChange(currentDate: String): Unit = js.native
}

object Props {
  @scala.inline
  def apply(onChange: String => Unit): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setOnChange(value: String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrentDate(value: String): Self = this.set("currentDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDate: Self = this.set("currentDate", js.undefined)
    @scala.inline
    def setIs12Hour(value: Boolean): Self = this.set("is12Hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs12Hour: Self = this.set("is12Hour", js.undefined)
    @scala.inline
    def setIsInvalidDate(value: /* date */ Date => Boolean): Self = this.set("isInvalidDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsInvalidDate: Self = this.set("isInvalidDate", js.undefined)
  }
  
}

