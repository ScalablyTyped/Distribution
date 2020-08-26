package typings.wordpressComponents.dateTimeMod.DateTimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@wordpress/components.@wordpress/components/date-time/date.default.Props, 'isInvalidDate'> */
@js.native
trait Props extends js.Object {
  var currentDate: js.UndefOr[String] = js.native
  var is12Hour: js.UndefOr[Boolean] = js.native
  var onChange: js.Function1[/* currentDate */ String, Unit] = js.native
}

object Props {
  @scala.inline
  def apply(onChange: /* currentDate */ String => Unit): Props = {
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
    def setOnChange(value: /* currentDate */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrentDate(value: String): Self = this.set("currentDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDate: Self = this.set("currentDate", js.undefined)
    @scala.inline
    def setIs12Hour(value: Boolean): Self = this.set("is12Hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs12Hour: Self = this.set("is12Hour", js.undefined)
  }
  
}

