package typings.winrt.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarFactory extends js.Object {
  def createCalendar(languages: IIterable[String], calendar: String, clock: String): Calendar
  def createCalendarDefaultCalendarAndClock(languages: IIterable[String]): Calendar
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
}

