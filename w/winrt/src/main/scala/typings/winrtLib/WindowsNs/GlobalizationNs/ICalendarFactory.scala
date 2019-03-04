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
    createCalendar: js.Function3[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], 
      java.lang.String, 
      java.lang.String, 
      Calendar
    ],
    createCalendarDefaultCalendarAndClock: js.Function1[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], 
      Calendar
    ]
  ): ICalendarFactory = {
    val __obj = js.Dynamic.literal(createCalendar = createCalendar, createCalendarDefaultCalendarAndClock = createCalendarDefaultCalendarAndClock)
  
    __obj.asInstanceOf[ICalendarFactory]
  }
}

