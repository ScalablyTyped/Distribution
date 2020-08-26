package typings.winrt.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarFactory extends js.Object {
  def createCalendar(languages: IIterable[String], calendar: String, clock: String): Calendar = js.native
  def createCalendarDefaultCalendarAndClock(languages: IIterable[String]): Calendar = js.native
}

object ICalendarFactory {
  @scala.inline
  def apply(
    createCalendar: (IIterable[String], String, String) => Calendar,
    createCalendarDefaultCalendarAndClock: IIterable[String] => Calendar
  ): ICalendarFactory = {
    val __obj = js.Dynamic.literal(createCalendar = js.Any.fromFunction3(createCalendar), createCalendarDefaultCalendarAndClock = js.Any.fromFunction1(createCalendarDefaultCalendarAndClock))
    __obj.asInstanceOf[ICalendarFactory]
  }
  @scala.inline
  implicit class ICalendarFactoryOps[Self <: ICalendarFactory] (val x: Self) extends AnyVal {
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
    def setCreateCalendar(value: (IIterable[String], String, String) => Calendar): Self = this.set("createCalendar", js.Any.fromFunction3(value))
    @scala.inline
    def setCreateCalendarDefaultCalendarAndClock(value: IIterable[String] => Calendar): Self = this.set("createCalendarDefaultCalendarAndClock", js.Any.fromFunction1(value))
  }
  
}

