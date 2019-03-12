package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarFactory extends js.Object {
  def createCalendar(
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    calendar: java.lang.String,
    clock: java.lang.String
  ): Calendar
  def createCalendarDefaultCalendarAndClock(languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): Calendar
}

object ICalendarFactory {
  @scala.inline
  def apply(
    createCalendar: (winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], java.lang.String, java.lang.String) => Calendar,
    createCalendarDefaultCalendarAndClock: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String] => Calendar
  ): ICalendarFactory = {
    val __obj = js.Dynamic.literal(createCalendar = js.Any.fromFunction3(createCalendar), createCalendarDefaultCalendarAndClock = js.Any.fromFunction1(createCalendarDefaultCalendarAndClock))
  
    __obj.asInstanceOf[ICalendarFactory]
  }
}

